package com.hello;

import com.sun.istack.internal.NotNull;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

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

    @NotNull
    static String sayHello(@NotNull final String country) {
        return "Hello "+ country+ "!!!";
    }


    @NotNull
    static Collection<String> sayHelloToAll(@NotNull final Collection<String> countries) {
        final Set<String> helloSet = new HashSet<>();
        for (final String country : countries) {
            helloSet.add("Hello "+ country+ "!!!");
        }
        return helloSet;
    }
}
