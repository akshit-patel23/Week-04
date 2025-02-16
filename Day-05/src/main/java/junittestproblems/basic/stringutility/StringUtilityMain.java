package junittestproblems.basic.stringutility;

import static junittestproblems.basic.stringutility.StringUtility.*;

public class StringUtilityMain {
    public static void main(String[] args) throws NotPalindrome {
        String input="Deepak";
        System.out.println(reverseMethod(input));
        System.out.println(uppercase(input));
        try{
        System.out.println(palindrome(input));}
        catch (NotPalindrome e){
            System.out.println("Error "+e.getMessage());
        }
    }
}
