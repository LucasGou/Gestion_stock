package entites;

import common.common;
import common.materiel;

public class imprimante extends materiel implements common {
boolean scanner;
boolean grande;

public imprimante(String nom, String marque, boolean scanner, boolean grande) {
	super(nom, marque);
	this.scanner = scanner;
	this.grande = grande;
}

@Override
public void affichermateriel() {
	super.affichermateriel();
	System.out.println(" elle"+((scanner == true) ? " a un scanner ":" n'a pas de scanner ")+"et c'est "+((grande == true) ? "grande tactile ":"petite de bureau "));
	
}


}
