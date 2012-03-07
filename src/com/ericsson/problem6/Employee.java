package com.ericsson.problem6;

public class Employee {

	private EmployeeType type;

	public Employee(EmployeeType type) {
		this.type = type;
	}

	public EmployeeType getType() {
		return type;
	}
}