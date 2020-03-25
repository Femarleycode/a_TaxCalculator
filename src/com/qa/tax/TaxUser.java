package com.qa.tax;

public class TaxUser {

	// method//
	public void printUserName(String userName) {
		System.out.println(userName);
	}

	public void printUserSal(double userSal) {
		System.out.println(userSal);
	}

	public double printUserTaxRate(double taxRate) {
		if (taxRate < 21000) {
			return taxRate * 0.1;
		} else if (taxRate >= 21000 && taxRate < 32500) {
			return taxRate * 0.2;
		} else {
			return taxRate * 0.4;
		}
	}
}