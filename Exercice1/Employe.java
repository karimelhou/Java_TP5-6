package Exercice1;

/**
 * @author Karim ElHou
 *
 */
public class Employe {
    protected String Nom;
    protected int Age;
    protected double Salaire;

    public Employe(String nom, int age, double salaire) {
        Nom = nom;
        Age = age;
        Salaire = salaire;
    }

    public void Augmenter(int Sal){
        Salaire+=Sal;
    }

    public void Afficher() {
        System.out.print("Nom='" + Nom + '\'' + ", / Age=" + Age + ", / Salaire=" + Salaire);
    }

    public double calculerSalaire(){
        return Salaire;
    }
}
