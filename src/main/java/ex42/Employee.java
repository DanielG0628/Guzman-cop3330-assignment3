package ex42;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Guzman
 */

public class Employee {

    //Function to split employee array from the commas
    public static String[] splitEmployeeList(String data){

        String[] array = data.split(",");     //split data String
        return array;                               //return split String array

    }

}
