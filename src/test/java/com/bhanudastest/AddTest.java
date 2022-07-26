package com.bhanudastest;


import org.junit.Assert;
//
//import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.calculator.Addition;


public class AddTest {

	Addition obj;

	    @Before
	    public void setup() {
	        obj = new Addition();
	    }

	    @Test
	    public void testAddTwoNumbers() {
	        Assert.assertEquals(obj.add(10, 10), 20);
	        Assert.assertNotNull(obj);
	        
	        Assert.assertNotEquals(obj.add(10, 10), 30);
	    }

}
