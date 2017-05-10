package fr.ordeawing.pkg1;

/**
 * Created by ordeawing on 03/05/17.
 */
public class Exo3 {
    public static void main(String[] args) {
        int j = 11;
        int m = 7;
        int a = 1998;
        int t, b;
        if(m <= 2){
            t = m + 10;
            b = a - 1;
        }else{
            t = m-2;
            b=a;
        }
        int c = b/100;
        int d = b-100*c;
        int w = j+(int)(2.6*t-0.2)+d+d/4+c/4+5*c;
        int n = w % 7;
        System.out.println(n);
        switch (n){
            case 0:
                System.out.println("Dimanche");
                break;
            case 1:
                System.out.println("Lundi");
                break;
            case 2:
                System.out.println("Mardi");
                break;
            case 3:
                System.out.println("Mercredi");
                break;
            case 4:
                System.out.println("Jeudi");
                break;
            case 5:
                System.out.println("Vendredi");
                break;
            case 6:
                System.out.println("Samedi");
                break;
        }
    }
}
