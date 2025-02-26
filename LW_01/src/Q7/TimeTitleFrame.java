package Q7;

import javax.swing.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeTitleFrame {
    public static void main(String[] args) {

        LocalTime now = LocalTime.now();


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String timeString = now.format(formatter);

        JFrame frame = new JFrame();
        frame.setTitle(timeString);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}
