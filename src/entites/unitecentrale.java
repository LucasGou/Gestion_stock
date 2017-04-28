package entites;

import java.util.Scanner;

import common.common;
import common.emplacement;
import common.lieustockage;
import common.materiel;
import common.menuprincipal;

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
	
	public static void enregistreruc() {
		
		System.out.println(Properties.Entites.unitecentrale.Q1);
		Scanner nom = new Scanner(System.in);
		String choixnom = nom.nextLine();
		
		System.out.println(Properties.Entites.unitecentrale.Q2);
		Scanner marque = new Scanner(System.in);
		String choixmarque = marque.nextLine();
		
		System.out.println(Properties.Entites.unitecentrale.Q3);
		Scanner ram = new Scanner(System.in);
		int choixram = ram.nextInt();
		
		System.out.println(Properties.Entites.unitecentrale.Q4);
		Scanner DD = new Scanner(System.in);
		int choixdd = DD.nextInt();
		
		System.out.println(Properties.Entites.unitecentrale.Q5);
		Scanner processeur = new Scanner(System.in);
		String choixprocesseur = processeur.nextLine();
		
		unitecentrale uc = new unitecentrale (choixnom,choixmarque,choixram,choixdd,choixprocesseur);
		emplacement emp5 = new emplacement ("Etagere des unites centrales");
		emp5.ajouter(uc);
		lieustockage ls1 = new lieustockage(); // à modifier pour get un lieustockage existant (ici recreer et donc efface)
		ls1.ajouter(emp5);
		
		
		new menuprincipal(ls1);
	}	

}
