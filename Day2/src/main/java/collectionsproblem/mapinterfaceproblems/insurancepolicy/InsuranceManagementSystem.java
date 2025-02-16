package collectionsproblem.mapinterfaceproblems.InsurancePolicyCode;


import collectionsproblem.mapinterfaceproblems.insurancepolicy.InsurancePolicyCode;

import java.util.*;

public class InsuranceManagementSystem {
    private Map<String, InsurancePolicyCode> hashMap = new HashMap<>();
    private Map<String, InsurancePolicyCode> linkedHashMap = new LinkedHashMap<>();
    private TreeMap<Date, InsurancePolicyCode> treeMap = new TreeMap<>();

    // Add a policy to all three data structures
    public void addPolicy(InsurancePolicyCode policy) {
        hashMap.put(policy.getPolicyNumber(), policy);
        linkedHashMap.put(policy.getPolicyNumber(), policy);
        treeMap.put(policy.getExpiryDate(), policy);
    }

    // Retrieve a policy by its number
    public InsurancePolicyCode getPolicyByNumber(String policyNumber) {
        return hashMap.get(policyNumber);
    }

    // List all policies expiring within the next 30 days
    public List<InsurancePolicyCode> getExpiringPolicies() {
        List<InsurancePolicyCode> expiringPolicies = new ArrayList<>();
        Date today = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(today);
        cal.add(Calendar.DAY_OF_YEAR, 30);
        Date next30Days = cal.getTime();

        for (Map.Entry<Date, InsurancePolicyCode> entry : treeMap.entrySet()) {
            if (!entry.getKey().after(next30Days)) {
                expiringPolicies.add(entry.getValue());
            }
        }
        return expiringPolicies;
    }

    // List all policies for a specific policyholder
    public List<InsurancePolicyCode> getPoliciesByHolder(String policyholderName) {
        List<InsurancePolicyCode> policies = new ArrayList<>();
        for (InsurancePolicyCode policy : hashMap.values()) {
            if (policy.getPolicyholderName().equalsIgnoreCase(policyholderName)) {
                policies.add(policy);
            }
        }
        return policies;
    }

    // Remove expired policies
    public void removeExpiredPolicies() {
        Date today = new Date();
        treeMap.entrySet().removeIf(entry -> entry.getKey().before(today));

        // Update HashMap and LinkedHashMap
        hashMap.values().removeIf(policy -> policy.getExpiryDate().before(today));
        linkedHashMap.values().removeIf(policy -> policy.getExpiryDate().before(today));
    }

    // Display all policies
    public void displayPolicies() {
        for (InsurancePolicyCode policy : linkedHashMap.values()) {
            System.out.println(policy);
        }
    }
}
