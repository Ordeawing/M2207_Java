package fr.ordeawing.package1;

/**
 * Created by ordeawing on 24/05/17.
 */
public class main {
    public static void main(String[] args) {
        humain romain = new humain("Romain","Dubois","Brou");
        System.out.println(romain);

        humain gabriel = new humain("Gabriel", "Dupont");
        System.out.println(gabriel);
        gabriel.setSurnom("Gab");
        System.out.println(gabriel);

        humain aurelie = new humain("Aurélie","Mouse");
        humain [] array = {aurelie, romain, gabriel};

        for (humain p: array){
            System.out.println(p.getPrenom());
        }
    }
}
