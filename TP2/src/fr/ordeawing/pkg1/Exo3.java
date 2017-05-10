package fr.ordeawing.pkg1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ordeawing on 10/05/17.
 */
public class Exo3 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList();
        for(int i = 1; i < 4; i++){
            list1.add(i);
        }
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList();
        int[] tab = {1, 6, 9, 3, 5};

        // avec un for
        /*for(int i = 0; i < tab.length; i++){
            list2.add(tab[i]);
        }*/

        // avec un foreach
        for (int partOf : tab) {
            list2.add(partOf);
        }
        System.out.println(list2);

    }
}
