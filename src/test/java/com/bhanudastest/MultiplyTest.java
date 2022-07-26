package com.bhanudastest;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.calculator.Multiplication;

public class MultiplyTest {
	
	Multiplication obj;

    @Before
    public void setup() {
        obj = new Multiplication();
    }

    @Test
    public void testMultiTwoNumbers() {
    	Assert.assertEquals(obj.multiply(10, 10), 100);
    	Assert.assertNotNull(obj);
    	Assert.assertNotEquals(obj.multiply(10, 10), 200);
    }

}
