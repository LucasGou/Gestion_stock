package entites;

import common.common;
import common.materiel;

public class disquedur extends materiel implements common {
	int stockage;
	boolean SSD;
	
	
	public disquedur(String nom, String marque, int stockage, boolean SSD) {
		super(nom, marque);
		this.stockage = stockage;
		SSD = SSD;
	}


	@Override
	public void affichermateriel() {
		super.affichermateriel();
		System.out.println(" avec "+stockage+"Gb de stockage"+" et de type"+((SSD == true) ? " SSD ":" HDD "));
		
	}
	
	

}
