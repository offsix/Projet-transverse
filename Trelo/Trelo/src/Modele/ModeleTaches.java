package Modele;

import java.util.Date;
public class ModeleTaches {

	private String nom;
	private Date date_debut;
	private Date date_fin;
	private ModeleMembre[] participant;
	
	
	
	public final String getNom() {
		return nom;
	}
	public final void setNom(String nom) {
		this.nom = nom;
	}
	public final Date getDate_debut() {
		return date_debut;
	}
	public final void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}
	public final Date getDate_fin() {
		return date_fin;
	}
	public final void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}
	public final ModeleMembre[] getParticipant() {
		return participant;
	}
	public final void setParticipant(ModeleMembre[] participant) {
		this.participant = participant;
	}
	

}