package collectionsproblemstest.mapinterfacetest.groupobjecttest;

import collectionsproblem.mapinterfaceproblems.groupobject.Department;
import collectionsproblem.mapinterfaceproblems.groupobject.Employee;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static collectionsproblem.mapinterfaceproblems.groupobject.GroupObject.information;

public class GroupObjectTest {
    @Test
    public void Tester(){
        Map<Department, ArrayList<Employee>> result=new HashMap<>();
        Department d1=new Department("HR");
        Department d2=new Department("Manager");
        Employee e1=new Employee("Dev");
        Employee e2=new Employee("Aditya");
        Employee e3=new Employee("Bunny");
        information(result,e1,d1);
        information(result,e2,d1);
        information(result,e3,d1);
        information(result,e1,d2);
        information(result,e2,d2);
        Assert.assertEquals(2,result.size());

    }
}
