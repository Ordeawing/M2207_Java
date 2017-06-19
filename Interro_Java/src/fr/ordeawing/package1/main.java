package fr.ordeawing.package1;

/**
 * Created by carnet4u on 19/06/2017.
 */
public class main {
    public static void main(String[] args) {
        vecteur vecteur1 = new vecteur(-3,4);
        vecteur vecteur2 = vecteur1.scalaire(2);
        System.out.println(vecteur1.norme());
        System.out.println(vecteur2.norme());
    }
}

