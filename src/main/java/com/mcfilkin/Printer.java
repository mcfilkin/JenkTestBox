package com.mcfilkin;

public class Printer implements Printable {
    @Override
    public String print(String text) {
        return text.toUpperCase();
    }
}
