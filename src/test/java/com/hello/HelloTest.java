package com.hello;

import org.junit.Assert;
import org.junit.Test;

public class HelloTest {

    @Test
    public void testSayHello() {
        final String expectedHello = "Hello Sweden!!!";
        final String actualHello = Hello.sayHello("Sweden");

        Assert.assertEquals(expectedHello, actualHello);
    }
}