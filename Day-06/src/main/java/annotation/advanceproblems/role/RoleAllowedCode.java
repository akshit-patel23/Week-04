package annotation.advanceproblems.role;

public class RoleAllowedCode {
    @RoleAllowed("Admin")
    public void task(){
        System.out.println("Admin Task!");
    }
}
