package Classe;

import Vue.*;
import Modele.*;
import java.time.LocalDate;

import javax.swing.JFrame;

import Modele.*;
import Vue.*;
import Controller.*;

/** @autor Dayssam BAKAAR **/
/** @autor Abdoulaye WAGNE **/

public class Application {


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

    // //creation d'un membre par defaut (admin)
    ModeleMembre test = new ModeleMembre("a","a","a","a","a@outlook.fr");
    modeleAccueil.ajouterMembre(test);


  }
}