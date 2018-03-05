package com.rahul.springdemo.domain;

import com.rahul.springdemo.service.BusinessService;
import com.rahul.springdemo.serviceimpl.EcommerceServiceImpl;

public class Organization {

	private String companyName;
	private int yearOfIncorpotation;
	private String postalCode;
	private int employeeCount;
    private String slogan;
	private BusinessService businessservice;
	// public Organization(){

	// }

	public Organization(String companyName, int yearOfIncorpotation) {
		this.companyName = companyName;
		this.yearOfIncorpotation = yearOfIncorpotation;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	public void setBusinessservice(BusinessService businessservice) {
		this.businessservice = businessservice;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String coporateSlogan() {
		return slogan;
		//String slogan = "We are building the ultimate machine";
		//System.out.println(slogan);
	}

	
	public String comporateService() {
		return businessservice.offerService(companyName);
		
	}
	@Override
	public String toString() {
		return "Organization{companyName=" + companyName + ", yearOfIncorpotation  " + yearOfIncorpotation
				+ ", postalCode= " + postalCode + ", employeeCount= " + employeeCount + " }";
	}
}
