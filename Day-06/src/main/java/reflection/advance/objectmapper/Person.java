package reflection.advance.objectmapper;

class Person {
    private String name;
    private int age;

 public Person() {}

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}