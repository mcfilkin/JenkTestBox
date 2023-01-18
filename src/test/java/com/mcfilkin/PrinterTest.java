package com.mcfilkin;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PrinterTest {

    @Test
    public void testPrint() {
        String text = "abc";
        String textEx = "ABC";
        String result = new Printer().print(text);

        assertEquals(result, textEx);
    }
}