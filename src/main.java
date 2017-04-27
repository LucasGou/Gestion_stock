import common.emplacement;
import common.lieustockage;
import common.materiel;
import entites.cartegraphique;
import entites.disquedur;
import entites.ecran;
import entites.imprimante;
import entites.unitecentrale;

public class main {

	public static void main(String[] args) {
		cartegraphique cg1 = new cartegraphique ("Geforce GTX680", "Nvidia", 5);
		disquedur dd1 = new disquedur ("Kingston 5000C", "Kingston", 1000, false);
		ecran ec1 = new ecran ("IIyaBlack M84745", "IIYAMA", 24, "HDMI / VGA");
		imprimante imp1 = new imprimante ("Bizhub C308", "Konica", true, true);
		unitecentrale uc1 = new unitecentrale ("ACEAN1506","Fujitsu", 15, 1000,"Intel I5-5400");
		
/*************************************************/
/*AFFICHER LES CG*/
/*************************************************/
		
		emplacement emp1 = new emplacement ("Armoire des Cartes Graphiques");
		emp1.ajouter(cg1);
		
/*************************************************/
/*AFFICHER LES DD*/
/*************************************************/
				
		emplacement emp2 = new emplacement ("Armoire des Disques durs");
		emp2.ajouter(dd1);
		
/*************************************************/
/*AFFICHER LES ECRANS*/
/*************************************************/
				
		emplacement emp3 = new emplacement ("Etagere des Ecrans");
		emp3.ajouter(ec1);
		
/*************************************************/
/*AFFICHER LES IMPRIMANTES*/
/*************************************************/
						
		emplacement emp4 = new emplacement ("Etagere des Imprimantes");
		emp4.ajouter(imp1);

		
/*************************************************/
/*AFFICHER LES UC*/
/*************************************************/
								
		emplacement emp5 = new emplacement ("Etagere des Unités centrales");
		emp5.ajouter(uc1);
				
/*************************************************/
/*AFFICHER LE STOCK COMPLET*/
/*************************************************/
		lieustockage ls1 = new lieustockage();
		ls1.ajouter(emp1);
		ls1.ajouter(emp2);
		ls1.ajouter(emp3);
		ls1.ajouter(emp4);
		ls1.ajouter(emp5);
		ls1.afficher();
		
	}

}
