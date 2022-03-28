package Exercice3;


/**
 * @author Karim ElHou
 *
 */
public class Disque {
    private double x,y,r;

    public Disque(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public String toString() {
        return "Disque{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                "}\n";
    }

    public boolean equals(Disque o) {
        return this.x == o.x && this.y == o.y & this.x == o.r;
    }

    public double aire(){
        return Math.PI*Math.pow(r,2);
    }

}
