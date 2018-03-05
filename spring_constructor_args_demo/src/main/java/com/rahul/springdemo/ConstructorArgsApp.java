package com.rahul.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorArgsApp {

	public static void main(String[] args) {
		
		//creat the application context container
		ApplicationContext ctx= new ClassPathXmlApplicationContext("beans-cp.xml");
		//create the bean
		Organization org=(Organization) ctx.getBean("myorg");
		/// invoke the company sloagan via the bean
		
		org.coporateSlogan();
		
		//print organisation details
		
		System.out.println(org);
		
		// close the application context (conrtqainer)
		
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
