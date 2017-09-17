package com.avi.main;

import com.sun.prism.PixelFormat;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Avishek on 20-Mar-17.
 */
public class DateSortMain {

    public static void main(String args[]) {

        try {

            String dateStr = "2017:04:20 14:35:30";
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
            SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
            Date date = dateFormat.parse(dateStr);

            Date dateToday = new Date();
            GregorianCalendar cal = new GregorianCalendar();
            cal.setTime(dateToday);
            XMLGregorianCalendar timeStamp = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);

            XMLGregorianCalendar timeStamp1 = DatatypeFactory.newInstance().newXMLGregorianCalendar(timeStamp.toString());
            GregorianCalendar cal1 = timeStamp1.toGregorianCalendar();
            Date date1 = cal1.getTime();

            System.out.println(date.compareTo(dateToday));
            List<Date> dateList = new ArrayList<Date>();
            dateList.add(date);
            dateList.add(dateToday);

            System.out.println(dateList);

            Collections.sort(dateList, new Comparator<Date>() {
                @Override
                public int compare(Date o1, Date o2) {
                    return o1.compareTo(o2);
                }
            });

            System.out.println(dateList);
            System.out.println(date.toString());
            System.out.println(date1.toString());
            System.out.println(dateFormat1.format(date));
            System.out.println(timeStamp.toString());
            System.out.println(timeStamp1.toString());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
