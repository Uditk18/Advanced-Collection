//BankAccountList which will maintains SavingAccounts object
//This ensures class should not have duplicate data and sort as per acc_ID
package com.capgemini.AdvancedCollection1;

import java.util.Set;
import java.util.TreeSet;

public class BankAccountList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<SavingAccount> saving = new TreeSet<>();
		SavingAccount saving1 = new SavingAccount(10_000, 123, "Udit", true);
		SavingAccount saving2 = new SavingAccount(5_000, 124, "Ripu", true);
		SavingAccount saving3 = new SavingAccount(30_500, 125, "Gaurav", false);
		SavingAccount saving4 = new SavingAccount(10_600, 126, "Mayur", true);
		SavingAccount saving5 = new SavingAccount(13_000, 127, "Alok", true);
		SavingAccount saving6 = new SavingAccount(37_000, 121, "Alok", true);
		SavingAccount saving7 = new SavingAccount(100_000, 120, "Alok", true);
		SavingAccount saving8 = new SavingAccount(1_800, 119, "Alok", true);

		// adding data to tree set
		saving.add(saving1);
		saving.add(saving2);
		saving.add(saving3);
		saving.add(saving4);
		saving.add(saving5);
		saving.add(saving6);
		saving.add(saving7);
		saving.add(saving8);

		for (SavingAccount acc : saving) {
			System.out.println(acc);
		}
	}

}
