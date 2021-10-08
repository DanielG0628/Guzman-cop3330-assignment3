package ex46;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Guzman
 */
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyTest {

    @Test
    void countFrequency() {
        ArrayList<String> frequency = new ArrayList<String>();
        frequency.add("badger");
        frequency.add("badger");
        frequency.add("badger");
        frequency.add("badger");
        frequency.add("mushroom");
        frequency.add("mushroom");
        frequency.add("snake");
        frequency.add("badger");
        frequency.add("badger");
        frequency.add("badger");

        assertEquals(7, Frequency.countFrequency(frequency, "badger"));
        assertEquals(1, Frequency.countFrequency(frequency, "snake"));
    }
}