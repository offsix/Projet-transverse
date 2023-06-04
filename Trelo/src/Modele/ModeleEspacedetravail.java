package Modele;

import java.util.ArrayList;

/** @autor Dayssam BAKAAR **/
/** @autor Abdoulaye WAGNE **/
public class ModeleEspacedetravail {

	private ArrayList<ModeleProjet> projectliste;
	private ModeleMembre proprietaire;
	
	public ModeleEspacedetravail(ModeleMembre proprietaire) {
		this.projectliste = new ArrayList<ModeleProjet>();
		this.proprietaire = proprietaire;
	}

	public void ajouterProjet(ModeleProjet projet){
		projectliste.add(projet);
	}

	public ArrayList<ModeleProjet> getProject(){
		return projectliste;
	}
	public ModeleMembre getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(ModeleMembre proprietaire) {
		this.proprietaire = proprietaire;
	}
		

}