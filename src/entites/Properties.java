package entites;
public class Properties {
	
	public static abstract class Entites {
		
		public static final String EMPLACEMENT_1	 	 		= 	new String("Armoire des Cartes Graphiques");
		
		public static abstract class cartegraphique {
			public static final String Q1						= 	new String("Quel est le modele de votre Carte graphique ?");
			public static final String Q2						= 	new String("Quel est la marque de votre Carte graphique ?");
			public static final String Q3						=	new String("Quel est le nombre de GB de RAM de votre Carte graphique ?");
		}
		
		public static abstract class disquedur {
			public static final String Q1 	 					=	new String("Quel est le modele de votre Disque dur ?");
			public static final String Q2						=	new String("Quel est la marque de votre Disque dur ?");
			public static final String Q3						=	new String("Quel est le nombre de GB de votre Disque dur ?");
			public static final String Q4						=	new String("Votre Disque Dur est-il SSD ? true/false");
		}
		
		public static abstract class ecran {
			public static final String Q1 	 					=	new String("Quel est le modele de votre ecran  ?");
			public static final String Q2						=	new String("Quel est la marque de votre ecran ?");
			public static final String Q3						=	new String("Quel est la résolution de votre ecran ? (en pouces)");
			public static final String Q4						=	new String("Quelles sont les connectiques de votre ecran ? (ex d'écriture: HDMI,VGA,DISPLAYPORT)");
		}
		
		public static abstract class imprimante {
			public static final String Q1 	 					=	new String("Quel est le modele de votre ecran  ?");
			public static final String Q2 	 					=	new String("Quel est la marque de votre imprimante ?");
			public static final String Q3						=	new String("Votre imprimante a t'elle un scanner ? true/false");
			public static final String Q4						=	new String("Votre imprimante est-elle une grande tactile ? true/false");
		}
		
		public static abstract class unitecentrale {
			public static final String Q1 	 					=	new String("Quel est le modele de votre unite centrale  ?");
			public static final String Q2 	 					=	new String("Quel est la marque de votre unite centrale ?");
			public static final String Q3						=	new String("Combien de GB de RAM possede votre unite centrale ?");
			public static final String Q4						=	new String("Combien de GB de Disque dur possede votre unite centrale ?");
			public static final String Q5						=	new String("Quel est le processeur de votre unite centrale ? (ex d'écriture: I5-5400)");

		}
		
	}
		

}


