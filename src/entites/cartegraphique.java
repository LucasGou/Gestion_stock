package entites;

import java.util.Scanner;

import common.common;
import common.emplacement;
import common.lieustockage;
import common.materiel;
import common.menuprincipal;

public class cartegraphique extends materiel implements common {
	int ram;

	public cartegraphique(String nom, String marque, int ram) {
		super(nom, marque);
		this.ram = ram;
	}

	public cartegraphique() {
		super();
	}

	@Override
	public void affichermateriel() {
		super.affichermateriel();
		System.out.println(" avec "+ram+"Gb de ram");
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public static void enregistrercg() {
		
		System.out.println(Properties.Entites.cartegraphique.Q1);
		Scanner nom = new Scanner(System.in);
		String choixnom = nom.nextLine();
		
		System.out.println(Properties.Entites.cartegraphique.Q2);
		Scanner marque = new Scanner(System.in);
		String choixmarque = marque.nextLine();
		
		System.out.println(Properties.Entites.cartegraphique.Q3);
		Scanner ram = new Scanner(System.in);
		int choixram = ram.nextInt();
		
		cartegraphique cg = new cartegraphique (choixnom,choixmarque,choixram);
		emplacement emp1 = new emplacement ("Armoire des Cartes Graphiques");
		emp1.ajouter(cg);
		lieustockage ls1 = new lieustockage(); // à modifier pour get un lieustockage existant
		ls1.ajouter(emp1);
		
		
		new menuprincipal(ls1);
			
	}	
}
