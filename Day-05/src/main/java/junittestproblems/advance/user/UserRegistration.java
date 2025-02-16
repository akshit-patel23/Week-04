package junittestproblems.advance.user;

public class UserRegistration {
    private String username, email, password;

    public UserRegistration(String username, String email, String password){
        if(username==null){
            throw new IllegalArgumentException("Please enter Valid username!");
        }
        if(email==null||!email.matches("[A-Za-z0-9]+@[a-zA-Z]+\\.[a-z]{2,3}")){
            throw new IllegalArgumentException("Please enter Valid email!");
        }if(password==null){
            throw new IllegalArgumentException("Please enter Valid password!");
        }
        this.password=password;
        this.email=email;
        this.username=username;
    }
}
