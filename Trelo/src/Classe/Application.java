package Classe;

import Vue.*;
import Modele.*;
import java.time.LocalDate;

import javax.swing.JFrame;

import Controller.ControllerAccueil;
import Modele.ModeleCalendrier;
import Modele.ModeleCartes;
import Modele.ModeleEspacedetravail;
import Modele.ModeleMembre;
import Modele.ModeleProjet;
import Modele.ModeleAccueil;

public class Application { // Coder par Mathieu Flesch

  public static ModeleProjet[] creationProjets(int iNum) { // Fonction pour cr�er des projets
    ModeleProjet[] tableauProjets = new ModeleProjet[iNum];

    // Création des cartes et des membres
    ModeleCartes[] tableauCartes = creationCarte(iNum);
    ModeleMembre[] tableauMembres = new ModeleMembre[0];

    for (int i = 0; i < iNum; i++) {
      ModeleCartes[] cartesProjet = tableauCartes; // Utiliser le m�me tableau de cartes pour chaque projet
      // Créer un projet avec les cartes et le propriétaire
      ModeleProjet projet = new ModeleProjet("Mon projet", tableauCartes, tableauMembres, "Moi");
      tableauProjets[i] = projet; // Ajouter le projet dans le tableau
    }
    return tableauProjets;
  }

  public static ModeleCartes[] creationCarte(int iNum) { // Fonction pour cr�er des Cartes
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

  
   /* public static void ajouterCarte(ModeleProjet projet, String titre, LocalDate
   dateDebut, String description, LocalDate dateLimite, String statut, String
   couverture) {
    ModeleCartes carte = new ModeleCartes(titre, dateDebut, description,
    dateLimite, statut, couverture);
   projet.ajouterCarte(carte);
    }
   
    public static void ajouterMembre(ModeleProjet projet, String imagePath,
   String nom, String prenom) {
    ModeleMembre membre = new ModeleMembre(imagePath, nom, prenom);
   projet.ajouterMembre(membre);
    }
    
    public static void ajouterProjet(ModeleEspacedetravail espacedetravail,
    String titre, ModeleCartes[] cartes, ModeleMembre[] membres, String
    proprietaire) {
    ModeleProjet projet = new ModeleProjet(titre, cartes, membres, proprietaire);
    espacedetravail.ajouterProjet(projet);
    } */
   

  public static void main(String[] args) {
    // --------------------------
    // Creer un modele d'ajouter une carte
    // --------------------------

    JFrame fenetreAjouteCarte = new JFrame("VueAjouterCarte");
    fenetreAjouteCarte.setSize(400, 500);
    fenetreAjouteCarte.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ModeleAjouterCarte ajoutCarte = new ModeleAjouterCarte();
    VueAjouterCarte vueAjouteCarte = new VueAjouterCarte(ajoutCarte);

    fenetreAjouteCarte.add(vueAjouteCarte);
    fenetreAjouteCarte.setVisible(true);

    // --------------------------
    // Creer un modele d'ajout
    // --------------------------
    JFrame fenetreAjout = new JFrame("VueAjout");
    fenetreAjout.setSize(300, 200);
    fenetreAjout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ModeleAjout ajout = new ModeleAjout();
    VueAjoute vueAjoute = new VueAjoute(ajout);

    fenetreAjout.add(vueAjoute);
    fenetreAjout.setVisible(true);

    // --------------------------
    // Creer un modele d'accueil
    // --------------------------

    JFrame fenetreAccueil = new JFrame("VueAccueil");
    fenetreAccueil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ModeleAccueil modeleAccueil = new ModeleAccueil();
    VueAccueil vueAccueil = new VueAccueil(modeleAccueil);

    // vueAccueil.setVisible(true);

    // ------------------------------
    // Creer un modele de calendrier
    // ------------------------------
    JFrame fenetreCelendrier = new JFrame("VueCalendrier");
    fenetreCelendrier.setSize(300, 100);
    fenetreCelendrier.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ModeleCalendrier calendrier = new ModeleCalendrier(LocalDate.now(), LocalDate.now());
    VueCalendrier vueCalendier = new VueCalendrier(calendrier);

    // fenetreCelendrier.add(vueCalendier);
    // fenetreCelendrier.setVisible(true);

    // ----------------------------
    // Creer un modele d'un projet
    // ----------------------------
    //creation de cartes pour les ajouter au projet
    ModeleCartes[] tableauCartes = creationCarte(30);
    ModeleMembre[] tableauMembres = new ModeleMembre[0];

    //Creation des membres manuellement et ajout au vecteur de l'acceuil
    ModeleMembre firstmember = new ModeleMembre("2soum", "123", "dayssam", "boss", "dayssam@outlook.fr");
    ModeleMembre secondmember = new ModeleMembre("abdou", "troll", "abdou", "boss", "abdou@outlook.fr");
    
    modeleAccueil.ajouterMembre(firstmember);
    modeleAccueil.ajouterMembre(secondmember);

    JFrame fenetreProjet = new JFrame("VueProjet");
    fenetreProjet.setExtendedState(JFrame.MAXIMIZED_BOTH);
    fenetreProjet.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ModeleProjet projet = new ModeleProjet("Parceque c notre projet", tableauCartes, tableauMembres, "Moi");
    VueProject vueProject = new VueProject(projet);

    fenetreProjet.add(vueProject);
    fenetreProjet.setVisible(true);

    // ----------------------------
    // Creer un modele d'un Petitprojet
    // ----------------------------

    JFrame fenetrePetitProjet = new JFrame("VueProjet");
    fenetrePetitProjet.setSize(300, 200);
    fenetrePetitProjet.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ModeleProjet Petitprojet = new ModeleProjet("Parceque c notre projet", tableauCartes, tableauMembres, "Moi");
    VuePetitProjet vuePetitProject = new VuePetitProjet(Petitprojet);

     fenetrePetitProjet.add(vuePetitProject);
     fenetrePetitProjet.setVisible(true);

    // ----------------------------
    // Creer un modele d'une carte
    // ----------------------------

    JFrame fenetreCarte = new JFrame("VueCarte");
    fenetreCarte.setSize(300, 200);
    fenetreCarte.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ModeleCartes carte = new ModeleCartes("Coder en java", LocalDate.now(), "Ceci est une carte",
      LocalDate.now().plusDays(7), "statue �tudiant", "436884");
    VueCarte vueCarte = new VueCarte(carte);

    // fenetreCarte.add(vueCarte);
    // fenetreCarte.setVisible(true);

    // ----------------------------
    // Creer un modele d'un membre
    // ----------------------------
    JFrame fenetrePetitMembre = new JFrame("VueMembre");
    fenetrePetitMembre.setSize(100, 150);
    fenetrePetitMembre.setResizable(false);
    fenetrePetitMembre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    VuePetitMembre vueMembre = new VuePetitMembre(firstmember);

     fenetrePetitMembre.add(vueMembre);
     fenetrePetitMembre.setVisible(true);

    // -------------------------------------
    // Creer un modele d'un espacedetravail
    // -------------------------------------

    ModeleMembre membre = new ModeleMembre(vueAccueil.getIdentifiant(), vueAccueil.getMotDePasse(), vueAccueil.getName(), vueAccueil.getprenom(), vueAccueil.getadresseMail());

    JFrame fenetreEspacedetravail = new JFrame("VueEspacedetravail");
    fenetreEspacedetravail.setExtendedState(JFrame.MAXIMIZED_BOTH);
    fenetreEspacedetravail.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     ModeleInscription inscription = new ModeleInscription("Identifiant", "motdepasse", "nom", "prenom", "adresseMail");  
    VueInscription vueInscription = new VueInscription(inscription);

    ControllerAccueil controllerAccueil = new ControllerAccueil(modeleAccueil, vueAccueil); 
    ModeleEspacedetravail espacedetravail = new ModeleEspacedetravail(firstmember);
    VueEspacedetravail vueEspacedetravail = new VueEspacedetravail(espacedetravail);

    espacedetravail.ajouterProjet(projet);

    fenetreEspacedetravail.add(vueEspacedetravail);
    fenetreEspacedetravail.setVisible(true);
  }
}