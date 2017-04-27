package common;

import java.util.Scanner;

public class menu2 extends menuprincipal{
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
            case 1:  
                     break;
            case 2:  
                     break;
            case 3:  
                     break;
            case 4:  System.exit(0);
                     break;
            default: 
                     break;
        }
	}
}
