package ex44;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);                                                                                                        //create scanner
        int flag = 1;                                                                                                                               //create flag int variable, set to 1
        String userInput;                                                                                                                           //create userInput string variable
        JSONParser parser = new JSONParser();                                                                                                       //create JSON parser
        ArrayList<String> names = new ArrayList<>();                                                                                                //create names array list
        ArrayList<String> quantities = new ArrayList<>();                                                                                           //create quantities array list
        ArrayList<String> prices = new ArrayList<>();                                                                                               //create prices array list

        try {
            Object fr = parser.parse(new FileReader("src/main/java/ex44/exercise44_input.json"));                                           //create object fr for the JSON file
            JSONObject input = (JSONObject)fr;                                                                                                      //create input JSON object
            JSONArray products = (JSONArray)input.get("products");                                                                                  //crate products JSONArray from products within JSON file

            for(int i = 0; i < products.size(); i++) {                                                                                              //for(loop through size of products.size())
                String data = String.valueOf(products.get(i));                                                                                      //convert each String within products array in separate strings
                String[] array = data.split(",");                                                                                             //separate the created string by commas and turn into array of strings
                names.add(array[2]);
                prices.add(array[1]);                                                                                                               //put data into array lists accordingly
                quantities.add(array[0]);
            }

            while(flag == 1){                                                                                                                       //while(flag is 1)
                System.out.println("What is the product name?");                                                                                    //prompt user
                userInput = sc.nextLine();                                                                                                          //scan user input

                if(Products.checkString(names, userInput) != -1) {                                                                                  //if(call checkString != -1)
                    int index = Products.checkString(names, userInput);                                                                             //set index variable to return value of checkString
                    System.out.println("Name: " + names.get(index).substring(names.get(index).indexOf(userInput), names.get(index).length() - 2));
                    System.out.println("Price: " + prices.get(index).substring(8, prices.get(index).length()));                                     //output
                    System.out.println("Quantity: " + quantities.get(index).substring(12, quantities.get(index).length()));
                    flag = 0;                                                                                                                       //set flag to 0
                }

                if(flag == 1)                                                                                                                       //if(flag is still 0)
                    System.out.println("Sorry, that product was not found in our inventory.");                                                      //prompt user and reset while loop
            }
        }

        catch(Exception e){                                                                                                                         //catch errors
            e.printStackTrace();
        }
    }
}
