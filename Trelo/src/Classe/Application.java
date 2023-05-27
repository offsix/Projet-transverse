package Classe;

import Vue.*;

import java.time.LocalDate;

import javax.swing.JFrame;

import Modele.ModeleCalendrier;
import Modele.ModeleCartes;
import Modele.ModeleEspacedetravail;
import Modele.ModeleMembre;
import Modele.ModeleProjet;
import Modele.ModeleAccueil;

public class Application {	//Coder par Mathieu Flesch

	public static ModeleProjet[] creationProjets(int iNum) {	//Fonction pour cr�er des projets
	    ModeleProjet[] tableauProjets = new ModeleProjet[iNum];

	    // Cr�ation des cartes et des membres
	    ModeleCartes[] tableauCartes = creationCarte(iNum);
	    ModeleMembre[] tableauMembres = creationMembres(iNum);

	    for (int i = 0; i < iNum; i++) {
	        ModeleCartes[] cartesProjet = tableauCartes; // Utiliser le m�me tableau de cartes pour chaque projet
	        ModeleMembre proprietaire = tableauMembres[i]; // Choisir un membre comme propri�taire du projet

	        // Cr�er un projet avec les cartes et le propri�taire
	        ModeleProjet projet = new ModeleProjet("Mon projet", tableauCartes, tableauMembres,"Moi");
	        tableauProjets[i] = projet; // Ajouter le projet dans le tableau
	    }

	    return tableauProjets;
	}

	public static ModeleCartes[] creationCarte(int iNum) {		//Fonction pour cr�er des Cartes
    ModeleCartes[] tableauCartes = new ModeleCartes[iNum]; // Tableau pour stocker les cartes
    // Liste des couleurs pr�d�finies
    String[] couleurs = {
      "#FBE0C3",
      "#FFBB98",
      "#7D8E95",
      "#344648"
    };

    for (int j = 1; j <= iNum; j++) {
      String titre = "Carte " + j;
      LocalDate dateDebut = LocalDate.now();
      String description = "Description de la carte " + j;
      LocalDate dateLimite = LocalDate.now().plusDays(j);
      String statut = "En cours";
      String couverture = couleurs[(j - 1) % couleurs.length]; // S�lectionner une couleur de mani�re cyclique

      ModeleCartes carte1 = new ModeleCartes(titre, dateDebut, description, dateLimite, statut, couverture);
      tableauCartes[j - 1] = carte1; // Ajouter la carte dans le tableau
    }
    return tableauCartes;
  }

	public static ModeleMembre[] creationMembres(int iNum) {	//Fonction pour cr�er des Membres
	    ModeleMembre[] tableauMembres = new ModeleMembre[iNum];
	    for (int i = 1; i <= iNum; i++) {
	        String imagePath = "C:\\Users\\abdoulaye\\OneDrive\\Bureau\\Projet\\Projet-transverse\\Trelo\\Image\\" + i + ".png";
	        String nom = "Nom Membre " + i;
	        String prenom = "Prenom Membre " + i;

	        ModeleMembre membre = new ModeleMembre(imagePath, nom, prenom);
	        tableauMembres[i - 1] = membre; // Ajouter le membre dans le tableau
	    }
	    return tableauMembres;
	}

  private Object seConnecterButton;

  /*public static void ajouterCarte(ModeleProjet projet, String titre, LocalDate dateDebut, String description, LocalDate dateLimite, String statut, String couverture) {
    ModeleCartes carte = new ModeleCartes(titre, dateDebut, description, dateLimite, statut, couverture);
    projet.ajouterCarte(carte);
}

  public static void ajouterMembre(ModeleProjet projet, String imagePath, String nom, String prenom) {
        ModeleMembre membre = new ModeleMembre(imagePath, nom, prenom);
        projet.ajouterMembre(membre);
  }
  
  public static void ajouterProjet(ModeleEspacedetravail espacedetravail, String titre, ModeleCartes[] cartes, ModeleMembre[] membres, String proprietaire) {
    ModeleProjet projet = new ModeleProjet(titre, cartes, membres, proprietaire);
    espacedetravail.ajouterProjet(projet);
}
*/


  public static void main(String[] args) {

	  //--------------------------
	  // Creer un modele d'accueil
	  //--------------------------
	  
	  JFrame fenetreAccueil = new JFrame("VueAccueil");
	  fenetreAccueil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	  ModeleAccueil modeleAccueil = new ModeleAccueil("Identifiant","motdepasse");
	  VueAccueil vueAccueil = new VueAccueil(modeleAccueil);

   
//	  vueAccueil.setVisible(true);

    //------------------------------
    // Creer un modele de calendrier
    //------------------------------
    JFrame fenetreCelendrier = new JFrame("VueCalendrier");
    fenetreCelendrier.setSize(300, 100);
    fenetreCelendrier.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ModeleCalendrier calendrier = new ModeleCalendrier(LocalDate.now(), LocalDate.now());
    VueCalendrier vueCalendier = new VueCalendrier(calendrier);

    //    fenetreCelendrier.add(vueCalendier);
    //    fenetreCelendrier.setVisible(true);

    //----------------------------
    // Creer un modele d'un projet
    //----------------------------
    //----------------------creation de cartes pour les ajouter au projet------------------------------------
    ModeleCartes[] tableauCartes = creationCarte(30);
    ModeleMembre[] tableauMembres = creationMembres(15);
    
    JFrame fenetreProjet = new JFrame("VueProjet");
    fenetreProjet.setExtendedState(JFrame.MAXIMIZED_BOTH);
    fenetreProjet.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    ModeleProjet projet = new ModeleProjet("Parceque c notre projet", tableauCartes, tableauMembres, "Moi");
    VueProject vueProject = new VueProject(projet);

   //fenetreProjet.add(vueProject);
    //fenetreProjet.setVisible(true);

    //----------------------------
    // Creer un modele d'un Petitprojet
    //----------------------------
    
    JFrame fenetrePetitProjet = new JFrame("VueProjet");
    fenetrePetitProjet.setSize(300, 200);
    fenetrePetitProjet.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    ModeleProjet Petitprojet = new ModeleProjet("Parceque c notre projet", tableauCartes, tableauMembres, "Moi");
    VuePetitProjet vuePetitProject = new VuePetitProjet(Petitprojet);

//    fenetrePetitProjet.add(vuePetitProject);
//    fenetrePetitProjet.setVisible(true);

    
    //----------------------------
    // Creer un modele d'une carte
    //----------------------------
    JFrame fenetreCarte = new JFrame("VueCarte");
    fenetreCarte.setSize(300, 200);
    fenetreCarte.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ModeleCartes carte = new ModeleCartes("Coder en java", LocalDate.now(), "Ceci est une carte", LocalDate.now().plusDays(7), "statue �tudiant", "436884");
    VueCarte vueCarte = new VueCarte(carte);

//        fenetreCarte.add(vueCarte);
//        fenetreCarte.setVisible(true);
    
    //----------------------------
    // Creer un modele d'un membre
    //----------------------------
    JFrame fenetreMembre = new JFrame("VueMembre");
    fenetreMembre.setSize(100, 150);
    fenetreMembre.setResizable(false);
    fenetreMembre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ModeleMembre membre = new ModeleMembre("C:\\Image\\1335.jpg", "flesch", "mathieu");
    VuePetitMembre vueMembre = new VuePetitMembre(membre);

//        fenetreMembre.add(vueMembre);
//        fenetreMembre.setVisible(true);
    
    //-------------------------------------
    // Creer un modele d'un espacedetravail
    //-------------------------------------
    ModeleProjet[] projets = creationProjets(25);
    
    JFrame fenetreEspacedetravail = new JFrame("VueEspacedetravail");
    fenetreEspacedetravail.setExtendedState(JFrame.MAXIMIZED_BOTH);
    fenetreEspacedetravail.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ModeleEspacedetravail espacedetravail = new ModeleEspacedetravail(projets, membre);
    VueEspacedetravail vueEspacedetravail = new VueEspacedetravail(espacedetravail);

    //fenetreEspacedetravail.add(vueEspacedetravail);
    //fenetreEspacedetravail.setVisible(true);

    
  

if(modeleAccueil.getIdentifiant()=="admin" && modeleAccueil.getMotDePasse()=="admin") {
    fenetreEspacedetravail.add(vueEspacedetravail);
    fenetreEspacedetravail.setVisible(true);
    vueAccueil.afficherMessageBienvenue();
  }
  else {
    vueAccueil.afficherMessageErreur();
  }

}


}