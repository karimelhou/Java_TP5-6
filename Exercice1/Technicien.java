package Exercice1;

/**
 * @author Karim ElHou
 *
 */
public class Technicien extends Employe{
    private byte grade;

    public Technicien(String nom, int age, double salaire, byte grade) {
        super(nom, age, salaire);
        this.grade = grade;
    }

    public int Prime(){
        if (grade==1) return 100;
        else if (grade==2) return 200;
        else return 300;
    }

    public void Afficher() {
        System.out.print("Nom='" + Nom + '\'' + ", / Age=" + Age + ", / Salaire=" + ((int)Salaire+Prime()));
    }
}
