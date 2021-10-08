package ex42;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("src/main/java/ex42/exercise42_input.txt");   //Create exercise42_input.txt
        Scanner fileReader = new Scanner(inputFile);                                     //Create fileReader
        ArrayList<String> employeeFirstName = new ArrayList<>();                         //Create employeeFirstName list
        ArrayList<String> employeeLastName = new ArrayList<>();                          //Create employeeLastName list
        ArrayList<String> employeeSalary = new ArrayList<>();                            //Create employeeSalary list
        Employee e = new Employee();                                                     //Create Employee class variable

        while(fileReader.hasNextLine()){                                                 //While(there is next line)
            String data = fileReader.next();                                             //Create data String
            String[] array = e.splitEmployeeList(data);                                  //Call splitEmployeeList
            employeeLastName.add(array[0]);                                              //add to employeeLastName array list
            employeeFirstName.add(array[1]);                                             //add to employeeFirstName array list
            employeeSalary.add(array[2]);                                                //add to employeeSalary array list
        }

        //if statements used for formatting
        System.out.println("Last      First      Salary\n--------------------------");   //Print header
        for(int i = 0; i < employeeFirstName.size(); i++){                               //For(increment through size of array lists)
            if(i == 6) {                                                                 //if(6th increment)
                System.out.print(employeeLastName.get(6) + " ");                         //print 6th value of employeeLastName array list + a space
                System.out.print(employeeFirstName.get(6) + "\t");                       //print 6th value of employeeFirstName array list + \t
                System.out.println(employeeSalary.get(6));                               //print 6th value of employeeSalary array list
            }
            if(i == 4){                                                                  //if(4th increment)
                System.out.print(employeeLastName.get(4) + "\t ");                       //print 4th value of employeeLastName array list + a \t and space
                System.out.print(employeeFirstName.get(4) + "\t");                       //print 4th value of employeeFirstName array list + \t
                System.out.println(employeeSalary.get(4));                               //print 4th value of employeeSalary
            }
            else if(i != 4 && i != 6) {                                                  //if(not 4th and 6th increment)
                System.out.print(employeeLastName.get(i) + "\t ");                       //print ith value of employeeLastName array list + \t and space
                System.out.print(employeeFirstName.get(i) + "\t\t");                     //print ith value of employeeFirstName array list + \t and \t
                System.out.println(employeeSalary.get(i));                               //print ith value of employeeSalary array list
            }
        }

        fileReader.close();                                                              //close fileReader
    }
}
