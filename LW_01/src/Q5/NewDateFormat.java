package Q5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NewDateFormat {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy");
        String formattedDate = today.format(formatter);
        System.out.println(formattedDate);
    }
}
