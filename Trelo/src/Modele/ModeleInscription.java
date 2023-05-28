package Modele;

public class ModeleInscription {
    private String Identifiant;
    private String MotDePasse;
    private String Nom;
    private String Prenom;
    private String Adresse;

    //constructeur
    public ModeleInscription(String Identifiant, String MotDePasse, String Nom, String Prenom, String Adresse) {
        this.Identifiant = Identifiant;
        this.MotDePasse = MotDePasse;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Adresse = Adresse;
    }

    //accesseurs
    public String getIdentifiant() {
        return Identifiant;
    }
    
    public String getMotDePasse() {
        return MotDePasse;
    }
    public String getNom() {
        return Nom;
    }
    public String getPrenom() {
        return Prenom;
    }   
    public String getAdresse() {
        return Adresse;
    }

}
