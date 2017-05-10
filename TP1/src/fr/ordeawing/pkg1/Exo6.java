package fr.ordeawing.pkg1;

/**
 * Created by ordeawing on 10/05/17.
 */
public class Exo6 {
    public static void main(String[] args) {
        int n = 41;
        int lim = (int)Math.sqrt(n);
        boolean [] t = new boolean[n];

        // mettre a true tout les elements
        for (int i = 0; i < t.length; i++){
            t[i] = true;
        }
        t[1] = false;
        for (int i = 2; i < lim; i++){
            if(t[i]){
                int k = 2;
                while (k*i < n){
                    t[k*i] = false;
                    k++;
                }
            }
        }
        for (int i = 2 ; i < t.length; i++){
            if (t[i]) System.out.print(i + " ");
        }

    }
}
