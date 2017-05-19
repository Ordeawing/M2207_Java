package fr.ordeawing.pkg1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by ordeawing on 19/05/17.
 */
public class Exo4 {
    public static void main(String[] args) {
        LocalDateTime time1 = LocalDateTime.now();
        System.out.println(time1);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("EEEE dd MMM yyyy HH:mm");
        String format1 = time1.format(formatter1);
        System.out.println(format1);
    }
}
