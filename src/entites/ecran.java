package entites;

import common.common;
import common.materiel;

public class ecran extends materiel implements common {
int resolution;
String connectique;

	public ecran(String nom, String marque, int resolution, String connectique) {
	super(nom, marque);
	this.resolution = resolution;
	this.connectique = connectique;
}

	@Override
	public void affichermateriel() {
		super.affichermateriel();
		System.out.println(" avec une résolution de "+resolution+" pouces et avec les connectiques suivantes : "+connectique);
		
	}

}
