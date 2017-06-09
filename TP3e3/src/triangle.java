import static java.lang.Math.sqrt;

/**
 * Created by ordeawing on 09/06/17.
 */
public class triangle {
    private int cote1;
    private int cote2;
    private int cote3;

    public triangle(int cote1, int cote2, int cote3){
        this.cote1 = cote1;
        this.cote2 = cote2;
        this.cote3 = cote3;
    }

    public triangle(int cote1, int cote2){
        this.cote1 = cote1;
        this.cote2 = cote2;
        this.cote3 = 0;
    }

    public boolean estEquilateral(){
        if(cote1 == cote2 && cote2 == cote3) return true;
        else return false;
    }

    public boolean estRectangle(){
        if(cote1 > cote2 && cote1 > cote3){
            if(sqrt((cote3*cote3)+(cote2*cote2)) == cote1) return true;
            else return false;
        }else if (cote2 > cote1 && cote2 > cote3){
            if(sqrt((cote3*cote3)+(cote1*cote1)) == cote2) return true;
            else return false;
        }else /*if(cote3 > cote1 && cote3 > cote2)*/{
            if(sqrt((cote1*cote1)+(cote2*cote2)) == cote3) return true;
            else return false;
        }
    }

    public double air(){
        double p = (cote1 + cote2 + cote3) / 2;
        return sqrt(p*(p-cote1)*(p-cote2)*(p-cote3));
    }

    public double hypotenuse(){
        if(cote3 != 0) return cote3;
        else{
            return sqrt((cote1*cote1)+(cote2*cote2));
        }
    }
}
