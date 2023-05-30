package Modele;

import java.awt.Color;
import java.time.LocalDate;
public class ModeleAjouterCarte {

	private static int INDEX_CARTE = 0;//num des Cartes commence a 0 et +1 a chaque fois
	
	private String titreCarte;
	private LocalDate DateDebutCarte;
	private String DescriptionCarte;
	private LocalDate DateLimiteCarte;
	private String StatutCarte;
	private String CouvertureCarte;
	private int idCarte;
	
	public ModeleAjouterCarte(String titreCarte,LocalDate DateDebutCarte, String DescriptionCarte, LocalDate DateLimiteCarte, String StatutCarte , String CouvertureCarte) {
		this.CouvertureCarte = CouvertureCarte;
		this.DateDebutCarte = DateDebutCarte;
		this.DateLimiteCarte = DateLimiteCarte;
		this.DescriptionCarte = DescriptionCarte;
		this.StatutCarte = StatutCarte;
		this.titreCarte = titreCarte;
		this.idCarte = INDEX_CARTE;
		INDEX_CARTE++;
	}
	
		
	public ModeleAjouterCarte() {
    }


    public final String getTitreCarte() {
		return titreCarte;
	}
	public final void setTitreCarte(String titreCarte) {
		this.titreCarte = titreCarte;
	}
	public final LocalDate getDateDebutCarte() {
		return DateDebutCarte;
	}
	public final void setDateDebutCarte(LocalDate dateDebutCarte) {
		DateDebutCarte = dateDebutCarte;
	}
	public final String getDescriptionCarte() {
		return DescriptionCarte;
	}
	public final void setDescriptionCarte(String descriptionCarte) {
		DescriptionCarte = descriptionCarte;
	}
	public final LocalDate getDateLimiteCarte() {
		return DateLimiteCarte;
	}
	public final void setDateLimiteCarte(LocalDate dateLimiteCarte) {
		DateLimiteCarte = dateLimiteCarte;
	}
	public final String getStatutCarte() {
		return StatutCarte;
	}
	public final void setStatutCarte(String statutCarte) {
		StatutCarte = statutCarte;
	}
	public final String getCouvertureCarte() {
		return CouvertureCarte;
	}
	public final void setCouvertureCarte(String couvertureCarte) {
		CouvertureCarte = couvertureCarte;
	}
	public final int getIdCarte() {
		return idCarte;
	}
	public final void setIdCarte(int idCarte) {
		this.idCarte = idCarte;
	}
	
	public Color getCouvertureCarteColor() {
        return Color.decode(CouvertureCarte);
    }

}