package Modele;

public class ModeleMembre {

	private String nom;
	private String prenom;
	private String adressemail;
	private String password;
	private String pseudo;
	
	
	public ModeleMembre(String pseudo, String password) {
		this.pseudo = pseudo;
		this.password = password;
	}
	// getter
	public String getPseudo() {
		return pseudo;
	}
	public String getPassword() {
		return password;
	}

	
	
}