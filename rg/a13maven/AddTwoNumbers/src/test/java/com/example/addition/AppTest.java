package com.example.addition;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testAdd() {
        assertEquals(30, App.add(10, 20));
        assertEquals(0, App.add(0, 0));
        assertEquals(-5, App.add(-10, 5));
    } 
}
