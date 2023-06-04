package Modele;

public class ModeleMembre {

	private String nom;
	private String prenom;
	private String adressemail;
	private String password;
	private String pseudo;
	
	public ModeleMembre(String pseudo, String password, String nom, String prenom, String adressemail) {
		this.pseudo = pseudo;
		this.password = password;
		this.adressemail = adressemail;
		this.prenom = prenom;
		this.nom = nom;
	}
	 public ModeleMembre() {
	 pseudo = "test";
	 password = "test";
	 adressemail = "test";
	 prenom = "test";
	 nom = "test";
	 }

	// getter
	public String getPseudo() {
		return pseudo;
	}
	public String getPassword() {
		return password;
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public String getAdressemail() {
		return adressemail;
	}
    
	
}