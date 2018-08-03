//Class saving account declaring its variables and methods.
package com.capgemini.AdvancedCollection1;

public class SavingAccount implements Comparable<SavingAccount> {
	double acc_balance;
	int acc_ID;
	String accountHolderName;
	boolean isSalaryAccount;

	public SavingAccount(double balance, int id, String name, boolean salaryAccount) {
		acc_balance = balance;
		acc_ID = id;
		accountHolderName = name;
		isSalaryAccount = salaryAccount;

	}

	public double withdraw(double amount) {
		acc_balance = acc_balance - amount;
		return acc_balance;
	}

	public double deposit(double amount) {
		acc_balance = acc_balance + amount;
		return acc_balance;
	}

	@Override
	public String toString() {
		return "SavingAccount-------------------------------\n\nacc_balance:\t" + acc_balance + "\n\nacc_ID:\t" + acc_ID
				+ "\n\naccountHolderName:\t" + accountHolderName + "\n\nisSalaryAccount:\t" + isSalaryAccount + "\n";
	}

	public double getAcc_balance() {
		return acc_balance;
	}

	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}

	public int getAcc_ID() {
		return acc_ID;
	}

	public void setAcc_ID(int acc_ID) {
		this.acc_ID = acc_ID;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}

	@Override
	public int compareTo(SavingAccount s) {
		// TODO Auto-generated method stub
		// minus - is used for comparing integer
		return this.acc_ID - s.acc_ID;
	}

}
