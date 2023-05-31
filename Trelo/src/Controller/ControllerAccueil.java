package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

import java.awt.event.MouseAdapter;

import Modele.*;
import Vue.*;


public class ControllerAccueil {
  

        private ModeleAccueil modeleAccueil;
        private VueAccueil vueAccueil;
        private VueInscription vueInscription;
    
        public ControllerAccueil(ModeleAccueil modeleAccueil, VueAccueil vueAccueil ,VueInscription vueInscription) {
            this.modeleAccueil = modeleAccueil;
            this.vueAccueil = vueAccueil;
            this.vueInscription = vueInscription;

            
    
            // Ajouter les listeners
            vueAccueil.ajouterListenerSeConnecter(new SeConnecterListener());
            vueAccueil.ajouterListenerSInscrire(new SInscrireListener());
        }
    
        // Listener pour le bouton Se connecter
        public class SeConnecterListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                String identifiant = vueAccueil.getIdentifiant();
                String motDePasse = vueAccueil.getMotDePasse();
    
                if (identifiant.isEmpty() || motDePasse.isEmpty()) {
                    vueAccueil.afficherVide();
                } else {
                    if (modeleAccueil.estunmembre(identifiant, motDePasse)) {
                        vueAccueil.afficherMessageBienvenue();
                        ModeleMembre membre = new ModeleMembre(vueAccueil.getIdentifiant(), vueAccueil.getMotDePasse(), vueAccueil.getName(), vueAccueil.getprenom(), vueAccueil.getadresseMail());
                        ModeleEspacedetravail espacedetravail = new ModeleEspacedetravail(membre);
                        VueEspacedetravail vueEspacedetravail = new VueEspacedetravail(espacedetravail);
                        vueEspacedetravail.setVisible(true);
                        System.out.println("Est connecté");
                    } else {
                        vueAccueil.afficherMessageErreur();
                    }
                }
            }
        }

         // Ajout de la vue d'inscription dans la vue d'accueil
         public class SInscrireListener extends MouseAdapter {
            
            public void mouseClicked(MouseEvent e) {
                // ModeleInscription inscription = new ModeleInscription(vueAccueil.getIdentifiant(),
                //         vueAccueil.getMotDePasse(), vueAccueil.getName(), vueAccueil.getprenom(),
                //         vueAccueil.getadresseMail());
                JFrame fenetreInscription = new JFrame("VueInscription");
                         fenetreInscription.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                         fenetreInscription.setLocationRelativeTo(null);
                         fenetreInscription.setSize(750, 550);
                         fenetreInscription.add(vueInscription);                         
                         fenetreInscription.setVisible(true);
            }
        }
    }
