package Exercice3;

import java.util.Scanner;

/**
 * @author Karim ElHou
 *
 */
public class Forme {

	public static void main(String[] args) {
		double x, y, r, r1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer les coordonnees de disque");
		System.out.print("x: ");
		x = sc.nextDouble();
		System.out.print("y: ");
		y = sc.nextDouble();
		System.out.print("Entere le rayon de disque: ");
		r = sc.nextDouble();
		System.out.print("Entrer le rayon de trou de Couroune: ");
		r1 = sc.nextDouble();

		sc.close();

		Disque c = new Couronne(x, y, r, r1);
		System.out.printf("%s\nla surface de Couroune est:%.2f", c.toString(), c.aire());
	}
}
