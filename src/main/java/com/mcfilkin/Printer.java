package com.mcfilkin;

public class Printer implements Printable {

    public static final int PAPER_CAPACITY = 10;

    @Override
    public String print(String text) {
        return text.toUpperCase() + PAPER_CAPACITY;
    }
}
