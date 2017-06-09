package fr.ordeawing.package1;

/**
 * Created by ordeawing on 09/06/17.
 */
public class main {
    public static void main(String[] args) {
        intervalle i1 = new intervalle(-3,4);
        System.out.println(i1.getMiddle());
        System.out.println(i1.isBetween(5));
        System.out.println(i1.isBetween(3.2));
        System.out.println(i1.doSymmertrical());
        System.out.println(i1.length());
        System.out.println(i1.toString());

        intervalle i2 = new intervalle();
        System.out.println(i2.getMiddle());
        System.out.println(i2.isBetween(5));
        System.out.println(i2.isBetween(3.2));
        System.out.println(i2.doSymmertrical());
        System.out.println(i2.length());
        System.out.println(i2.toString());

        intervalle i3 = new intervalle(100,200);
        System.out.println(i3.getMiddle());
        System.out.println(i3.isBetween(5));
        System.out.println(i3.isBetween(3.2));
        System.out.println(i3.doSymmertrical());
        System.out.println(i3.length());
        System.out.println(i3.toString());
    }
}
