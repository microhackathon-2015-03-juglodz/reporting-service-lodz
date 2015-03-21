package com.micro.model;

/**
 */
public class LoanDecisionRepresentation {
    private String loanId;
    private String job;
    private double amount;
    private String fraudStatus;
    private String decision;

    public String getLoanId() {
        return loanId;
    }

    public String getJob() {
        return job;
    }

    public double getAmount() {
        return amount;
    }

    public String getFraudStatus() {
        return fraudStatus;
    }

    public String getDecision() {
        return decision;
    }
}
