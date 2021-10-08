package ex41;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("src/main/java/ex41/exercise41_input.txt");      //Create exercise41_input.txt
        ArrayList<String> listNames = new ArrayList<>();                                    //Create listNames array list
        listOfNames l = new listOfNames();                                                  //Create listOfNames class variable
        Scanner fileReader = new Scanner(inputFile);                                        //Create fileReader


        while(fileReader.hasNextLine()){                                                     //while(there is next line)
            String data = fileReader.nextLine();                                             //Read Line
            listNames.add(data);                                                             //add to listNames
        }

        listNames =  l.sortListOfNames(listNames);                                           //Call sortListOfNames

        System.out.println("Total of " + listNames.size() + " names\n-----------------");    //Print size of arrayList

        for(int i = 0; i < listNames.size(); i++){                                           //For(size of listNames)
            System.out.println(listNames.get(i));                                            //Print element of listNames
        }

        fileReader.close();                                                                  //close file reader
    }
}
