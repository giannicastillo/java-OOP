package com.castillo.bankaccount;

import java.util.Random;

public class BankAccount {
	//member variables aka attributes aka fields - checking savings, etc.
	private String accountNum = "";
	private double checking; 
	private double savings;
	public static int numberOfAccounts = 0;
	public static int amountOfMoney = 0;
	
	public BankAccount(double checkingBalanceParam, double savingsBalanceParam) {
		setAccountNum(BankAccount.accountNumGenerator());
		checking = checkingBalanceParam;
		savings = savingsBalanceParam;
		numberOfAccounts++;
		amountOfMoney++;
	}

	private static String accountNumGenerator() {
		Random randGen = new Random();
		String randIntString = "";
		while( randIntString.length() < 10) {
			int randInt = randGen.nextInt(10);
			randIntString += randInt;
		}
		
		return randIntString;
	}

//Create a method to withdraw money from one balance. 
//	Do not allow them to withdraw money if there are insufficient funds.
	
	public void withdrawMoney(double amount, String accountType) {
		//check to see what account its checking for our case
			//what if they dont have that much money
				//actions for broke people
			//withdraw action
		
		System.out.println(this);
		if(accountType.equals("checking")) {
			this.checking -= amount;
			System.out.printf("%s has taken out %s from your %s acount \n", this.getAccountNum(), amount, accountType);
		} if (amount > amountOfMoney) {
			System.out.printf("Your %s account does not have enough $$$! \n", accountType);
		}
	}
		
		//Create a method that will allow a user to deposit money into either the checking or saving,
			//		be sure to add to total amount stored.
		
	public void depositMoney(double amount, String accountType) {
		System.out.println(this);
		if(accountType.equals("checking")) {
			this.checking += amount;
			System.out.printf("%s has deposited %s to your %s account \n", this.getAccountNum(), amount, accountType);
		} 
		
//		else if () {
//			//do saving deposit
		}
	
	
		// Total amount from the checking and savings account 
	
	public void totalAmount() {
		System.out.println(this);
		double total = this.checking + this.savings;
		System.out.printf("There is a total of %s in your account /n", total);
	}

		//getters and setters 

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public double getChecking() {
		return checking;
	}

	public void setChecking(double checking) {
		this.checking = checking;
	}

	public double getSavings() {
		return savings;
	}

	public void setSavings(double savings) {
		this.savings = savings;
	}
		
		
		

}


