package Q4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DisplayDate {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM yyyy");
        String formattedDate = today.format(formatter);
        System.out.println(formattedDate);
    }
}
