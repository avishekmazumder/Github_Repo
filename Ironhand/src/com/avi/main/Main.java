package com.avi.main;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Integer> amendLevels = new ArrayList<Integer>();

        amendLevels.add(1);
        amendLevels.add(2);
        amendLevels.add(3);
        amendLevels.add(4);
        amendLevels.add(5);

        //amendLevels.sort(null);
        System.out.println(amendLevels.size());

       int maxAmendLevel=amendLevels.get(amendLevels.size()-1);
       int requiredAmendLevel=amendLevels.get(0);
       int amendLevelIndex=0;
       for(int i=amendLevels.size()-1;i>0;i--) {
           if(amendLevels.get(i)-1 == amendLevels.get(i-1)) {
               continue;
           } else {
               requiredAmendLevel = amendLevels.get(i);
               amendLevelIndex = i;
               break;
           }
       }

       System.out.println("required Amend Level:"+requiredAmendLevel);

    }
}
