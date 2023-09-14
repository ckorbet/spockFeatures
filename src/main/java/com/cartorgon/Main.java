package com.cartorgon;

public class Main {
    public static void main(final String[] args) {
        System.out.println(Main.sayHello("world"));
    }

    public static String sayHello(final String arg) {
        return "Hello " + arg + "!";
    }
}