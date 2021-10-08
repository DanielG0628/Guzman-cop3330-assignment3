package ex46;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.ArrayList;

public class Frequency {

    //function to count to frequency of data within a string
    public static int countFrequency(ArrayList<String> frequency, String data) {

        int count = 0;                                          //create count variable

        for(int i = 0; i < frequency.size(); i++){              //for(size of frequency)
            if(frequency.get(i).equals(data))                   //if(any data within frequency is equal to the data variable)
                count++;                                        //increment count
        }                                                       //

        return count;                                           //return count

    }
}
