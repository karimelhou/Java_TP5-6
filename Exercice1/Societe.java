package Exercice1;

import java.util.Scanner;

/**
 * @author Karim ElHou
 *
 */
public class Societe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Faire entrer les information de Technecien:");

        System.out.print("Nom: ");
        String n = sc.next();

        System.out.print("Age: ");
        int a = sc.nextInt();
        System.out.print("Salaire: ");
        double s = sc.nextDouble();
        System.out.print("Grade: ");
        byte g = sc.nextByte();
        while (g<1 || g>3){
            System.out.print("Reecrire le grade(entre 1 et 3): ");
            g= sc.nextByte();
        }
        sc.close();

        Employe T = new Technicien(n,a,s,g);
        T.Afficher();
    }
}
