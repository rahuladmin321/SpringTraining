package com.rahul.service.demo;

import java.util.*;

public class WelcomeService implements GenericWelcomeService{

	public List<String> getWelcomeMessage(String name){
		List<String> myWelcomeMessage =new ArrayList<>();
		
		
		//add data to list
		
		myWelcomeMessage.add("hello");
		myWelcomeMessage.add(name);
		myWelcomeMessage.add(", welcome to the spring course :-)");
		return myWelcomeMessage;
	}
	
}
