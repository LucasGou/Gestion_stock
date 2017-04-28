package entites;

import java.util.Scanner;

import common.common;
import common.emplacement;
import common.lieustockage;
import common.materiel;
import common.menuprincipal;

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
	
public static void enregistrerdd() {
		
		System.out.println(Properties.Entites.disquedur.Q1);
		Scanner nom = new Scanner(System.in);
		String choixnom = nom.nextLine();
		
		System.out.println(Properties.Entites.disquedur.Q2);
		Scanner marque = new Scanner(System.in);
		String choixmarque = marque.nextLine();
		
		System.out.println(Properties.Entites.disquedur.Q3);
		Scanner stockage = new Scanner(System.in);
		int choixstockage = stockage.nextInt();
		
		System.out.println(Properties.Entites.disquedur.Q4);
		Scanner SSD = new Scanner(System.in);
		boolean choixSSD = SSD.nextBoolean();
		
		disquedur dd = new disquedur (choixnom,choixmarque,choixstockage,choixSSD);
		emplacement emp2 = new emplacement ("Armoire des Disques durs");
		emp2.ajouter(dd);
		lieustockage ls1 = new lieustockage(); // à modifier pour get un lieustockage existant
		ls1.ajouter(emp2);
		
		
		new menuprincipal(ls1);
	}	
	
	

}
