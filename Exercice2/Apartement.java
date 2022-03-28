package Exercice2;

/**
 * @author Karim ElHou
 *
 */
public class Apartement extends Maison {
	public Apartement()
	  {
	    super(50);
	  }
	    
	  public void afficher()
	  {
	    System.out.println("Je suis un appartement, ma surface est " + surface + " m2");
	  }

}
