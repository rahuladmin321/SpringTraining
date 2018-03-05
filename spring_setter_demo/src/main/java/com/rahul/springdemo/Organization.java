package com.rahul.springdemo;

public class Organization {

	private String companyName;
	private int yearOfIncorpotation;
	private String postalCode;
	private int employeeCount;

	// public Organization(){

	// }

	public Organization(String companyName, int yearOfIncorpotation) {
		this.companyName = companyName;
		this.yearOfIncorpotation = yearOfIncorpotation;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public void coporateSlogan() {
		String slogan = "We are building the ultimate machine";
		System.out.println(slogan);
	}

	@Override
	public String toString() {
		return "Organization{companyName=" + companyName + ", yearOfIncorpotation  " + yearOfIncorpotation
				+ ", postalCode= " + postalCode + ", employeeCount= " + employeeCount + " }";
	}
}
