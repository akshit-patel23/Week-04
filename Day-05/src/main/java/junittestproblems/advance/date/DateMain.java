package junittestproblems.advance.date;

import static junittestproblems.advance.date.Date.check;

public class DateMain {
    public static void main(String[] args) {
        String date1 = "2023-12-25";

        try {
            System.out.println("Formatted Date: " + check(date1));
            } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
