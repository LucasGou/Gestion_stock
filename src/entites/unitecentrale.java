package entites;

import common.common;
import common.materiel;

public class unitecentrale extends materiel implements common {
int ram;
int DD;
String processeur;

	
	public unitecentrale(String nom, String marque, int ram, int DD, String processeur) {
	super(nom, marque);
	this.ram = ram;
	DD = DD;
	this.processeur = processeur;
}


	@Override
	public void affichermateriel() {
		super.affichermateriel();
		System.out.println(" avec "+ram+"Gb de ram et"+DD+"Gb d'emplacement disque et un processeur "+processeur);
		
	}

}
