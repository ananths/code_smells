package com.ericsson.problem6;

public enum EmployeeType {

	PROFESSIONAL_SERVICES() {
		@Override
		public double calculatePay() {
			// ... some logic
			return 0;
		}

		@Override
		public int allowedCasualLeaves() {
			return 24;
		}
	},

	TRAINEE() {
		@Override
		public double calculatePay() {
			// ... some logic
			return 0;
		}

		@Override
		public int allowedCasualLeaves() {
			return 12;
		}
	},

	SUPPORT() {
		@Override
		public double calculatePay() {
			// ... some logic
			return 0;
		}

		@Override
		public int allowedCasualLeaves() {
			return 18;
		}
	};

	public abstract double calculatePay();

	public abstract int allowedCasualLeaves();
}
