package com.bhanudastest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.calculator.CalculatorExample;

public class CalculationTest {
	

	CalculatorExample obj;

	    @Before
	    public void setup() {
	        obj = new CalculatorExample();
	    }

	    @Test
	    public void testAddTwoNumbers() {
	        Assert.assertEquals(obj.addition(10, 10), 20);
	        Assert.assertNotNull(obj);
	        
	        Assert.assertNotEquals(obj.addition(10, 10), 30);
	    }
	    
	    @Test
	    public void testSubstractTwoNumbers() {
	        Assert.assertEquals(obj.substraction(30, 10), 20);
	        Assert.assertNotNull(obj);
	        
	        Assert.assertNotEquals(obj.substraction(10, 10), 1);
	    }
	    
	    @Test
	    public void testDivideTwoNumbers() {
	        Assert.assertEquals(obj.division(20, 10), 2);
	        Assert.assertNotNull(obj);
	        
	        Assert.assertNotEquals(obj.division(10, 10), 3);
	    }
	    
	    @Test
	    public void testMultiTwoNumbers() {
	        Assert.assertEquals(obj.multiplication(10, 10), 100);
	        Assert.assertNotNull(obj);
	        
	        Assert.assertNotEquals(obj.multiplication(5, 10), 30);
	    }
	    


}
