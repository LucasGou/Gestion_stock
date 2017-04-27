package common;

import java.util.ArrayList;
import java.util.List;


public class emplacement {
String id_emplacement;
List<materiel> listemateriel = new ArrayList<materiel>();


public emplacement(String id_emplacement) {
	super();
	this.id_emplacement = id_emplacement;
}


public emplacement(List<materiel> listemateriel) {
	super();
	this.listemateriel = listemateriel;
}

public void ajouter(materiel unmateriel){
	listemateriel.add(unmateriel);
}

public void liste(){
	System.out.println("***************************");
	for(materiel m:listemateriel){
		m.affichermateriel();
	}
}

public void donneemplacement(){
	System.out.println("\n"+id_emplacement);
}


}
