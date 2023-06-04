package Modele;

import java.util.ArrayList;
/** @autor Dayssam BAKAAR **/
/** @autor Abdoulaye WAGNE **/
public class ModeleProjet {

	private ModeleMembre proprietaire;
    private String sNomProjet;
    private String description;
    private ArrayList<ModeleCartes> tableauCarte;
    private ArrayList < ModeleMembre> tableauMembres;

    public ModeleProjet(String sNomProjet, ModeleMembre proprietaire, String description) {
        this.sNomProjet = sNomProjet;
        this.proprietaire = proprietaire;
        this.description = description;
        tableauCarte = new ArrayList<ModeleCartes>();
        tableauMembres = new ArrayList<ModeleMembre>();
        tableauMembres.add(proprietaire);
    }

    public String getsNomProjet() {
        return sNomProjet;
    }

    public void setsNomProjet(String sNomProjet) {
        this.sNomProjet = sNomProjet;
    }

public ModeleMembre getProprietaire() {
    return proprietaire;
}
//getter et setter
public void setProprietaire(ModeleMembre proprietaire) {
    this.proprietaire = proprietaire;
}
public ArrayList<ModeleCartes> getTableauCarte() {
    return tableauCarte;
}
public void setTableauCarte(ArrayList<ModeleCartes> tableauCarte) {
    this.tableauCarte = tableauCarte;
}
public ArrayList<ModeleMembre> getTableauMembres() {
    return tableauMembres;

}
public void setTableauMembres(ArrayList<ModeleMembre> tableauMembres) {
    this.tableauMembres = tableauMembres;
}
public void ajouterCarte(ModeleCartes carte) {
    this.tableauCarte.add(carte);
}
public String getDescription() {
    return description;
}


}
