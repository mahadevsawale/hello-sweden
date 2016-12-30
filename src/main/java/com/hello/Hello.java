package com.hello;

public class Hello {

    public static void main (String args[]) {
        final String sweden = sayHello("Sweden");
        System.out.println(sweden);
    }

    public static String sayHello(final String country) {
        return "Hello "+ country+ "!!!";
    }
}
