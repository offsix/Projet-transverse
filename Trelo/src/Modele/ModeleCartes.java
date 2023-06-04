package Modele;

import java.awt.Color;
import java.time.LocalDate;
public class ModeleCartes {

	private static int INDEX_CARTE = 0;//num des Cartes commence a 0 et +1 a chaque fois
	
	private String titreCarte;
	private String DateDebutCarte;
	private String DescriptionCarte;
	private String DateLimiteCarte;
	private String StatutCarte;
	private int idCarte;
	private int section;

	public ModeleCartes(String titreCarte,String DateDebutCarte, String DescriptionCarte, String DateLimiteCarte, String StatutCarte ) {
		this.DateDebutCarte = DateDebutCarte;
		this.DateLimiteCarte = DateLimiteCarte;
		this.DescriptionCarte = DescriptionCarte;
		this.StatutCarte = StatutCarte;
		this.titreCarte = titreCarte;
		this.idCarte = INDEX_CARTE;
		INDEX_CARTE++;
	}
	
	 public ModeleCartes() {
	 	this.DateDebutCarte = LocalDate.now().toString();
	 	this.DateLimiteCarte = LocalDate.now().toString();
	 	this.DescriptionCarte = "Test";
	 	this.StatutCarte = "Test";
		this.titreCarte = "Test";
	 	this.idCarte = INDEX_CARTE;
	 	INDEX_CARTE++;
	 }
	
	public void setSection(int section) {
        this.section = section;
    }
	public int getSection() {
		return section;
	}
	public final String getTitreCarte() {
		return titreCarte;
	}
	public final void setTitreCarte(String titreCarte) {
		this.titreCarte = titreCarte;
	}
	public final String getDateDebutCarte() {
		return DateDebutCarte;
	}
	public final void setDateDebutCarte(String dateDebutCarte) {
		DateDebutCarte = dateDebutCarte;
	}
	public final String getDescriptionCarte() {
		return DescriptionCarte;
	}
	public final void setDescriptionCarte(String descriptionCarte) {
		DescriptionCarte = descriptionCarte;
	}
	public final String getDateLimiteCarte() {
		return DateLimiteCarte;
	}
	public final void setDateLimiteCarte(String dateLimiteCarte) {
		DateLimiteCarte = dateLimiteCarte;
	}
	public final String getStatutCarte() {
		return StatutCarte;
	}
	public final void setStatutCarte(String statutCarte) {
		StatutCarte = statutCarte;
	}
		public final int getIdCarte() {
		return idCarte;
	}
	public final void setIdCarte(int idCarte) {
		this.idCarte = idCarte;
	}
}