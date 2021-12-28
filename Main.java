package com.company;

import com.company.stack.Stack;

public class Main {

    public static void main(String[] args) {
        separateNumbers("101102");
    }
    /*
       99100
   */

    public static void separateNumbers(String s) {
        long firstNumber = 0;
        int counter = 1;
        String firstNumberToPrint;
        while (counter <= s.length() /2){
            firstNumber = Long.parseLong(s.substring(0,counter));
            firstNumberToPrint = firstNumber + "";
            String testString = "";
            while(testString.length() < s.length()){
                testString += (firstNumber++);
            }
            if(testString.equals(s)){
                System.out.println("YES " + firstNumberToPrint);
                return;
            }
            counter++;
        }
        System.out.println("NO");
    }
}
