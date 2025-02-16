package collectionsproblem.setinterfaceproblems.insurancepolicy;

import java.util.Date;

public class InsurancePolicy implements Comparable<InsurancePolicy> {
    private String policyNumber,policyHolderName,coverageType;
    private double premium;
    private Date expiryDate;

    public InsurancePolicy(String policyNumber, String policyHolderName, Date expiryDate, String coverageType, double premium) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premium = premium;
    }
    public String getPolicyNumber() { return policyNumber; }
    public String getPolicyHolderName() { return policyHolderName; }
    public Date getExpiryDate() { return expiryDate; }
    public String getCoverageType() { return coverageType; }
    public double getPremiumAmount() { return premium; }

    @Override
    public int compareTo(InsurancePolicy other) {
        return this.expiryDate.compareTo(other.expiryDate); // Sort by expiry date
    }

    public String toString(){
        return "Policy{" +
                "Number='" + policyNumber + '\'' +
                ", Holder='" + policyHolderName + '\'' +
                ", Expiry=" + expiryDate +
                ", Coverage='" + coverageType + '\'' +
                ", Premium=" + premium +
                '}';
    }
}
