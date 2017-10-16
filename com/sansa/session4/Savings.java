package com.sansa.session4;

public class Savings extends BankAccount {

	Savings(int balance) {
		super(balance);

	}

	@Override
	public int getAccountBalance() {

		return balance;
	}

	@Override
	public int getInterest() {

		return 10;
	}



}
