package Exercice2;

/**
 * @author Karim ElHou
 *
 */
public class Maison {
	protected int surface;
	  protected Porte door;
	    
	  public Maison(int surface) 
	  {
	    this.surface = surface;
	    door = new Porte();
	  }
	    
	  public int getSurface()
	  {
	    return surface;
	  }
	    
	  public void setSurface(int value)
	  {
	    surface = value;
	  }
	    
	  public Porte getPorte()
	  {
	    return door; 
	  }
	    
	  public void setPorte(Porte d)
	  {
	    door = d;
	  }
	    
	  public void afficher() 
	  {
	    System.out.println("Je suis une maison, ma surface est de "+ surface +" m2.");
	  }
}
