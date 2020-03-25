package com.qa.tax;

public class Runner {
	public static void main(String[] args) {

		// variable for input
		String userName = "Nick";
		// makes a copy/instance
		TaxUser user = new TaxUser();
		// using a method
		user.printUserName(userName);

		// input from user
		int userSal = (23500);

		user.printUserSal(userSal);
		user.printUserSal(userSal / 12);
		user.printUserSal(userSal / 365);

		System.out.println(user.printUserTaxRate(userSal));
	}
}