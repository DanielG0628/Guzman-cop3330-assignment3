package ex45;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Guzman
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentenceTest {

    @Test
    void changeToUse() {
        String utilize = "utilize", utilizes = "utilizes", quoteUtilize = "\"utilize\"";

        assertEquals(0, Sentence.changeToUse(utilize));
        assertEquals(1, Sentence.changeToUse(utilizes));
        assertEquals(2, Sentence.changeToUse(quoteUtilize));
        assertEquals(-1, Sentence.changeToUse("daniel"));

    }
}