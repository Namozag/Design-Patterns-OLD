/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.factory.java;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

/**
 *
 * @author Hany
 */
public class Test {
    
    public static void main(String[] args) throws ParserConfigurationException, SAXException {
        
        
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        
        
        DocumentBuilderFactory factory2 = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory2.newDocumentBuilder();
        
        
    }
    
}
