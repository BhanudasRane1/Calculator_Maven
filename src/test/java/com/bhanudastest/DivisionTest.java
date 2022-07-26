package com.bhanudastest;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.calculator.Division;

public class DivisionTest {

	
	Division obj;

    @Before
    public void setup() {
        obj = new Division();
    }

    @Test
    public void testDivideTwoNumbers() {
    	Assert.assertEquals(obj.divide(6, 2), 3);
    	Assert.assertNotNull(obj);
    	Assert.assertNotEquals(obj.divide(10, 10), 2);
    }
}
