package Modele;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ModeleEspacedetravail {

	private ArrayList<ModeleProjet> projectliste;
	private ModeleMembre proprietaire;
	
	public ModeleEspacedetravail(ModeleMembre proprietaire) {
		this.projectliste= new ArrayList<ModeleProjet>();
		this.proprietaire = proprietaire;
	}
	public ModeleMembre getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(ModeleMembre proprietaire) {
		this.proprietaire = proprietaire;
	}
		

}