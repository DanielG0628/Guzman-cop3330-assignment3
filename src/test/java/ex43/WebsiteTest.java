package ex43;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Daniel Guzman
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteTest {

    @Test
    void websiteName() {
        assertEquals("./website/Cool Math Games", Website.websiteName("Cool Math Games"));
        assertEquals("./website/expert", Website.websiteName("expert"));
    }

    @Test
    void htmlName() {
        assertEquals("./website/Cool Math Games/index.html", Website.htmlName("Cool Math Games"));
        assertEquals("./website/expert/index.html", Website.htmlName("expert"));
    }

    @Test
    void jScriptName() {
        assertEquals("./website/Cool Math Games/js/", Website.jScriptName("Cool Math Games"));
        assertEquals("./website/expert/js/", Website.jScriptName("expert"));
    }

    @Test
    void cssName() {
        assertEquals("./website/Cool Math Games/css/", Website.cssName("Cool Math Games"));
        assertEquals("./website/expert/css/", Website.cssName("expert"));
    }

}