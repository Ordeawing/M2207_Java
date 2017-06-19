package fr.ordeawing.package1;

import static java.lang.Math.sqrt;

/**
 * Created by carnet4u on 19/06/2017.
 */
public class vecteur {
    private double x, y;

    public vecteur(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double norme(){
        return sqrt(x*x+y*y);
    }

    public vecteur scalaire(double a){
        return new vecteur(a*x,a*y);
    }
}
