package fr.ordeawing.package1;

/**
 * Created by ordeawing on 09/06/17.
 */
public class intervalle {
    private int a;
    private int b;

    public intervalle(int a, int b){
        this.a = a;
        this.b = b;
    }

    public intervalle(){
        this.a = 0;
        this.b = 1;
    }

    @Override
    public String toString(){
        return "[" + a + "," + b + "]";
    }

    public int length(){
        return b-a;
    }

    public float getMiddle(){
        return ((float)b - (float)a)/2;
    }

    public boolean isBetween(double c){
        if(c > a && c < b) return true;
        else return false;
    }

    public int getMin(){
        return a;
    }

    public int getMax(){
        return b;
    }

    public String doSymmertrical(){
        if(-a < -b) return "Le symétrique de " + this.toString() + " est [" + -a + "," + -b + "]";
        else return "Le symétrique de " + this.toString() + " est [" + -b + "," + -a + "]";
    }

}