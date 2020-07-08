package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPublic {

    @Test
    public void testStringPars() {

        assertEquals(true,  StringPars.result(""));

    }

    @Test
    public void testNotIsEmptyWithNoBrecets() {

        assertEquals(true,  StringPars.result("sdsds"));

    }

    @Test
    public void testNotIsEmptyWithBrecets() {

        assertEquals(false,  StringPars.result("("));

    }

    @Test
    public void testNotIsEmptyWithOneBrecets() {

        assertEquals(false,  StringPars.result(")"));

    }

    @Test
    public void testNotIsEmptyWithBrecets2() {

        assertEquals(true,  StringPars.result("()"));

    }

}

