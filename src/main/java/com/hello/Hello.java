package com.hello;

public class Hello {

    public static void main (String args[]) {
        if(args != null && args.length != 0) {
            for (final String country : args) {
                System.out.println(sayHello(country));
            }
        } else {
            System.out.println(sayHello("Sweden"));
        }
    }

    static String sayHello(final String country) {
        return "Hello "+ country+ "!!!";
    }
}
