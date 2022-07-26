package com.bhanudastest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.calculator.Substraction;

public class SubstractTest{

	
	Substraction obj;

    @Before
    public void setup() {
        obj = new Substraction();
    }

    @Test
    public void testSubTwoNumbers() {
    	Assert.assertEquals(obj.substract(30, 10), 20);
    	Assert.assertNotNull(obj);
    	Assert.assertNotEquals(obj.substract(10, 10), 1);
    }
}
