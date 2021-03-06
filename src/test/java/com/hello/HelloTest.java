package com.hello;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class HelloTest {

    /**
     * Tests that sayHello method returns expected string message
     */
    @Test
    public void sayHello() {
        final String expectedHello = "Hello Sweden!!!";
        final String actualHello = Hello.sayHello("Sweden");

        Assert.assertEquals(expectedHello, actualHello);
    }

    /**
     * Tests that sayHello method returns unexpected string message
     */
    @Test
    public void sayHello2() {
        final String expectedHello = "Hello India!!!";
        final String actualHello = Hello.sayHello("Sweden");

        Assert.assertNotEquals(expectedHello, actualHello);
    }


    /**
     * Tests that sayHelloToAll method returns expected set of string message
     */
    @Test
    public void sayHelloToNeighbours() {

        final Set<String> expectedHello =  new HashSet<>();
        expectedHello.add("Hello Sweden!!!");
        expectedHello.add("Hello Finland!!!");
        expectedHello.add("Hello Denmark!!!");
        expectedHello.add("Hello Norway!!!");

        final Set<String> neighbours =  new HashSet<>();
        neighbours.add("Sweden");
        neighbours.add("Finland");
        neighbours.add("Denmark");
        neighbours.add("Norway");

        final Collection<String> actualHello = Hello.sayHelloToAll(neighbours);

        Assert.assertEquals(expectedHello, actualHello);
    }
}