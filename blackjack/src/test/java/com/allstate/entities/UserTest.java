package com.allstate.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class UserTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }
    @Test
    public void shouldCreateAUser(){
        User user1 = new User("Swapnil", 10000);
        assertEquals("Swapnil", user1.getName());
    }

    @Test
    public void shouldBeAbleToBet() throws  Exception{
        User user1 = new User("Swapnil", 10000);

    }
}