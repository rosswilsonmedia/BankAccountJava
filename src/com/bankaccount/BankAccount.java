package com.bankaccount;

import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private double checkingBalance;
	private double savingsBalance;
	private static int numOfAccounts = 0;
	private static double totalMoneyInAccounts = 0;
	private static Random random = new Random();
	
	public BankAccount() {
		this.accountNumber=accountNumber();
		this.checkingBalance=0;
		this.savingsBalance=0;
		numOfAccounts++;
	}
	
	private String accountNumber() {
		char[] alph = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String accountNumber="";
		int i=0;
		while(i<10) {
			if(random.nextBoolean()) {
				accountNumber+=alph[random.nextInt(26)];
			} else {
				accountNumber+=random.nextInt(10);
			}
			i++;
		}
		return accountNumber;
	}
	
	public double getCheckingBalance(){
		return this.checkingBalance;
	}
	
	public double getSavingsBalance(){
		return this.savingsBalance;
	}
	
	public void deposit(String type, double value) {
		if(type=="checking"){
			this.checkingBalance+=value;
			totalMoneyInAccounts+=value;
		} else if (type=="savings") {
			this.savingsBalance+=value;
			totalMoneyInAccounts+=value;
		}
	}
	
	public void withdraw(String type, double value) {
		if(type=="checking" && this.checkingBalance>value){
			this.checkingBalance-=value;
			totalMoneyInAccounts-=value;
		} else if (type=="savings" && this.savingsBalance>value){
			this.savingsBalance-=value;
			totalMoneyInAccounts-=value;
		}
	}
	
	public double totalInAccount() {
		return this.checkingBalance + this.savingsBalance;
	}
	
}
