package Modele;


public class ModeleTchat {

	private int idtchat;
	private String roleaccessible;
	private ModeleMembre[] participant;
	private String nom;
	
	public final int getIdtchat() {
		return idtchat;
	}
	public final void setIdtchat(int idtchat) {
		this.idtchat = idtchat;
	}
	public final String getRoleaccessible() {
		return roleaccessible;
	}
	public final void setRoleaccessible(String roleaccessible) {
		this.roleaccessible = roleaccessible;
	}
	public final ModeleMembre[] getParticipant() {
		return participant;
	}
	public final void setParticipant(ModeleMembre[] participant) {
		this.participant = participant;
	}
	public final String getNom() {
		return nom;
	}
	public final void setNom(String nom) {
		this.nom = nom;
	}

}