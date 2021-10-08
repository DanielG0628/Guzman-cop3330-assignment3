package ex43;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.BufferedWriter;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                                                                                   //create scanner variable
        String siteName, author, jScript, css;                                                                                 //create siteName, author, jScript, and css Strings
        Website w = new Website();                                                                                             //create website class variable

        System.out.println("Site name:");                                                                                      //prompt user for site name
        siteName = sc.nextLine();                                                                                              //scan site name to siteName variable
        System.out.println("Author:");                                                                                         //prompt user for the author name
        author = sc.nextLine();                                                                                                //scan author name to author variable
        System.out.println("Do you want a folder for JavaScript?");                                                            //prompt user for JavaScript folder
        jScript = sc.nextLine();                                                                                               //scan answer to jScript variable
        System.out.println("Do you want a folder for CSS?");                                                                   //prompt user for CSS folder
        css = sc.nextLine();                                                                                                   //scan answer to css variable

        System.out.println("Created " + w.websiteName(siteName));                                                              //output

        try {                                                                                                                  //try
            File index = new File("src/main/java/ex43/index.html");                                                   //create index file with path "src/main/java/ex43/index.html"
            BufferedWriter bw = new BufferedWriter(new FileWriter(index));                                                     //create BufferedWriter variable with the index file as the parameter
            bw.write(String.format("<!DOCTYPE html>\n" + "<html>\n" + "<head>\n" + "    " +
                    "<title>%s</title>\n" + "<meta Author Name =\"%s\">\n" + "</head>\n" + "</html>", siteName, author));      //write html file with siteName as title and author as meta
            System.out.println("Created " + w.htmlName(siteName));                                                             //output
            bw.close();                                                                                                        //close BufferedWriter variable

            if(jScript.equals("y")){                                                                                           //if(jScript is equal to "y")
                File f1 = new File("src/main/java/ex43/JavaScript");                                                  //create file with path "src/main/java/ex43/JavaScript"
                f1.mkdirs();                                                                                                   //create folder
                System.out.println("Created " + w.jScriptName(siteName));                                                      //output
            }
            if(css.equals("y")){                                                                                               //if(css is equal to "y")
                File f2 = new File("src/main/java/ex43/CSS");                                                         //create file with path "src/main/java/ex43/CSS"
                f2.mkdirs();                                                                                                   //create folder
                System.out.println("Created " + w.cssName(siteName));                                                          //output
            }
        } catch (IOException e){                                                                                               //catch any errors
            e.printStackTrace();
        }
    }
}
