package common;

import java.util.ArrayList;
import java.util.List;

public class lieustockage {
	List<emplacement> listelieustockage = new ArrayList<emplacement>();
	
	public lieustockage() {
		super();
	}

	public lieustockage(List<emplacement> listelieustockage) {
		super();
		this.listelieustockage = listelieustockage;
	}

	public void ajouter(emplacement unlieustockage){
		listelieustockage.add(unlieustockage);
	}
	
	public void afficher(){
		for (emplacement m : listelieustockage){
			m.donneemplacement();
			m.liste();
		}
	new menuprincipal(); // � modifier pour avoir le menuprincipal avec lieustockage existant (ici recreer et donc efface)
	}
}