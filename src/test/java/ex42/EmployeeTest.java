package ex42;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Guzman
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void splitEmployeeList() {

        String[] temp1 = {"Ling" , "Mai", "559900"};
        String data1 = "Ling,Mai,559900";
        assertTrue(!(temp1 == data1.split(",")));
        String[] temp2 = {"Johnson", "Jim" , "56500"};
        String data2 = "Johnson,Jim,56500";
        assertTrue(!(temp2 == data2.split(",")));

    }
}