package Modele;
/** @autor Dayssam BAKAAR **/
/** @autor Abdoulaye WAGNE **/
public class ModeleInscription {
   private ModeleMembre nouveauMembre;

    //constructeur
    public ModeleInscription(ModeleAccueil accueil, String Identifiant, String MotDePasse, String Nom, String Prenom, String Adresse) {
        ModeleMembre nouveauMembre = new ModeleMembre(Identifiant, MotDePasse, Nom, Prenom, Adresse);
        accueil.ajouterMembre(nouveauMembre);
    }
    //constructeur 
 
    public ModeleMembre getMembre() {
        return nouveauMembre;

    }

}