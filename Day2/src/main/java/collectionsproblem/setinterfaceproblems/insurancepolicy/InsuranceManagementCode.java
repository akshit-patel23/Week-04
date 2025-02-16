package collectionsproblem.setinterfaceproblems.insurancepolicy;

import java.util.*;

public class InsuranceManagementCode {
    public static long treetime,hashtime,linkedtime;
    private Set<InsurancePolicy> hashSetPolicies = new HashSet<>();
    private Set<InsurancePolicy> linkedHashSetPolicies = new LinkedHashSet<>();
    private Set<InsurancePolicy> treeSetPolicies = new TreeSet<>();

    public void addInsurancePolicy(InsurancePolicy InsurancePolicy) {
        hashSetPolicies.add(InsurancePolicy);
        linkedHashSetPolicies.add(InsurancePolicy);
        treeSetPolicies.add(InsurancePolicy);
    }
    public List<InsurancePolicy> getAllPolicies() {
        return new ArrayList<>(hashSetPolicies);
    }

    public List<InsurancePolicy> expiringPolicy(){
        List<InsurancePolicy> expiring=new ArrayList<>();
        Date now= new Date();

        Calendar cal=Calendar.getInstance();
        cal.setTime(now);
        cal.add(Calendar.DAY_OF_MONTH,30);
        Date thirtyDays=cal.getTime();

        for (InsurancePolicy policy : treeSetPolicies) {
            if (policy.getExpiryDate().after(now) && policy.getExpiryDate().before(thirtyDays)) {
                expiring.add(policy);
            }
        }
        return expiring;
    }
    public List<InsurancePolicy> getPoliciesByCoverage(String coverageType) {
        List<InsurancePolicy> result = new ArrayList<>();
        for (InsurancePolicy policy : hashSetPolicies) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                result.add(policy);
            }
        }
        return result;
    }
    public List<InsurancePolicy> getDuplicatePolicies() {
        Set<String> uniquePolicyNumbers = new HashSet<>();
        List<InsurancePolicy> duplicates = new ArrayList<>();

        for (InsurancePolicy policy : linkedHashSetPolicies) {
            if (!uniquePolicyNumbers.add(policy.getPolicyNumber())) {
                duplicates.add(policy);
            }
        }
        return duplicates;
    }
    public void comparePerformance() {
        int testSize = 100000;
        Set<InsurancePolicy> hashSet = new HashSet<>();
        Set<InsurancePolicy> linkedHashSet = new LinkedHashSet<>();
        Set<InsurancePolicy> treeSet = new TreeSet<>();

        List<InsurancePolicy> testPolicies = new ArrayList<>();
        for (int i = 0; i < testSize; i++) {
            testPolicies.add(new InsurancePolicy("P" + i, "Holder" + i, new Date(), "Auto", 1000.0));
        }

        System.out.println("\n--- Performance Comparison ---");

        // Adding Performance
        long start = System.nanoTime();
        hashSet.addAll(testPolicies);
        long end = System.nanoTime();

        System.out.println("HashSet Add Time: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedHashSet.addAll(testPolicies);
        end = System.nanoTime();

        System.out.println("LinkedHashSet Add Time: " + (end - start) + " ns");

        start = System.nanoTime();
        treeSet.addAll(testPolicies);
        end = System.nanoTime();

        System.out.println("TreeSet Add Time: " + (end - start) + " ns");

        // Searching Performance
        InsurancePolicy searchPolicy = new InsurancePolicy("P50000", "Holder50000", new Date(), "Auto", 1000.0);

        start = System.nanoTime();
        boolean found = hashSet.contains(searchPolicy);
        end = System.nanoTime();
        hashtime=end-start;
        System.out.println("HashSet Search Time: " + (end - start) + " ns");

        start = System.nanoTime();
        found = linkedHashSet.contains(searchPolicy);
        end = System.nanoTime();
        linkedtime=end-start;
        System.out.println("LinkedHashSet Search Time: " + (end - start) + " ns");

        start = System.nanoTime();
        found = treeSet.contains(searchPolicy);
        end = System.nanoTime();
        treetime=end-start;
        System.out.println("TreeSet Search Time: " + (end - start) + " ns");
    }




}
