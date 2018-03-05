package com.rahul.springdemo;

public class Organization {
	
	private String companyName;
	private int yearOfIncorpotation;
	
	
 //public Organization(){
	 
	 
// }
	
 
 	public Organization(String companyName, int yearOfIncorpotation) {
		this.companyName = companyName;
		this.yearOfIncorpotation = yearOfIncorpotation;
	}



	public void coporateSlogan() {
		String slogan="We are building the ultimate machine";
		System.out.println(slogan);
	}
	
	@Override
	public String toString() {
		return "Organization{companyName=" + companyName + ", yearOfIncorpotation  " + yearOfIncorpotation +"}";
	}
}
