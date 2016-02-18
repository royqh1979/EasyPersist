package net.roy.codegenerator.orm.generator;

import net.roy.codegenerator.orm.model.Entity;
import net.roy.codegenerator.orm.model.SingleProperty;
import net.roy.codegenerator.orm.utils.TypeUtils;

/**
 * Created by Roy on 2016/2/18.
 */
public class RowCallbackHandlerGenerator {
    public static StringBuilder createRowCallbackHandler(Entity entity) {
        StringBuilder content=new StringBuilder();
        SingleProperty idProperty = entity.getIdProperty();
        content.append("public class ");
        content.append(CodeUtils.getRowCallbackHandlerClassName(entity));
        content.append(" implements RowCallbackHandler {\n");
        content.append("Map<"+TypeUtils.getShortTypeName(idProperty.getType())+", "+entity.getClassInfo().getName()+"> "+CodeUtils.getEntityMapName(entity)+"=new HashMap<>();\n");
        content.append("@Override\n");

        /* core method, retrive entities from resultSets.
         */
        content.append("public void processRow(ResultSet rs) throws SQLException {\n");
        appendIdDeclareStatement(content, entity);

        CodeUtils.appendEntityDeclareStatement(content,entity);
        content.append(
                String.format("if (!%s.containsKey(%s)) {\n",
                        CodeUtils.getEntityMapName(entity),
                        CodeUtils.getIdVarName(entity)
                        ));
        content.append(entity.getName()+" = TABLE_PREFIXED_ROW_MAPPER.mapRow(rs, 0);\n");
        content.append("} else {\n");
        content.append(String.format("%s = %s.get(%s);\n",
                entity.getName(), CodeUtils.getEntityMapName(entity), CodeUtils.getIdVarName(entity)));
        content.append("}\n");

        content.append(String.format("%s.put(%s, %s);",
                CodeUtils.getEntityMapName(entity), CodeUtils.getIdVarName(entity),
                entity.getName()));
        content.append("}\n");

        content.append("public Collection<"+entity.getClassInfo().getName()
                +"> getResults() {\n");
        content.append("return "+CodeUtils.getEntityMapName(entity)+".values();\n");
        content.append("}\n");

        content.append("public "+entity.getClassInfo().getName()+
                " getSingleResult() {\n");
        content.append("return "+CodeUtils.getEntityMapName(entity)+".values().stream().findFirst().get();\n");
        content.append("}\n");

        content.append("}\n");
        return content;
    }

    private static void appendIdDeclareStatement(StringBuilder content, Entity entity) {
        SingleProperty idProperty=entity.getIdProperty();
        String idType= TypeUtils.getShortTypeName(idProperty.getType());
        String idVar=CodeUtils.getPropertyVarName(entity,idProperty);
        content.append(
                String.format("%s %s = rs.%s(\"%s\");\n",
                        idType, idVar, JdbcUtils.getColumnGetter(idProperty),
                        idVar)
        );
    }

}
