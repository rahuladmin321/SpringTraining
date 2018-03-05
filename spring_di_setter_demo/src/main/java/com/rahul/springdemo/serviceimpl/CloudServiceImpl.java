package com.rahul.springdemo.serviceimpl;

import java.util.Random;

import com.rahul.springdemo.service.BusinessService;

public class CloudServiceImpl implements BusinessService {

	public String offerService(String companyName) {
		Random random =new Random();
		String service = "\n As an organization, "+ companyName +
				"offers world calss Cloud Computingf infrastruvtore"+
				"\n the annual bla bal"+ random.nextInt(revenue)+ "dollars";
		return service;
	}

}
