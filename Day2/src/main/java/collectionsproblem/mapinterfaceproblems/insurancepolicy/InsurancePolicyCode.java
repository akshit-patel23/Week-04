package collectionsproblem.mapinterfaceproblems.insurancepolicy;

import java.util.Date;

public class InsurancePolicyCode {
    private String policyNumber;
    private String policyholderName;
    private Date expiryDate;
    private String policyType;
    private double premiumAmount;

    public InsurancePolicyCode(String policyNumber, String policyholderName, Date expiryDate, String policyType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.policyType = policyType;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyholderName() {
        return policyholderName;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public String getPolicyType() {
        return policyType;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    @Override
    public String toString() {
        return "PolicyNumber: " + policyNumber + ", Holder: " + policyholderName +
                ", Expiry: " + expiryDate + ", Type: " + policyType +
                ", Premium: " + premiumAmount;
    }
}
