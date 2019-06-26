package com.dharme;

import org.junit.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(JUnitPlatform.class)
public class GreetingTest {
    @Test
    public void testSayHello() {
        Greeting greeting = new Greeting();
        assertEquals(greeting.sayHelllo(), "What's up?");
    }

}
