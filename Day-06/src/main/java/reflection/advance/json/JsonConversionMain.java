package reflection.advance.json;

import static reflection.advance.json.JsonConversion.jsonConversion;

public class JsonConversionMain {
    public static void main(String[] args) throws IllegalAccessException {
        Person person=new Person("Dev",21);
        System.out.println("The json formate is "+jsonConversion(person));
    }
}
