package Modele;

public class ModeleProjet {

	private String proprietaire;
    private String sNomProjet;
    private ModeleCartes[] tableauCarte;
    private ModeleMembre[] tableauMembres;

    public ModeleProjet(String sNomProjet, ModeleCartes[] tableauCarte, ModeleMembre[] tableauMembres, String proprietaire) {
        this.sNomProjet = sNomProjet;
        this.proprietaire = proprietaire;
        this.tableauCarte = tableauCarte;
        this.tableauMembres = tableauMembres;
    }

    public String getsNomProjet() {
        return sNomProjet;
    }

    public void setsNomProjet(String sNomProjet) {
        this.sNomProjet = sNomProjet;
    }

    public ModeleCartes[] gettableauCarte() {
        return tableauCarte;
    }

    public void settableauCarte(ModeleCartes[] tableauCarte) {
        this.tableauCarte = tableauCarte;
    }

    public ModeleMembre[] getTableauMembres() {
        return tableauMembres;
    }

    public void setTableauMembres(ModeleMembre[] tableauMembres) {
        this.tableauMembres = tableauMembres;
    }

	public String getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}

}
