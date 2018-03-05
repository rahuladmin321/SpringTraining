package com.rahul.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCapp1 {

	public static void main(String[] args) {
		
		//creat the application context container
		ApplicationContext ctx= new FileSystemXmlApplicationContext("beans.xml");
		//create the bean
		Organization org=(Organization) ctx.getBean("myorg");
		/// invoke the company sloagan via the bean
		
		org.coporateSlogan();
		// close the application context (conrtqainer)
		
		((FileSystemXmlApplicationContext)ctx).close();
	}

}
