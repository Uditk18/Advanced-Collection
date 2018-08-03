//Class having Saving account fields like accountId,account_holdername etc

package com.capgemini.AdvancedCollection4;

public class MMASaving_account {
	int accountID;
	String accountholder_name;
	double account_balance;
	boolean isSalaryAccount;

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public String getAccountholder_name() {
		return accountholder_name;
	}

	public void setAccountholder_name(String accountholder_name) {
		this.accountholder_name = accountholder_name;
	}

	public double getAccount_balance() {
		return account_balance;
	}

	public void setAccount_balance(double account_balance) {
		this.account_balance = account_balance;
	}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}

	@Override
	public String toString() {
		return "MMASaving_account [accountID=" + accountID + ", accountholder_name=" + accountholder_name
				+ ", account_balance=" + account_balance + ", isSalaryAccount=" + isSalaryAccount + "]";
	}

}
