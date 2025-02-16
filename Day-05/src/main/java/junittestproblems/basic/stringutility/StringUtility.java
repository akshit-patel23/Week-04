package junittestproblems.basic.stringutility;

public class StringUtility {
    public static String reverseMethod(String str) {
        if (str == null || str.isEmpty()) { // Fixed null check
            throw new IllegalArgumentException("Please Enter valid String");
        } else {
            return new StringBuilder(str).reverse().toString();
        }
    }

    public static String uppercase(String str) {
        if (str == null || str.isEmpty()) { // Fixed null check
            throw new IllegalArgumentException("Please Enter valid String");
        } else {
            return str.toUpperCase();
        }
    }

    public static boolean palindrome(String str) throws NotPalindrome {
        if (str == null || str.isEmpty()) {
            throw new NotPalindrome("The String is not a Palindrome");
        }
        String ans = reverseMethod(str);

        if (!str.equalsIgnoreCase(ans)) {
            throw new NotPalindrome("The String is not a Palindrome");
        } else {
            return true;
        }
    }
}
