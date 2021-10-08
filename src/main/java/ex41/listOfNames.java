package ex41;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.ArrayList;
import java.util.Collections;

public class listOfNames {

    //Function to sort an array list of names alphabetically
    public static ArrayList<String> sortListOfNames(ArrayList<String> listNames){

            Collections.sort(listNames);            //Call collection sort
            return listNames;                       //return sorted array

    }
}
