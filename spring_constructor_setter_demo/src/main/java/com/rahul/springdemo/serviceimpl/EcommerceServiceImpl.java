package com.rahul.springdemo.serviceimpl;

import java.util.Random;

import com.rahul.springdemo.service.BusinessService;

public class EcommerceServiceImpl implements BusinessService {

	public String offerService(String companyName) {
		Random random = new Random();
		
		String servive= "afaf" + companyName + "dasfasf" +
		random.nextInt(revenue);
		return servive;
	}

}
