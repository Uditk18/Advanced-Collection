//Main test class to test Emp_information and MMASaving_account classes
package com.capgemini.AdvancedCollection4;

import java.util.HashMap;
import java.util.Map;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating an object of both Emp_information and MMASaving-account
		Emp_Information empInfo1 = new Emp_Information();
		MMASaving_account mmaSaving1 = new MMASaving_account();

		// giving values by getters and setters
		empInfo1.setEmpID(101);
		empInfo1.setEmployee_comm(1000);
		empInfo1.setEmployee_designation("Consultant");
		empInfo1.setEmployee_name("Saif");
		empInfo1.setEmployee_salary(20_000);

		mmaSaving1.setAccount_balance(30_000);
		mmaSaving1.setAccountholder_name("Saif");
		mmaSaving1.setAccountID(203);
		mmaSaving1.setSalaryAccount(true);

		// Creating another object of both Emp_information and MMASaving-account

		Emp_Information empInfo2 = new Emp_Information();
		MMASaving_account mmaSaving2 = new MMASaving_account();

		// giving values by getters and setters
		empInfo2.setEmpID(102);
		empInfo2.setEmployee_comm(760);
		empInfo2.setEmployee_designation("Analyst");
		empInfo2.setEmployee_name("Udit");
		empInfo2.setEmployee_salary(30_000);

		mmaSaving2.setAccount_balance(76_000);
		mmaSaving2.setAccountholder_name("Udit");
		mmaSaving2.setAccountID(208);
		mmaSaving2.setSalaryAccount(true);

		// Creating a HashMap having empinfop and mmasaving types as key and values
		Map<Emp_Information, MMASaving_account> empMap = new HashMap<>();

		// Putting values in HashMap
		empMap.put(empInfo1, mmaSaving1);
		empMap.put(empInfo2, mmaSaving2);

		// printing the hashmap
		empMap.forEach((emp, acc) -> System.out.println("Employee : " + emp + "\n Account : " + acc + "\n"));

	}

}
