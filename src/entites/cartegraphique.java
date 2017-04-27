package entites;

import common.common;
import common.materiel;

public class cartegraphique extends materiel implements common {
	int ram;

	public cartegraphique(String nom, String marque, int ram) {
		super(nom, marque);
		this.ram = ram;
	}

	@Override
	public void affichermateriel() {
		super.affichermateriel();
		System.out.println(" avec "+ram+"Gb de ram");
	}
	
	
	
	
	
}
