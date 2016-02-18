package net.roy.codegenerator.orm.parsers;

import com.intellij.openapi.vfs.VirtualFile;
import net.roy.codegenerator.orm.model.config.EntitiesConfig;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Roy on 2016/2/11.
 */
public class OrmConfigParser extends DefaultHandler {
    private List<EntitiesConfig> entitiesConfigs=new ArrayList<>();
    private EntitiesConfig currentConfig=null;
    private SAXParser parser;
    public final static String ORM_CONFIG_FILE_NAME="orm-config.xml";

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
    }

    public List<EntitiesConfig> getEntitiesConfigs() {
        return entitiesConfigs;
    }

    public void parse(VirtualFile file) throws SAXException, IOException {
        parser.parse(file.getInputStream(),this);
    }
}
