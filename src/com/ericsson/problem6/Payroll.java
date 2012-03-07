package com.ericsson.problem6;

public class Payroll {

	public double calculatePay(Employee e) {
		return e.getType().calculatePay();
	}
}
