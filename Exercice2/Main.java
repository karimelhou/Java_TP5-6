package Exercice2;

/**
 * @author Karim ElHou
 *
 */
public class Main {
	public static void main(String[] args) 
	  {
	       Apartement MyApartament = new Apartement();
	       Personne person = new Personne();
	       person.name = "Karim";
	       person.house = MyApartament;
	       person.afficher();
	  }
}
