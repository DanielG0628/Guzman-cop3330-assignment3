package ex44;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.ArrayList;

public class Products {

    //function to check string for certain substrings
    public static int checkString(ArrayList<String> name, String input){

        for(int j = 0; j < name.size(); j++) {              //for(size of name array)

            if(name.get(j).indexOf(input) != -1)            //if(input is found within array)
                return j;                                   //return index of input within names

        }

        return -1;                                          //return -1 if input is not found within name array list

    }

}
