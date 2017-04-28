package common;
import main.main;

import java.util.Scanner;

public class menuprincipal extends menu2 {

	private lieustockage lieustockage;
	
	public menuprincipal() {
		super();
		printMenu();
	}

	public menuprincipal(lieustockage l){
		super();
		this.lieustockage = l;
		printMenu();
	}
	
	public void printMenu() {
			System.out.println("-----MENU-----");
			System.out.println("Afficher Stock : tapez 1");
			System.out.println("Enregistrer materiel : tapez 2");
			System.out.println("Supprimer materiel : tapez 3");
			System.out.println("Quitter : tapez 4");
			Scanner menu = new Scanner(System.in);
			int choixmenu = menu.nextInt();
			
	        switch (choixmenu) {
	            case 1:  getLieustockage().afficher();
	                     break;
	                     
	            case 2:  super.menuenregistrer();
	                     break;
	                     
	            case 3:  
	                     break;
	                     
	            case 4:  System.exit(0);
	                     break;
	        }
			
			
		}


	public lieustockage getLieustockage() {
		return lieustockage;
	}

	
		
		
	}
