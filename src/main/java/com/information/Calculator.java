package com.information;



import java.util.Scanner;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.information.service.CalculatorService; 




@SuppressWarnings("resource")
public class Calculator {


	public static void main(String[] args) {
 
		// loading the definitions from the given XML file
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
	
		
	CalculatorService cs = (CalculatorService)context.getBean("cs");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no");
	cs.setN1(sc.nextInt());
	cs.setN2(sc.nextInt());

	
	System.out.println(cs);
	
	}	
}
