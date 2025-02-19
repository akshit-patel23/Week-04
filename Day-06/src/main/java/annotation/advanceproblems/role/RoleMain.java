package annotation.advanceproblems.role;

import java.lang.reflect.Method;

import static annotation.advanceproblems.role.RoleValidator.validate;

public class RoleMain {
    public static void main(String[] args) {
        RoleAllowedCode service=new RoleAllowedCode();
        System.out.println("User with ADMIN role:");
        validate(new RoleAllowedCode(), "task", "Admin"); // Allowed

        System.out.println("\nUser with USER role:");
        validate(new RoleAllowedCode(), "task", "USER"); // D
    }
}
