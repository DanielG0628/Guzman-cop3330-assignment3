package ex44;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Guzman
 */

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ProductsTest {

    @Test
    void checkString() {
        ArrayList<String> array = new ArrayList<>();
        array.add("Daniel,Mary,Shazod");
        array.add("David,Emily,Nate");
        array.add("Spencer,Eric,Tyler");
        assertEquals(1, Products.checkString(array, "Emily"));
        assertEquals(-1, Products.checkString(array, "Joseph"));
    }

}