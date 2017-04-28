package common;

import java.util.Scanner;

import entites.cartegraphique;

public class menu2 extends materiel{

	public void menuenregistrer() {
		System.out.println("----ENREGISTREMENT----");
		System.out.println("Pour enregistrer une carte graphique : tapez 1");
		System.out.println("Pour enregistrer un disque dur : tapez 2");
		System.out.println("Pour enregistrer un écran : tapez 3");
		System.out.println("Pour enregistrer une imprimante : tapez 4");
		System.out.println("Pour enregistrer une unite centrale : tapez 5");
		System.out.println("Quitter : tapez 6");
		Scanner menu = new Scanner(System.in);
		int choixmenu = menu.nextInt();
		
        switch (choixmenu) {
            case 1:  super.enregistrercartegraphique();
                     break;
            case 2:  super.enregistrerdisquedur();
                     break;
            case 3:  super.enregistrerecran();
                     break;
            case 4:  super.enregistrerimprimante();
            		 break;
            case 5:  super.enregistrerunitecentrale();
            		 break;
            case 6:  new menuprincipal();
            		 break;
        }
	}
}
