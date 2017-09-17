package com.avi.saxparser1;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

/**
 * Created by Avishek on 17-Sep-17.
 */
public class SAXParserDemo {

    public static void main(String[] args) {

        try {
            File inputFile = new File("input.txt");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            Userhandler userhandler = new Userhandler();
            saxParser.parse(inputFile, userhandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}