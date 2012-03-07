package com.ericsson.problem12;

public class Payroll {

	public double calculatePay(Employee e) {
		switch (e.getType()) {
		case Employee.PROFESSIONAL_SERVICES:
			return calculateProfessionalServicesPay(e);
		case Employee.TRAINEE:
			return calculateTraineePay(e);
		case Employee.SUPPORT:
			return calculateSupportPay(e);
		default:
			throw new RuntimeException("Invalid Employee : "
                    + e.getType());
		}
	}

	private double calculateSupportPay(Employee e) {
		return 0;
	}

	private double calculateTraineePay(Employee e) {
		return 0;
	}

	private double calculateProfessionalServicesPay(Employee e) {
		return 0;
	}
}
