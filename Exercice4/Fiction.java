package Exercice4;

/**
 * @author Karim ElHou
 *
 */
class Fiction extends Emission {
	private String realisateur ;
	private boolean rediffusion ;
	private int duree, annee ;
	/**
	 * @param n
	 * @param real
	 * @param redif
	 * @param d
	 */
	public Fiction (String n,String real,boolean redif, int d ){
		nom = n ; realisateur = real ;
		rediffusion = redif ; duree = d ;
	}
	public void Affiche(){
		super.Affiche() ;
		System.out.println("R�alisateur :" + realisateur) ;
		System.out.println("Duree :" + duree) ;
		System.out.println("Ann�e de r�alisation :" + annee) ;
			if ( rediffusion )
				System.out.println("C'est une rediffusion") ;
			else
				System.out.println("Premi�re Diffusion !") ;
	}
	public boolean Programmer(int heure) {
		if ( rediffusion || heure == 21 ) {
			heure_debut = heure ;
			heure_fin = heure + duree ;
			return true ;
		} 
		else return false ;
	}
}

