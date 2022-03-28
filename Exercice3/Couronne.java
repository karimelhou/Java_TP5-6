package Exercice3;

/**
 * @author Karim ElHou
 *
 */
public class Couronne extends Disque{
    private double r2;

    public Couronne(double x, double y, double r1, double r2) {
        super(x, y, r1);
        this.r2 = r2;
    }

    public String toString() {
        return super.toString()+"Couronne{" +
                "r2=" + r2 +
                '}';
    }

    public boolean equals(Couronne o) {
        return super.equals(o) && this.r2==o.r2;
    }

    public double aire(){
        return super.aire()-Math.PI*Math.pow(r2,2);
    }
}
