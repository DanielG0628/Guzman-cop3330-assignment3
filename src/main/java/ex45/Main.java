package ex45;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);                                                                            //create scanner
        String userInput;                                                                                               //create userInput string
        File input = new File("src/main/java/ex45/exercise45_input.txt");                                      //create input file
        Scanner fileReader = new Scanner(input);                                                                        //create scanner for input file
        ArrayList<String> utilizeSentence = new ArrayList<>();                                                          //create utilizeSentence array list
        ArrayList<String> useSentence = new ArrayList<>();                                                              //create useSentence
        while (fileReader.hasNext()) {
            utilizeSentence.add(fileReader.next());                                                                     //read file into utilizeSentence array list
        }

        for(int i = 0; i < utilizeSentence.size(); i++) {                                                               //for(size of utilizeSentence)
            int flag = Sentence.changeToUse(utilizeSentence.get(i));                                                    //create flag variable that is set to the return value of changeToUse within Sentence class
            if(flag == 0)                                                                                               //if(flag is 1)
                useSentence.add("use");                                                                                 //add use to useSentence array
            else if(flag == 1)                                                                                          //if(flag is 2)
                useSentence.add("uses");                                                                                //add uses to useSentence array
            else if(flag == 2)                                                                                          //if(flag is 3)
                useSentence.add("\"use\"");                                                                             //add "use" to useSentence array
            else                                                                                                        //else
                useSentence.add(utilizeSentence.get(i));                                                                //add value of utilizeSentence to useSentence
            useSentence.add(" ");                                                                                       //add a space to useSentence
        }

        System.out.println("What would you like to name the output file?");                                             //prompt user for output file name
        userInput = sc.nextLine();                                                                                      //scan user input

        FileWriter fileWriter = new FileWriter("src/main/java/ex45/" + userInput + ".txt");                     //create FileWriter variable
        for(int i = 0; i < useSentence.size(); i++) {                                                                   //for(size of userSentence)
            //if statements for formatting
            if(i == 23 || i == 51)
                fileWriter.write(useSentence.get(i) + "\n");                                                        //write useSentence to file
            else
                fileWriter.write(useSentence.get(i));
        }

        fileWriter.close();                                                                                             //close fileWriter
        fileReader.close();                                                                                             //close fileReader
        sc.close();                                                                                                     //close scanner
    }
}
