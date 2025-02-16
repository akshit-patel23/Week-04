package collectionsproblem.queueinterfaceproblems.hospitatriagesystem;

import java.util.PriorityQueue;
import java.util.Queue;

public class HospitalTriageMain {
    public static void main(String[] args) {
        Queue<HospitalTriage> triages=new PriorityQueue<>();
        triages.add(new HospitalTriage(5,"Dev"));
        triages.add(new HospitalTriage(2,"Aditya"));
        triages.add(new HospitalTriage(6,"Ravi"));

        System.out.println("Patients List");
        for (HospitalTriage h:triages){
            System.out.println(h);
        }
        System.out.println("+--------------------------------------+");
        System.out.println("Patients in order");
        while (!triages.isEmpty()){
            System.out.println(triages.poll());
        }
    }
}
