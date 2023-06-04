package Modele;

import java.awt.Color;
import Modele.*;
import Vue.VueCarte;
public class ModeleAjouterCarte {
	private ModeleCartes nouvellecarte;

	/** @autor Dayssam BAKAAR **/
	public ModeleAjouterCarte(ModeleProjet modeleProjet, String titreCarte, String DateDebutCarte, String DescriptionCarte, String DateLimiteCarte, String StatutCarte) {
		this.nouvellecarte = new ModeleCartes(titreCarte, DateDebutCarte, DescriptionCarte, DateLimiteCarte, StatutCarte);
		modeleProjet.ajouterCarte(nouvellecarte);

	}
	public	ModeleAjouterCarte(ModeleProjet modeleProjet) {
		this.nouvellecarte = new ModeleCartes();
		modeleProjet.ajouterCarte(nouvellecarte);
		
	}
	


	public ModeleCartes getCarte() {
		return nouvellecarte;
	}

}

