package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import Modele.*;
import Vue.*;
/** @autor Dayssam BAKAAR **/
/** @autor Abdoulaye WAGNE **/
public class ControllerInscription {
    private VueInscription vueInscription;
    private ModeleAccueil modeleAccueil;

    public ControllerInscription(VueInscription vueInscription, ModeleAccueil modeleAccueil) {
        this.vueInscription = vueInscription;
        this.modeleAccueil = modeleAccueil;


        // Ajouter les listeners
        vueInscription.ajouterListenerInscrire(new InscrireListener());
    }

    // quand l'utilisateur clique sur le bouton s'inscrire un menus s'ouvre permet de s'inscrire
     class InscrireListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String identifiant = vueInscription.getIdentifiant();
            String motDePasse = vueInscription.getMotDePasse();
            String nom = vueInscription.getNom();
            String prenom = vueInscription.getPrenom();
            String adressemail = vueInscription.getAdresse();

            if (identifiant.isEmpty() || motDePasse.isEmpty() || nom.isEmpty() || prenom.isEmpty() ||prenom.isEmpty() ||adressemail.isEmpty()) {
                vueInscription.afficherVide();
            } 
            else {
                ModeleInscription inscription = new ModeleInscription(modeleAccueil,identifiant, motDePasse, nom, prenom, adressemail);
                vueInscription.validate();
                modeleAccueil.listemembre();
                vueInscription.afficherCorrect();
                JFrame parent = (JFrame) vueInscription.getTopLevelAncestor();
                parent.dispose();
                
            }
        }
    }
}