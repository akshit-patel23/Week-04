package collectionsproblemstest.queueinterfacetest.hospitaltriagesystemtest;

import collectionsproblem.queueinterfaceproblems.hospitatriagesystem.HospitalTriage;
import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;
import java.util.Queue;

public class HospitalTest {
    @Test
    public void Tester(){
        Queue<HospitalTriage> triages=new PriorityQueue<>();
        triages.add(new HospitalTriage(5,"Dev"));
        triages.add(new HospitalTriage(2,"Aditya"));
        triages.add(new HospitalTriage(6,"Ravi"));

        Assert.assertEquals("Ravi", triages.poll().getName());
    }
}
