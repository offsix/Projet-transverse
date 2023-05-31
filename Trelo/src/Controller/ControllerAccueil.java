package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
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
                    boolean estMembre = modeleAccueil.estunmembre(identifiant, motDePasse);
                    if (estMembre) {
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
                ModeleInscription inscription = new ModeleInscription(vueAccueil.getIdentifiant(),
                        vueAccueil.getMotDePasse(), vueAccueil.getName(), vueAccueil.getprenom(),
                        vueAccueil.getadresseMail());
                        System.out.println("Veut s'inscrire");
    
                VueInscription vueInscription = new VueInscription(inscription);
                vueInscription.setVisible(true);
            }
        }
    }
