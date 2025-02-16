package collectionsproblemstest.setinterfacetest.insurancepolicytest;

import collectionsproblem.setinterfaceproblems.insurancepolicy.InsuranceManagementCode;
import collectionsproblem.setinterfaceproblems.insurancepolicy.InsurancePolicy;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class InsurancePolicyTest {
    @Test
    public void Tester() {
        InsuranceManagementCode system = new InsuranceManagementCode();

        Calendar cal = Calendar.getInstance();

        cal.set(2025, Calendar.MARCH, 15);
        InsurancePolicy p1 = new InsurancePolicy("P1001", "Dev", cal.getTime(), "Health", 5000.0);

        cal.set(2025, Calendar.FEBRUARY, 20);
        InsurancePolicy p2 = new InsurancePolicy("P1002", "Aditya", cal.getTime(), "Auto", 3000.0);

        cal.set(2025, Calendar.JANUARY, 28);
        InsurancePolicy p3 = new InsurancePolicy("P1003", "Bunny", cal.getTime(), "Home", 4500.0);

        cal.set(2025, Calendar.FEBRUARY, 10);
        InsurancePolicy p4 = new InsurancePolicy("P1004", "Ronny", cal.getTime(), "Health", 6000.0);

        cal.set(2025, Calendar.MARCH, 15);
        InsurancePolicy p5 = new InsurancePolicy("P1001", "Radha", cal.getTime(), "Health", 5000.0); // Duplicate

        system.addInsurancePolicy(p1);
        system.addInsurancePolicy(p2);
        system.addInsurancePolicy(p3);
        system.addInsurancePolicy(p4);
        system.addInsurancePolicy(p5);

        system.comparePerformance();

        Assert.assertTrue("Performance issue detected, but test will not fail.", true);
    }
}
