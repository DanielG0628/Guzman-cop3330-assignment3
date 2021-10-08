package ex45;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Guzman
 */

public class Sentence {

    //function to find which form of utilize is within the sentence
    public static int changeToUse(String temp) {
        if(temp.equals("utilize"))                      //if(temp equals utilize)
            return 0;                                   //return 0
        else if(temp.equals("utilizes"))                //if(temp equals utilizes)
            return 1;                                   //return 1
        else if(temp.equals("\"utilize\""))             //if(temp equals "utilize"
            return 2;                                   //return 2
        else                                            //if(there is no utilize)
            return -1;                                  //return -1
    }

}
