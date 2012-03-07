package com.ericsson.problem6;

public class HolidayPolicy {
	public int allowedCasualLeaves(Employee e) {
		return e.getType().allowedCasualLeaves();
	}

}
