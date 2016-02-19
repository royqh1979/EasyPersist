package net.royqh.codegenerator.orm.model;

/**
 * Created by Roy on 2016/2/11.
 */
public class ClassInfo {
    private String name;
    private String qualifiedName;

    public ClassInfo(String name, String qualifiedName) {
        this.name = name;
        this.qualifiedName = qualifiedName;
    }

    public String getName() {
        return name;
    }

    public String getQualifiedName() {
        return qualifiedName;
    }

    @Override
    public String toString() {
        return "ClassInfo{" +
                "name='" + name + '\'' +
                ", qualifiedName='" + qualifiedName + '\'' +
                '}';
    }
}
