package Classe;

import Vue.*;
import Modele.*;
import java.time.LocalDate;

import javax.swing.JFrame;

import Modele.*;
import Vue.*;
import Controller.*;


public class Application {

  // public static ModeleProjet[] creationProjets(int iNum) { // Fonction pour cr�er des projets
  //   ModeleProjet[] tableauProjets = new ModeleProjet[iNum];

  //   // Création des cartes et des membres
  //   ModeleCartes[] tableauCartes = creationCarte(iNum);
  //   ModeleMembre[] tableauMembres = new ModeleMembre[0];

  //   for (int i = 0; i < iNum; i++) {
  //     ModeleCartes[] cartesProjet = tableauCartes; // Utiliser le m�me tableau de cartes pour chaque projet
  //     // Créer un projet avec les cartes et le propriétaire
  //     ModeleProjet projet = new ModeleProjet("Mon projet", tableauCartes, tableauMembres, "Moi");
  //     tableauProjets[i] = projet; // Ajouter le projet dans le tableau
  //   }
  //   return tableauProjets;
  // }

  // public static ModeleCartes[] creationCarte(int iNum) { // Fonction pour cr�er des Cartes
  //   ModeleCartes[] tableauCartes = new ModeleCartes[iNum]; // Tableau pour stocker les cartes
  //   // Liste des couleurs pr�d�finies
  //   String[] couleurs = {
  //       "#FBE0C3",
  //       "#FFBB98",
  //       "#7D8E95",
  //       "#344648"
  //   };

  //   for (int j = 1; j <= iNum; j++) {
  //     String titre = "Carte " + j;
  //     LocalDate dateDebut = LocalDate.now();
  //     String description = "Description de la carte " + j;
  //     LocalDate dateLimite = LocalDate.now().plusDays(j);
  //     String statut = "En cours";
  //     String couverture = couleurs[(j - 1) % couleurs.length]; // S�lectionner une couleur de mani�re cyclique

  //     ModeleCartes carte1 = new ModeleCartes(titre, dateDebut, description, dateLimite, statut, couverture);
  //     tableauCartes[j - 1] = carte1; // Ajouter la carte dans le tableau
  //   }
  //   return tableauCartes;
  // }

/**
 * Initialise l'application en créant et initialisant différents objets, notamment:
 * un objet `ModeleAccueil`, un objet `VueAccueil`, un objet `VueInscription`,
 * deux objets `ModeleMembre`, un objet `ModeleEspacedetravail`, un objet `VueEspacedetravail`,
 * un objet `ControllerInscription`, un objet `ControllerAccueil` et un objet `JFrame`.
 * L'objet `ControllerAccueil` est responsable de la gestion de tous les autres objets.
 */

  public static void main(String[] args) {
     ModeleAccueil modeleAccueil = new ModeleAccueil();
     VueAccueil vueAccueil = new VueAccueil(modeleAccueil);
     ControllerAccueil controllerAccueil = new ControllerAccueil(modeleAccueil, vueAccueil);

    // //creation des membres par defaut (admin)
    ModeleMembre test = new ModeleMembre("a","a","a","a","a@outlook.fr");
    modeleAccueil.ajouterMembre(test);

    


    
//--------------------------------------------Autre------------------------------------------------------//
// ModeleAjouterCarte ajoutCarte = new ModeleAjouterCarte();
// VueAjouterCarte vueAjouteCarte = new VueAjouterCarte(ajoutCarte);
//     ModeleAjout ajout = new ModeleAjout();
//     VueAjoute vueAjoute = new VueAjoute(ajout);

    

    ModeleCalendrier calendrier = new ModeleCalendrier(LocalDate.now(), LocalDate.now());
    VueCalendrier vueCalendier = new VueCalendrier(calendrier);

    // // creation de cartes pour les ajouter au projet
    // ModeleCartes[] tableauCartes = creationCarte(30);
    // ModeleMembre[] tableauMembres = new ModeleMembre[0];

   

    // ModeleProjet projet = new ModeleProjet("Parceque c notre projet", tableauCartes, tableauMembres, "Moi");
    // VueProject vueProject = new VueProject(projet);

    // ModeleProjet Petitprojet = new ModeleProjet("Parceque c notre projet", tableauCartes, tableauMembres, "Moi");
    // VuePetitProjet vuePetitProject = new VuePetitProjet(Petitprojet);

    ModeleCartes carte = new ModeleCartes("Coder en java", LocalDate.now(), "Ceci est une carte",
        LocalDate.now().plusDays(7), "statue �tudiant", "436884");
    VueCarte vueCarte = new VueCarte(carte);

   

   

    // ModeleEspacedetravail espacedetravail = new ModeleEspacedetravail(firstmember);
    // VueEspacedetravail vueEspacedetravail = new VueEspacedetravail(espacedetravail);
    // espacedetravail.ajouterProjet(projet);

    // ------------------------------------------------------JFrame----------------------------------------------------//

    // Creer un modele d'ajouter une carte
    JFrame fenetreAjouteCarte = new JFrame("VueAjouterCarte");
    fenetreAjouteCarte.setSize(400, 500);
    fenetreAjouteCarte.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    // Creer un modele d'ajout
    JFrame fenetreAjout = new JFrame("VueAjout");
    fenetreAjout.setSize(300, 200);
    fenetreAjout.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    

    // Creer un modele de calendrier
    JFrame fenetreCelendrier = new JFrame("VueCalendrier");
    fenetreCelendrier.setSize(300, 100);
    fenetreCelendrier.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    // Creer un modele d'un projet
    JFrame fenetreProjet = new JFrame("VueProjet");
    fenetreProjet.setExtendedState(JFrame.MAXIMIZED_BOTH);
    fenetreProjet.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    // Creer un modele d'un Petitprojet
    JFrame fenetrePetitProjet = new JFrame("VueProjet");
    fenetrePetitProjet.setSize(300, 200);
    fenetrePetitProjet.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    // Creer un modele d'une carte
    JFrame fenetreCarte = new JFrame("VueCarte");
    fenetreCarte.setSize(300, 200);
    fenetreCarte.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    // Creer un modele d'un membre
    JFrame fenetrePetitMembre = new JFrame("VueMembre");
    fenetrePetitMembre.setSize(100, 150);
    fenetrePetitMembre.setResizable(false);
    fenetrePetitMembre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);



 

    // ----------------------------------------------------------Fenetre-----------------------------------------------------//

    // fenetreAjouteCarte.add(vueAjouteCarte);
    // fenetreAjouteCarte.setVisible(true);

    // fenetreAjout.add(vueAjoute);
    // fenetreAjout.setVisible(true);

    // fenetreAccueil.add(vueAccueil);
    // vueAccueil.setVisible(true);

    // fenetreCelendrier.add(vueCalendier);
    // fenetreCelendrier.setVisible(true);

    // fenetreProjet.add(vueProject);
    // fenetreProjet.setVisible(true);

    // fenetrePetitProjet.add(vuePetitProject);
    // fenetrePetitProjet.setVisible(true);

    // fenetreCarte.add(vueCarte);
    // fenetreCarte.setVisible(true);

    // fenetrePetitMembre.add(vueMembre);
    // fenetrePetitMembre.setVisible(true);

    // fenetreEspacedetravail.add(vueEspacedetravail);
    // fenetreEspacedetravail.setVisible(true);

  }
}