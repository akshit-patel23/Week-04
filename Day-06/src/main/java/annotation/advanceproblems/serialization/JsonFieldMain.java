package annotation.advanceproblems.serialization;

public class JsonFieldMain {
    public static void main(String[] args) {
        JsonFieldCode user = new JsonFieldCode("Deepak", "deepak@gmail.com", 22);

        String jsonString = JsonFieldCode.json(user);
        System.out.println(jsonString);
    }
}
