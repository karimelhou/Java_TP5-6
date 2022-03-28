package Exercice2;

/**
 * @author Karim ElHou
 *
 */
public class Porte {
	protected String color;
    
	  public Porte() 
	  {
	    color = "blue";
	  }
	    
	  public Porte(String color) 
	  {
	    this.color = color;
	  }
	    
	  public String getColor()
	  {
	    return color;
	  }
	    
	  public void setColor(String value)
	  {
	    color = value;
	  }
	    
	  public void afficher() 
	  {
	    System.out.println("Je suis une porte, ma couleur est "+ color +".");
	  }

}
