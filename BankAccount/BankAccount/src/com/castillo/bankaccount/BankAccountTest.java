package com.castillo.bankaccount;

public class BankAccountTest {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		System.out.println("Hello Bank Accounts!");
		
		BankAccount Gianni = new BankAccount(0, 0);
		BankAccount bankaccount2 = new BankAccount(0, 0);
		BankAccount bankaccount3 = new BankAccount(0, 0);
		
		//For deposit and withdraw $$$ below! 
		
		Gianni.depositMoney(100, "checking");
		Gianni.withdrawMoney(100, "checking");
//		Gianni.depositMoney(100, "savings");
//		Gianni.withdrawMoney(100, "savings");
		Gianni.totalAmount();
		
		
		
		
		//System.out.println(String.format("Checking- %s, Savings- %s,  Total- %s", bankaccount1.getChecking(0), bankaccount1.getSavings(0),(bankaccount1.getChecking(0) + bankaccount1.getSavings(0))));
		
		 
	} 
	
}
