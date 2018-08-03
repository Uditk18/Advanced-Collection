//Main test class to test functionality of saving account and bank account classes

package com.capgemini.AdvancedCollection1;

import java.util.ArrayList;
import java.util.List;

public class SavingAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingAccount saving1 = new SavingAccount(10_000, 123, "Udit", true);
		SavingAccount saving2 = new SavingAccount(5_000, 124, "Ripu", true);
		SavingAccount saving3 = new SavingAccount(30_500, 125, "Gaurav", false);
		SavingAccount saving4 = new SavingAccount(10_600, 126, "Mayur", true);
		SavingAccount saving5 = new SavingAccount(3_000, 127, "Alok", true);

		// Creating array list of type SavingAccount
		List<SavingAccount> list = new ArrayList<>();
		list.add(saving1);
		list.add(saving2);
		list.add(saving3);
		list.add(saving4);
		list.add(saving5);

		for (SavingAccount l1 : list) {
			System.out.println(l1);
		}

	}

}
