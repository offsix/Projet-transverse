package Modele;

import java.util.ArrayList;

public class ModeleAccueil {

private ArrayList<ModeleMembre> membres;	

	//contructeur avec l'arraylist de membre qui stockera tout les memebre inscrits
	public ModeleAccueil()
	{
		this.membres = new ArrayList<ModeleMembre>();
	}
		/**
	 * Adds the given member to the list of members.
	 *
	 * @param  membre the member to be added to the list
	 */

	public void ajouterMembre(ModeleMembre membre)
	{
		this.membres.add(membre);
	}

	/**
	 * Iterates through the list of members and prints their pseudonyms.
	 */
	public  void listemembre() 
	{
		for (ModeleMembre modeleMembre : membres) {
			System.out.println(modeleMembre.getPseudo());
		}
	}

		/**
	 * Returns a model member with the given name.
	 *
	 * @param  nommembre	the name of the member to retrieve
	 * @return         	the model member with the given name, or null if not found
	 */

	public ModeleMembre getMembre(String nommembre){
		for (ModeleMembre modeleMembre : membres) {
			if(modeleMembre.getPseudo().equals(nommembre))
				return modeleMembre;
		}
		return null;
	}

		/**
	 * Check if a member exists in the database.
	 *
	 * @param  pseudo	the username of the member
	 * @param  password	the password of the member
	 * @return         	true if the member exists, false otherwise
	 */
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
