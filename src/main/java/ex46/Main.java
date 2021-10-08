package ex46;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.io.File;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File input = new File("src/main/java/ex46/exercise46_input.txt");                               //create input file
        Scanner fileReader = new Scanner(input);                                                                 //create scanner for input file
        String b = "badger", m = "mushroom", s = "snake";                                                        //create count variables for the data within the file
        ArrayList<String> frequency = new ArrayList<String>();                                                        //create frequency array list
        while (fileReader.hasNext()){
            frequency.add(fileReader.next());                                                                    //read file into frequency array list
        }

        int bCount = Frequency.countFrequency(frequency, b);
        int mCount = Frequency.countFrequency(frequency, m);                                                     //call countFrequency within the Frequency class for each count variable and their corresponding strings
        int sCount = Frequency.countFrequency(frequency, s);

        if(bCount > mCount && bCount > sCount){                                                                  //if(bCount has the most frequency)
            System.out.print("Badger: ");                                                                        //
            for(int i = 0; i < bCount; i++)                                                                      //for(bCount)
                System.out.print("*");                                                                           //output
            if(mCount > sCount) {                                                                                //if(mCount has the second-highest frequency)
                System.out.print("\nMushroom: ");                                                                //
                for(int i = 0; i < mCount; i++)                                                                  //for(mCount)
                    System.out.print("*");                                                                       //output
                System.out.print("\nSnake: ");                                                                   //
                for(int i = 0; i < sCount; i++)                                                                  //for(sCount)
                    System.out.print("*");                                                                       //output
            }
            else if(sCount > mCount) {                                                                           //if(sCount has the second-highest frequency)
                System.out.print("\nSnake: ");                                                                   //
                for(int i = 0; i < sCount; i++)                                                                  //for(sCount)
                    System.out.print("*");                                                                       //output
                System.out.print("\nMushroom: ");                                                                //
                for(int i = 0; i < mCount; i++)                                                                  //for(mCount)
                    System.out.print("*");                                                                       //output
            }
        }
        else if(sCount > bCount && sCount > mCount) {                                                            //if(sCount has the most frequency)
            System.out.println("Snake: ");                                                                       //
            for(int i = 0; i < sCount; i++)                                                                      //for(sCount)
                System.out.print("*");                                                                           //output
            if(mCount > bCount) {                                                                                //if(mCount has the second-highest frequency)
                System.out.println("\nMushroom: ");                                                              //
                for(int i = 0; i < mCount; i++)                                                                  //for(mCount)
                    System.out.print("*");                                                                       //output
                System.out.println("\nBadger: ");                                                                //
                for(int i = 0; i < bCount; i++)                                                                  //for(bCount)
                    System.out.print("*");                                                                       //output
            }
            else if(bCount > mCount) {                                                                           //if(bCount has the second-highest frequency)
                System.out.println("\nBadger: ");                                                                //
                for(int i = 0; i < bCount; i++)                                                                  //for(bCount)
                    System.out.print("*");                                                                       //output
                System.out.println("\nMushroom: ");                                                              //
                for(int i = 0; i < mCount; i++)                                                                  //for(mCount)
                    System.out.print("*");                                                                       //output
            }
        }
        else {                                                                                                   //if(mCount has the most frequency)
            System.out.println("Mushroom: ");                                                                    //
            for(int i = 0; i < mCount; i++)                                                                      //for(mCount)
                System.out.print("*");                                                                           //output)
            if(bCount > sCount) {                                                                                //if(bCount has the second-highest frequency)
                System.out.println("\nBadger: ");                                                                //
                for(int i = 0; i < bCount; i++)                                                                  //for(bCount)
                    System.out.print("*");                                                                       //output
                System.out.println("\nSnake: ");                                                                 //
                for(int i = 0; i < sCount; i++)                                                                  //for(sCount)
                    System.out.print("*");                                                                       //output
            }
            else if(sCount > bCount) {                                                                           //if(sCount has the second-highest frequency)
                System.out.println("\nSnake: ");                                                                 //
                for(int i = 0; i < sCount; i++)                                                                  //for(sCount)
                    System.out.print("*");                                                                       //output
                System.out.println("\nBadger: ");                                                                //
                for(int i = 0; i < bCount; i++)                                                                  //for(bCount)
                    System.out.print("*");                                                                       //output
            }
        }
        fileReader.close();                                                                                      //close fileReader
    }
}