package fr.ordeawing.pkg1;

/**
 * Created by ordeawing on 10/05/17.
 */
public class Exo2 {
    public static void main(String[] args) {
        String input = "1580";
        int num = 45789;
        int toConvert = 14526;
        // 1 - String to Int
        int nbrX = Integer.parseInt(input);
        int nbrY = Integer.valueOf(input);

        // 2 - Int to String
        String chz = Integer.toString(num);

        // 3 - Int to Bin & Hex
        String bin = Integer.toBinaryString(toConvert);
        String hex = Integer.toHexString(toConvert);
        System.out.println(bin + "  " + hex);

        // statique = nom classe . methode
        // non statique = nom objet . methode
    }
}
