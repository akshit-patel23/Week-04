package javastreamstest.serializationtest;

import javastreams.serialization.Employee;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static javastreams.serialization.SerializationCode.readFromFile;
import static javastreams.serialization.SerializationCode.readWrite;

public class SerializationTest {
    @Test
    public void Tester(){
        String path="src/main/java/javastreams/serialization/Sample1.txt";
        Employee e1=new Employee(2111,"Dev","Manager",20000.0);
        Employee e2=new Employee(2232,"Aditya","Manager",20000.0);
        Employee e3=new Employee(2142,"Rahul","Manager",20000.0);
        Employee e4=new Employee(2112,"Maddy","Manager",20000.0);
        Employee e5=new Employee(2134,"Ravi","Manager",20000.0);
        List<Employee> li=new ArrayList<>(Arrays.asList(e1,e2,e3,e4,e5));
        readWrite(path,li);

        List<Employee> deserial=readFromFile(path);
        Assert.assertTrue(li.size() == deserial.size() && li.containsAll(deserial));

    }
}
