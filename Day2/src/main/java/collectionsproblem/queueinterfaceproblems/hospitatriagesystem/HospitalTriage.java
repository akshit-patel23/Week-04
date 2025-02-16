package collectionsproblem.queueinterfaceproblems.hospitatriagesystem;

public class HospitalTriage implements Comparable<HospitalTriage>{

    int number;
    String name;
    public HospitalTriage(int number,String name){
        this.number=number;
        this.name=name;
    }

    @Override
    public int compareTo(HospitalTriage o) {
        return Integer.compare(o.number,this.number);
    }
public String getName(){
        return name;
}
    @Override
    public String toString(){
        return ("Name of patient :- "+name+"\n Severity :- "+number);
    }

}
