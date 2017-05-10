package fr.ordeawing.pkg1;

/**
 * Created by ordeawing on 03/05/17.
 */
public class Exo4 {
    public static void main(String[] args) {
        double lim = 20;
        double s = 0;
        int i = 0;
        while (s < lim){
            i = i + 1;
            s = s + 1.0/i;
        }
        System.out.println("La somme vaut " + s + " pour i = " + i);
    }
}
