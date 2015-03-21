package com.micro.model

/**
 */
class LoanRepresentation {
    private String loanId;
    private String job;
    private double amount;
    private String fraudStatus;
    private String decision;

    String getLoanId() {
        return loanId
    }

    String getJob() {
        return job
    }

    double getAmount() {
        return amount
    }

    String getFraudStatus() {
        return fraudStatus
    }

    String getDecision() {
        return decision
    }
}
