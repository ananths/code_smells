package com.ericsson.problem3;

import java.util.Date;

public class Loan {
    private Date expiry;
    private Date maturity;
    private double commitment;
    private double duration;
    private double riskFactor;
    private double unusedPercentage;
    private double outStandingRiskAmount;
    private double unusedRiskAmount;
    
    

    public Date getExpiry() {
        return expiry;
    }

    public Date getMaturity() {
        return maturity;
    }

    public double getCommitment() {
        return commitment;
    }

    public double getDuration() {
        return duration;
    }

    public double getRiskFactor() {
        return riskFactor;
    }

    public double getUnusedPercentage() {
        return unusedPercentage;
    }

    public double getOutStandingRiskAmount() {
        return outStandingRiskAmount;
    }

    public double getUnusedRiskAmount() {
        return unusedRiskAmount;
    }
}
