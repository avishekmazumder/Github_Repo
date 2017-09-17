package com.avi.saxparser1;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Created by Avishek on 17-Sep-17.
 */
public class Userhandler extends DefaultHandler{
    boolean bFirstName = false;
    boolean bLastName = false;
    boolean bNickName = false;
    boolean bMarks = false;

    @Override
    public void startElement(
            String uri, String localName, String qName, Attributes attributes)
            throws SAXException {

        if (qName.equalsIgnoreCase("student")) {
            String rollNo = attributes.getValue("rollno");
            System.out.println("Roll No : " + rollNo);
        } else if (qName.equalsIgnoreCase("firstname")) {
            System.out.println("Start Element :" + qName);
            bFirstName = true;
        } else if (qName.equalsIgnoreCase("lastname")) {
            System.out.println("Start Element :" + qName);
            bLastName = true;
        } else if (qName.equalsIgnoreCase("nickname")) {
            System.out.println("Start Element :" + qName);
            bNickName = true;
        }
        else if (qName.equalsIgnoreCase("marks")) {
            System.out.println("Start Element :" + qName);
            bMarks = true;
        }
    }

    @Override
    public void endElement(String uri,
                           String localName, String qName) throws SAXException {

        if (qName.equalsIgnoreCase("student")) {
            System.out.println("End Element :" + qName);
        } else if (qName.equalsIgnoreCase("firstname")) {
            System.out.println("End Element :" + qName);
            bFirstName = false;
        } else if (qName.equalsIgnoreCase("lastname")) {
            System.out.println("End Element :" + qName);
            bLastName = false;
        } else if (qName.equalsIgnoreCase("nickname")) {
            System.out.println("End Element :" + qName);
            bNickName = false;
        }
        else if (qName.equalsIgnoreCase("marks")) {
            System.out.println("End Element :" + qName);
            bMarks = false;
        }
    }

    @Override
    public void characters(char ch[], int start, int length) throws SAXException {

        if (bFirstName) {
            System.out.println("First Name: " + new String(ch, start, length));
            //bFirstName = false;
        } else if (bLastName) {
            System.out.println("Last Name: " + new String(ch, start, length));
            //bLastName = false;
        } else if (bNickName) {
            System.out.println("Nick Name: " + new String(ch, start, length));
            //bNickName = false;
        } else if (bMarks) {
            System.out.println("Marks: " + new String(ch, start, length));
           // bMarks = false;
        }
    }
}

