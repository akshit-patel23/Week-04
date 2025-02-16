package junittestproblems.advance.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Date {
    public static String check(String date) {
        // Corrected regex pattern (Ensures full date match)
        String regex = "^\\d{4}-\\d{2}-\\d{2}$";

        if (date == null || !date.matches(regex)) {
            throw new IllegalArgumentException("Date format is incorrect, please use (yyyy-MM-dd)");
        } else {
            System.out.println("Valid Format!");
        }

        try {
            // Parsing date correctly
            LocalDate date1 = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

            // Corrected DateTimeFormatter for dd-MM-yyyy
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            return date1.format(dateTimeFormatter);

        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Please enter a valid date!");
        }
    }
}
