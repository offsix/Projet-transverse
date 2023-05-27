package Modele;

public class ModeleMembre {

	private int idMembre;
	private String nom;
	private String prenom;
	private String adressemail;
	private String password;
	private String pseudo;
	private String imagePath;//lien vers le photo de profil 
	
	public ModeleMembre(String imagePath, String nom, String prenom) {
		this.imagePath = imagePath;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public final int getIdMembre() {
		return idMembre;
	}
	public final void setIdMembre(int idMembre) {
		this.idMembre = idMembre;
	}
	public final String getNom() {
		return nom;
	}
	public final void setNom(String nom) {
		this.nom = nom;
	}
	public final String getPrenom() {
		return prenom;
	}
	public final void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public final String getAdressemail() {
		return adressemail;
	}
	public final void setAdressemail(String adressemail) {
		this.adressemail = adressemail;
	}
	public final String getPassword() {
		return password;
	}
	public final void setPassword(String password) {
		this.password = password;
	}
	public final String getPseudo() {
		return pseudo;
	}
	public final void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public final String getRole() {
		return Role;
	}
	public final void setRole(String role) {
		Role = role;
	}
	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	private String Role;

}