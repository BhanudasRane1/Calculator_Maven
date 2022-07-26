package com.calculator;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	
	public static void main(String args[])
	{
		
		int num1,num2,res;
		Scanner sc = new Scanner(System.in);
		final Logger logger =LoggerFactory.getLogger(Main.class);
		logger.info("Hello Calculator");
		CalculatorExample cal = new CalculatorExample();
		
		char sym;
		do {
			logger.info("Take two number for calculator operation:-");
			num1=sc.nextInt();
			num2=sc.nextInt();
			logger.info("Choose any one operation among this (+,-,*,/)");
			logger.info("For exit press 0");
			sym=sc.next().charAt(0);
			
			
			switch(sym)
			{
			case '+': 
				
				res=cal.addition(num1, num2);
				System.out.println("\n Result is  "+res);
				break;
				
			case '-': 
				
				res=cal.substraction(num1, num2);
				System.out.println(res);
				break;
				
			case '*': 
			
				res = cal.multiplication(num1, num2);
				System.out.println(res);
				break;
				
			case '/':
				
				res= cal.division(num1, num2);
				System.out.println(res);
				break;
				
			case '0':
				logger.info("You are exit.");
				System.exit(0);
				break;
				
			default:
			    logger.info("Invalid operator!");
			    break;
			}
		}while(sym!='0');
	}

}
