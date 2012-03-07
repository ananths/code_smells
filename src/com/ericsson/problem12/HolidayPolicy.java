package com.ericsson.problem12;

public class HolidayPolicy {
	public int allowedCasualLeaves(Employee e) {
		switch (e.getType()) {
		case Employee.PROFESSIONAL_SERVICES:
			return 24;
		case Employee.TRAINEE:
			return 12;
		case Employee.SUPPORT:
			return 18;
		default:
			throw new RuntimeException("Invalid Employee : "
                    + e.getType());
		}
	}

}
