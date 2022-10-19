package com.stackroute.basics;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PhoneNumberValidator {
    //Create Scanner object as instance variable
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        PhoneNumberValidator object = new PhoneNumberValidator();
        String input = object.getInput();
        boolean result = object.validatePhoneNumber(input);
        object.displayResult(result);
    }

    public String getInput() {
        String s = sc.nextLine();
        return s;
    }

    public void displayResult(boolean result) {
        if(result){
            System.out.println("Valid");
        }
        else if(!result){
            System.out.println("Invalid or empty string");
        }
       
    }

    public boolean validatePhoneNumber(String s) {
        int f=0;
        if(s==null || s.isEmpty())
        {return false;}
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){f++;}
            else if(c!='-')
                break;
        }
        if(f==10){
            return true;}
        else
        return false;
    }
}
