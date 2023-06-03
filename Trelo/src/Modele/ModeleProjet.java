package Modele;

import java.util.ArrayList;

public class ModeleProjet {

	private ModeleMembre proprietaire;
    private String sNomProjet;
    private ArrayList<ModeleCartes> tableauCarte;
    private ArrayList < ModeleMembre> tableauMembres;

    public ModeleProjet(String sNomProjet, ModeleMembre proprietaire) {
        this.sNomProjet = sNomProjet;
        this.proprietaire = proprietaire;
        tableauCarte = new ArrayList<>(tableauCarte);
        tableauMembres = new ArrayList<>(tableauMembres);
        tableauMembres.add(proprietaire);
    }
    public ModeleProjet() {
        this.sNomProjet = "Test";
        this.proprietaire = new ModeleMembre();
        this.tableauCarte = new ArrayList<ModeleCartes>();
        this.tableauMembres = new ArrayList<ModeleMembre>();
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

}
