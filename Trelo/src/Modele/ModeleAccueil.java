package Modele;

import java.lang.reflect.Array;
import java.util.ArrayList;
import Vue.VueInscription;
public class ModeleAccueil {
	private String Identifiant;
	private String MotDePasse;
	
	private ArrayList<String> listeID = new ArrayList<String>();
	private ArrayList<String> listePASS = new ArrayList<String>();

	
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
