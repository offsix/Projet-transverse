package Modele;

import java.util.ArrayList;

public class ModeleAccueil {

private ArrayList<ModeleMembre> membres;	
	public ModeleAccueil()
	{
		this.membres = new ArrayList<ModeleMembre>();
	}
	public void ajouterMembre(ModeleMembre membre)
	{
		this.membres.add(membre);
	}
	public  void listemembre() 
	{
		for (ModeleMembre modeleMembre : membres) {
			System.out.println(modeleMembre.getPseudo());
		}
	}
	public ModeleMembre getMembre(String nommembre){
		for (ModeleMembre modeleMembre : membres) {
			if(modeleMembre.getPseudo().equals(nommembre))
				return modeleMembre;
		}
		return null;
	}
	public boolean estunmembre(String pseudo,String password){
		boolean resultat = false;
		for (ModeleMembre modeleMembre : membres) {
			if (modeleMembre.getPseudo().equals(pseudo) && modeleMembre.getPassword().equals(password)) {
				resultat = true;

			}

		}
		return resultat;
	}
}
