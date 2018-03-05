package com.rahul.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.springdemo.domain.Organization;

public class DISetterApp {

	public static void main(String[] args) {
		
		//creat the application context container
		ApplicationContext ctx= new ClassPathXmlApplicationContext("beans-cp.xml");
		//create the bean
		Organization org=(Organization) ctx.getBean("myorg");
		/// invoke the company sloagan via the bean
		
		System.out.println(org.coporateSlogan());
		
		//print organisation details
		
		System.out.println(org);
		
		System.out.println(org.comporateService());
		// close the application context (conrtqainer)
		
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
