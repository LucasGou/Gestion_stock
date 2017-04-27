package common;

public class materiel implements common {
	String nom;
	String marque;

	public materiel(String nom, String marque) {
		super();
		this.nom = nom;
		this.marque = marque;
	}

	@Override
	public void affichermateriel() {
		System.out.print("Le matériel est un(e) "+nom+" de marque "+marque);
		
	}


}
