package com.bankaccount;

public class TestBankAccount {
	public static void main (String[] args) {
		BankAccount sample = new BankAccount();
		sample.deposit("checking", 125);
		sample.deposit("savings", 525);
		sample.withdraw("savings", 625);
		sample.withdraw("savings", 25);
		sample.withdraw("checking", 75);
		double balance = sample.getCheckingBalance();
		System.out.println(balance);
		double balance2 = sample.getSavingsBalance();
		System.out.println(balance2);
		double balance3 = sample.totalInAccount();
		System.out.println(balance3);
	}
}
