package com.mcfilkin;

public class Main {
    public static void main(String[] args) {
        Printable printer = new Printer();
        String someText = printer.print("Some");
        System.out.println(someText);
    }
}