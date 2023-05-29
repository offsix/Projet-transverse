package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        }
    
        // Listener pour le bouton Se connecter
        class SeConnecterListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                String identifiant = vueAccueil.getIdentifiant();
                String motDePasse = vueAccueil.getMotDePasse();
    
                if (identifiant.isEmpty() || motDePasse.isEmpty()) {
                    vueAccueil.afficherVide();
                } else {
                    boolean estMembre = modeleAccueil.estunmembre(identifiant, motDePasse);
                    if (estMembre) {
                        vueAccueil.afficherMessageBienvenue();
                        ModeleEspacedetravail espacedetravail = new ModeleEspacedetravail(modeleAccueil.getMembre(vueAccueil.getIdentifiant()));
                        VueEspacedetravail vueEspacedetravail = new VueEspacedetravail(espacedetravail);
                        vueEspacedetravail.setVisible(true);
                        vueAccueil.dispose();
                    } else {
                        vueAccueil.afficherMessageErreur();
                    }
                }
            }
        }
    }
