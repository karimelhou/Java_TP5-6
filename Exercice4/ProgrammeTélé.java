package Exercice4;

/**
 * @author Karim ElHou
 *
 */
public class ProgrammeTélé {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i;
		System.out.println("*******************");

		Divertissement em1 = new Divertissement("Today Parasite", "Fury");
		if (em1.Programmer(20))
			System.out.println("emission programmée");
		else
			System.out.println("emission non programmée");

		Fiction em2 = new Fiction("Interstellar Discussion", "Nether", true, 3);
		if (em2.Programmer(17))
			System.out.println("emission programmée");
		else
			System.out.println("emission non programmée");

		Reportage em3 = new Reportage("LasVegas Dream", 1, 1);
		if (em3.Programmer(5))
			System.out.println("emission programmée");
		else
			System.out.println("emission non programmée");

		Reportage em4 = new Reportage("The Poker Journey", 1, 1);
		if (em4.Programmer(18))
			System.out.println("emission programmée");
		else
			System.out.println("emission non programmée");

		int nb_max = 24;
		Emission programme[] = new Emission[nb_max];
		programme[0] = em1;
		programme[1] = em2;
		programme[2] = em3;
		programme[3] = em4;
		int nbEmissions = 4;
		System.out.println("**************** ");

		for (i = 0; i < nbEmissions; i++) {
			if (programme[i].Programmee())
				programme[i].Affiche();
		}
		System.out.println("****************");

		boolean[] plage = new boolean[24];

		for (i = 0; i < 24; i++)
			plage[i] = false;

		System.out.println("****************");

		int[] plage2 = new int[24];
		for (i = 0; i < 24; i++)
			plage2[i] = -1;
		System.out.println("PLANNING GENERAL");
		for (i = 0; i < 24; i++) {
			System.out.println("Plage :" + i);
			if (plage2[i] != -1)
				programme[plage2[i]].Affiche();
			else
				System.out.println("Aucune émission");
		}
	}
}