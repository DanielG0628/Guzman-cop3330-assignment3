package ex41;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Guzman
 */

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class listOfNamesTest {

    @Test
    void sortListOfNames() {

        ArrayList<String> list = new ArrayList<>();
        list.add("Ling, Mai");
        list.add("Johnson, Jim");
        list.add("Zarnecki, Sabrina");
        list.add("Jones, Chris");
        list.add("Jones, Aaron");
        list.add("Swift, Geoffrey");
        list.add("Xiong, Fong");
        ArrayList<String> newList = new ArrayList<>();
        newList.add("Johnson, Jim");
        newList.add("Jones, Aaron");
        newList.add("Jones, Chris");
        newList.add("Ling, Mai");
        newList.add("Swift, Geoffrey");
        newList.add("Xiong, Fong");
        newList.add("Zarnecki, Sabrina");
        assertEquals(newList, listOfNames.sortListOfNames(list));

    }
}