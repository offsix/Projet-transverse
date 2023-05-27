package Modele;

public class ModeleAccueil {

	private String Identifiant;
	private String MotDePasse;
	
	public ModeleAccueil(String Identifiant, String MotDePasse)
	{
		this.Identifiant=Identifiant;
		this.MotDePasse=MotDePasse;
	}
	public String getIdentifiant() {
		return Identifiant;
	}

	public String getMotDePasse() {
		return MotDePasse;
	}
}
