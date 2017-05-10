package fr.ordeawing.pkg1;
//package java.lang;

/**
 * Created by ordeawing on 10/05/17.
 */
public class Exo1 {
    public static void main(String[] args) {
        String phrase = "Before you start coding, it’s a good idea to sit down and think about your problem";
        System.out.println("Il y a " + phrase.length() + " caract dans la phrase.");
        char[] charArray = phrase.toCharArray();
        System.out.println("La premiere lettre est: " + charArray[0] + " le dernier est: " + charArray[phrase.length()-1]);
        System.out.println(phrase.toUpperCase());

        for(int i = 0; i < phrase.length(); i++){
            if(charArray[i] == 'r'){
                System.out.println("Le premier R est a la pos: " + (i+1));
                break;
            }
        }

        int nbrA = 0;
        for (int i = 0; i < phrase.length(); i++){
            if (charArray[i] == 'a'){
                nbrA++;
            }
        }
        System.out.println("Il y a: " + nbrA + " de fois la lettre A.");
    }
}
