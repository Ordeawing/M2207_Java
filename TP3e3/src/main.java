/**
 * Created by ordeawing on 09/06/17.
 */
public class main {
    public static void main(String[] args) {
        triangle first = new triangle(77,36,85);
        System.out.println(first.estRectangle());
        System.out.println(first.air());

        triangle second = new triangle(28,45);
        System.out.println(second.hypotenuse());
    }
}
