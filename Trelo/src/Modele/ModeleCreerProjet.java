package Modele;

/** @autor Dayssam BAKAAR **/
/** @autor Abdoulaye WAGNE **/

public class ModeleCreerProjet {
    private ModeleProjet nouveauprojet;
    public ModeleCreerProjet(ModeleEspacedetravail modeleespaceDeTravail,String titreproj, String description, ModeleMembre proprietaire) {
       this.nouveauprojet = new ModeleProjet(titreproj, proprietaire, description);
        modeleespaceDeTravail.ajouterProjet(nouveauprojet);

        
    }
    public ModeleProjet getNouveauprojet() {
        return nouveauprojet;
    }

}
