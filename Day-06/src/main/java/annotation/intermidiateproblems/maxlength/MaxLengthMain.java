package annotation.intermidiateproblems.maxlength;

public class MaxLengthMain {
    public static void main(String[] args) {
        try{
            MaxLengthCode user=new MaxLengthCode();
            user.register("Dev");
            System.out.println("Name :- "+user.getName());

            MaxLengthCode user2=new MaxLengthCode();
            user.register("DevAdityaSingh");
            System.out.println("Name :- "+user2.getName());


        } catch (IllegalArgumentException e) {
            System.out.println("Error :- "+e.getMessage());
        }
    }
}
