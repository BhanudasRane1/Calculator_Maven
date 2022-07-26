package com.calculator;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CalculatorExample {

	public static void main(String[] args) {
		int num1,num2,res;
		Scanner sc = new Scanner(System.in);
		final Logger logger =LoggerFactory.getLogger(CalculatorExample.class);
		logger.info("Hello I am a Calculator");
		
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
				Addition obj = new Addition();
				res=obj.add(num1, num2);
				System.out.println("\n Result is  "+res);
				break;
				
			case '-': 
				Substraction sub =new Substraction();
				res=sub.substract(num1, num2);
				System.out.println(res);
				break;
				
			case '*': 
				Multiplication mul = new Multiplication();
				res = mul.multiply(num1, num2);
				System.out.println(res);
				break;
				
			case '/':
				Division div =new Division();
				res= div.divide(num1, num2);
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
