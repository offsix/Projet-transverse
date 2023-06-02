package Modele;

import java.awt.Color;
import java.time.LocalDate;

import Modele.*;
public class ModeleAjouterCarte {
	private ModeleCartes nouvellecarte;
	
	public ModeleAjouterCarte(ModeleProjet modeleProjet, String titreCarte, LocalDate DateDebutCarte, String DescriptionCarte, LocalDate DateLimiteCarte, String StatutCarte, String CouvertureCarte) {
		this.nouvellecarte = new ModeleCartes(titreCarte, DateDebutCarte, DescriptionCarte, DateLimiteCarte, StatutCarte, CouvertureCarte);
		modeleProjet.ajouterCarte(nouvellecarte);
	}
	public	ModeleAjouterCarte(ModeleProjet modeleProjet) {
		this.nouvellecarte = new ModeleCartes();
		modeleProjet.ajouterCarte(nouvellecarte);
		
	}
	


}