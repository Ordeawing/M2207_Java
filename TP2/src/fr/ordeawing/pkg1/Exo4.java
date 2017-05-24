package fr.ordeawing.pkg1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
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

        LocalDateTime nowPlus = time1.plusHours(2).plusMinutes(45);
        System.out.println(nowPlus.format(formatter1));
        LocalDate birthday = LocalDate.of(2002,8,18);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy");
        System.out.println(birthday.format(dateFormatter));
        Period period = Period.between(birthday, time1.toLocalDate());
        System.out.println("J'suis agé de " + period.getYears() + "ans " + period.getMonths() + "mois " + period.getDays() + "jours.");
    }
}
