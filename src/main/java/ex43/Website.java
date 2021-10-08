package ex43;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Guzman
 */

public class Website {

    //Function to return website name
    public static String websiteName(String name) {
        String orig = "./website/";                               //create website name string
        return orig + name;                                       //return final name of website
    }

    //Function to return index.html name
    public static String htmlName(String name) {
        String orig1 = "./website/", orig2 = "/index.html";       //create index.html file name string
        return orig1 + name + orig2;                              //return final name of index.html
    }

    //Function to return JavaScript folder name
    public static String jScriptName(String name) {
        String orig1 = "./website/", orig2 = "/js/";              //create JavaScript folder name strings
        return orig1 + name + orig2;                              //return final name of JavaScript folder
    }

    //Function to return CSS folder name
    public static String cssName(String name) {
        String str1 = "./website/", str2 = "/css/";               //create CSS folder name strings
        return str1 + name + str2;                                //return final name of CSS folder creation
    }

}
