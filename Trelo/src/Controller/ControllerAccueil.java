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
    
        public ControllerAccueil(ModeleAccueil modeleAccueil, VueAccueil vueAccueil) {
            this.modeleAccueil = modeleAccueil;
            this.vueAccueil = vueAccueil;
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
                        ControllerEspacedetravail controllerEspacedetravail = new ControllerEspacedetravail(espacedetravail,vueEspacedetravail);
                        vueEspacedetravail.setVisible(true);
                        JFrame fenetreEspacedeTravail = new JFrame("VueEspacedeTravail");
                        fenetreEspacedeTravail.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        fenetreEspacedeTravail.setExtendedState(JFrame.MAXIMIZED_BOTH);
                        fenetreEspacedeTravail.add(vueEspacedetravail);   
                        fenetreEspacedeTravail.setVisible(true);
                        vueAccueil.dispose();

                        
                    } else {
                        vueAccueil.afficherMessageErreur();
                    }
                }
            }
        }

         // Ajout de la vue d'inscription dans la vue d'accueil
         public class SInscrireListener extends MouseAdapter {
            
            public void mouseClicked(MouseEvent e) {

                JFrame fenetreInscription = new JFrame("VueInscription");
                fenetreInscription.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                fenetreInscription.setSize(750, 550);
                VueInscription vueInscription = new VueInscription();
                ControllerInscription controllerInscription = new ControllerInscription(vueInscription, modeleAccueil);
                fenetreInscription.add(vueInscription);   
                fenetreInscription.setVisible(true);
                fenetreInscription.setLocationRelativeTo(null);
            }
        }
    }
