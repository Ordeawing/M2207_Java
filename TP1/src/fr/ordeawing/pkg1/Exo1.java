package fr.ordeawing.pkg1;

/**
 * Created by ordeawing on 03/05/17.
 */
public class Exo1 {
    public static void main(String[] args) {
        int a = 4328;
        int hour = a / 3600;
        int r = a % 3600;
        int min = r / 60;
        int sec = r % 60;

        System.out.println("la durée " + a + " secondes se décompose en " + hour + " h " + min + " mn " + sec + " sec");
    }
}
