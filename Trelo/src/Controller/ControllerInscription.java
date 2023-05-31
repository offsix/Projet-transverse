package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import Modele.*;
import Vue.*;

public class ControllerInscription {
    private VueInscription vueInscription;
    private ModeleAccueil modeleAccueil;

    public ControllerInscription(VueInscription vueInscription, ModeleAccueil modeleAccueil) {
        this.vueInscription = vueInscription;
        this.modeleAccueil = modeleAccueil;


        // Ajouter les listeners
        vueInscription.ajouterListenerInscrire(new InscrireListener());
    }

     class InscrireListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            vueInscription.afficherVide();
            String identifiant = vueInscription.getIdentifiant();
            String motDePasse = vueInscription.getMotDePasse();
            String nom = vueInscription.getNom();
            String prenom = vueInscription.getPrenom();
            String adressemail = vueInscription.getAdresse();

            if (identifiant.isEmpty() || motDePasse.isEmpty() || nom.isEmpty() || prenom.isEmpty() ||prenom.isEmpty() ||adressemail.isEmpty()) {
                vueInscription.afficherVide();
            } 
            else {
                vueInscription.setVisible(true);
                ModeleInscription inscription = new ModeleInscription(identifiant, motDePasse, nom, prenom, adressemail);
                modeleAccueil.ajouterMembre(inscription.getMembre());
                System.out.println("Vous êtes inscrit vous pouvez vous connecter");
                    
            }
        }
    }
}