package Modele;

public class ModeleInscription {
   private ModeleMembre nouveauMembre;

    //constructeur
    public ModeleInscription(String Identifiant, String MotDePasse, String Nom, String Prenom, String Adresse) {
        ModeleMembre nouveauMembre = new ModeleMembre(Identifiant, MotDePasse, Nom, Prenom, Adresse);
        
    }
    //constructeur 
 
    public ModeleMembre getMembre() {
        return nouveauMembre;

    }

}