//Class having Employee information fields like Emp Id,employee name etc

package com.capgemini.AdvancedCollection4;

public class Emp_Information {

	int empID;
	String employee_name;
	String employee_designation;
	double employee_salary;
	double employee_comm;

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getEmployee_designation() {
		return employee_designation;
	}

	public void setEmployee_designation(String employee_designation) {
		this.employee_designation = employee_designation;
	}

	public double getEmployee_salary() {
		return employee_salary;
	}

	public void setEmployee_salary(double employee_salary) {
		this.employee_salary = employee_salary;
	}

	public double getEmployee_comm() {
		return employee_comm;
	}

	public void setEmployee_comm(double employee_comm) {
		this.employee_comm = employee_comm;
	}

	@Override
	public String toString() {
		return "Emp_Information [empID=" + empID + ", employee_name=" + employee_name + ", employee_designation="
				+ employee_designation + ", employee_salary=" + employee_salary + ", employee_comm=" + employee_comm
				+ "]";
	}

}
