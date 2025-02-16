package junittestproblems.advance.passwordstrength;

public class Password{
    private String password;
    public Password(String password){
        String regex="^(?=.*[A-Z])(?=.*[\\d]).{8,}$";//
        if(!password.matches(regex)){
            throw new IllegalArgumentException("Please enter valid password");
        }
        else {
            System.out.println("Password created");
        }
    }
}
