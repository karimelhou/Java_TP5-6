package Exercice2;

/**
 * @author Karim ElHou
 *
 */
public class Personne {
	protected String name;
	  protected Maison house;
	  
	  public Personne() 
	  {
	    name = "Karim";
	    house = new Maison(150);
	  }
	  
	  public Personne(String name, Maison house)
	  {
	    this.name = name;
	    this.house = house;
	  }
	  
	  public String getName()
	  {
	    return name;
	  }
	  
	  public void setName(String value) 
	  {
	    name = value;
	  }
	  
	  public Maison getHouse()
	  {
	    return house; 
	  }
	  
	  public void setHouse(Maison h)
	  {
	    house = h; 
	  }
	  
	  public void afficher() 
	  {
	    System.out.println("Je m'appele "+ name +".");
	    house.afficher();
	    house.door.afficher();
	  }

}
