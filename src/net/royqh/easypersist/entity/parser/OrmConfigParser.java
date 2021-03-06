package net.royqh.easypersist.entity.parser;

import com.intellij.openapi.vfs.VirtualFile;
import net.royqh.easypersist.entity.model.config.EntitiesConfig;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roy on 2016/2/11.
 */
public class OrmConfigParser extends DefaultHandler {
    private List<EntitiesConfig> entitiesConfigs=new ArrayList<>();
    private EntitiesConfig currentConfig=null;
    private SAXParser parser;
    public final static String ORM_CONFIG_FILE_NAME= "orm-config.xml";
    private String currentTag=null;
    private String dialect="MySQL";

    public OrmConfigParser() throws ParserConfigurationException, SAXException {
        SAXParserFactory parserFactory=SAXParserFactory.newInstance();
        parser=parserFactory.newSAXParser();
    }

    @Override
    public void startDocument() throws SAXException {
        entitiesConfigs.clear();
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName) {
            case "entities":
                entitiesConfigs.add(currentConfig);
                break;
        }
        currentTag=null;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        String val;
        switch(qName) {
            case "entities":
                currentConfig=new EntitiesConfig();
                break;
            case "annotation-based":
                val=attributes.getValue("package");
                if (val==null){
                    throw new SAXException("not found attribute \"package\" in tag \"annotation-based\".");
                }
                currentConfig.setEntityPackage(val);
                break;
            case "persistor":
                val=attributes.getValue("target-package");
                if (val==null){
                    throw new SAXException("not found attribute \"target-package\" in tag \"persistor\".");
                }
                currentConfig.setOutputPackage(val);
                break;
        }
        if (qName.equals("entities")) {
            currentConfig=new EntitiesConfig();
        }
        currentTag=qName;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (currentTag!=null) {
            if (currentTag.equals("dialect")){
                String dial=new String(ch,start,length);
                if ("MySQL".equals(dial) || "PostgreSQL".equals(dial)){
                    dialect=dial;
                } else {
                    throw new RuntimeException("配置文件"+OrmConfigParser.ORM_CONFIG_FILE_NAME
                        +"中的dialect参数错误，必须为\"MySQL\"或\"PostgreSQL\"");
                }
            }
        }
    }

    public List<EntitiesConfig> getEntitiesConfigs() {
        return entitiesConfigs;
    }

    public String getDialect() {
        return dialect;
    }

    public void parse(VirtualFile file)  {
        try {
            parser.parse(file.getInputStream(),this);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } 
    }
}
