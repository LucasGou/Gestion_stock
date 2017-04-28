package entites;

import java.util.Scanner;

import common.common;
import common.emplacement;
import common.lieustockage;
import common.materiel;
import common.menuprincipal;

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

public static void enregistrerimp() {
	
	System.out.println(Properties.Entites.imprimante.Q1);
	Scanner nom = new Scanner(System.in);
	String choixnom = nom.nextLine();
	
	System.out.println(Properties.Entites.imprimante.Q2);
	Scanner marque = new Scanner(System.in);
	String choixmarque = marque.nextLine();
	
	System.out.println(Properties.Entites.imprimante.Q3);
	Scanner resolution = new Scanner(System.in);
	boolean choixresolution = resolution.nextBoolean();
	
	System.out.println(Properties.Entites.imprimante.Q4);
	Scanner connectique = new Scanner(System.in);
	boolean choixconnectique = connectique.nextBoolean();
	
	imprimante imp = new imprimante (choixnom,choixmarque,choixresolution,choixconnectique);
	emplacement emp4 = new emplacement ("Etagere des imprimantes");
	emp4.ajouter(imp);
	lieustockage ls1 = new lieustockage(); // à modifier pour get un lieustockage existant
	ls1.ajouter(emp4);
	
	
	new menuprincipal(ls1);
}	


}
