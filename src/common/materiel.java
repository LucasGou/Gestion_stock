package common;

import java.util.Scanner;

import entites.cartegraphique;
import entites.disquedur;
import entites.ecran;
import entites.imprimante;
import entites.unitecentrale;

public class materiel implements common {
	String nom;
	String marque;
	Scanner noms;
	Scanner marques;

	public materiel(String nom, String marque) {
		super();
		this.nom = nom;
		this.marque = marque;
	}
	
	public materiel(Scanner nom, Scanner marque) {
		super();
		this.noms = noms;
		this.marques = marques;
	}

	public materiel() {
		super();
	}

	@Override
	public void affichermateriel() {
		System.out.print("Le matériel est un(e) "+nom+" de marque "+marque);
		
	}

	public void enregistrercartegraphique() {
		cartegraphique.enregistrercg();
	}
	
	public void enregistrerdisquedur() {
		disquedur.enregistrerdd();
	}
	
	public void enregistrerecran() {
		ecran.enregistrerecr();
	}
	
	public void enregistrerimprimante() {
		imprimante.enregistrerimp();
	}
	
	public void enregistrerunitecentrale() {
		unitecentrale.enregistreruc();
	}


}
