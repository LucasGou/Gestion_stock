package entites;

import java.util.Scanner;

import common.common;
import common.emplacement;
import common.lieustockage;
import common.materiel;
import common.menuprincipal;

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
	
public static void enregistrerecr() {
		
		System.out.println(Properties.Entites.ecran.Q1);
		Scanner nom = new Scanner(System.in);
		String choixnom = nom.nextLine();
		
		System.out.println(Properties.Entites.ecran.Q2);
		Scanner marque = new Scanner(System.in);
		String choixmarque = marque.nextLine();
		
		System.out.println(Properties.Entites.ecran.Q3);
		Scanner resolution = new Scanner(System.in);
		int choixresolution = resolution.nextInt();
		
		System.out.println(Properties.Entites.ecran.Q4);
		Scanner connectique = new Scanner(System.in);
		String choixconnectique = connectique.nextLine();
		
		ecran ec = new ecran (choixnom,choixmarque,choixresolution,choixconnectique);
		emplacement emp3 = new emplacement ("Etagere des ecrans");
		emp3.ajouter(ec);
		lieustockage ls1 = new lieustockage(); // à modifier pour get un lieustockage existant
		ls1.ajouter(emp3);
		
		
		new menuprincipal(ls1);
	}	

}
