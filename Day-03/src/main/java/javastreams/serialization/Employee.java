package javastreams.serialization;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String name, department;
    private double salary;
    public Employee(int id, String name, String department, double salary){
        this.department=department;
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', department='" + department + "', salary=" + salary + "}";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(name, employee.name) &&
                Objects.equals(department, employee.department);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, department, salary);  //.equal call hua hai to hashcode aur data same hona chahiye isiliye
    }

}
