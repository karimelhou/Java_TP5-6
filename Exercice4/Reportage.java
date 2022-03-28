package Exercice4;

/**
 * @author Karim ElHou
 *
 */
class Reportage extends Emission {
	private static final String theme[] ={"Information","Animalier","Culturel"};
	private int duree, type_theme ;
	public Reportage (String n, int t, int d){
		nom = n ; type_theme = t ; duree = d ;
	}
	public void Affiche(){
		super.Affiche() ;
		switch ( type_theme ) {
			case 1 :
				System.out.println("Theme :" + theme[1]) ;
				break ;
			case 2 :
				System.out.println("Theme :" + theme[2]) ;
				break ;
			case 3 :
				System.out.println("Theme :" + theme[3]) ;
				break ;
			}
			System.out.println("Duree :" + duree) ;
		}
	
		/**
		 *
		 */
		public boolean Programmer(int heure) {
			if ( duree ==1 && (( heure >=14 && heure <=18) || (heure >=0 && heure <=6)) ) {
				heure_debut = heure ;
				heure_fin = heure + duree ;
				return true ;
		}
			else return false ;
		
		}
}