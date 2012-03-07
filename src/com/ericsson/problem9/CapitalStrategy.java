package com.ericsson.problem9;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CapitalStrategy {
    private static final Date NO_DATE =
            new GregorianCalendar(2011, Calendar.JANUARY, 1).getTime();

    public double getCapital(Loan loan) {
        if(loan.getExpiry().equals(NO_DATE) &&
                !loan.getMaturity().equals(NO_DATE)) {
            return loan.getCommitment() * loan.getDuration()
                    * loan.getRiskFactor();
        }
        return 0.0;
    }
}
