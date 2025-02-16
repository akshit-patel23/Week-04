package junittestproblems.advance.passwordstrength;

public class PasswordMain {
    public static void main(String[] args) {
        try{
        Password password=new Password("Deepak123");}
        catch (IllegalArgumentException e){
            System.out.println("Error "+e.getMessage());
        }
    }
}
