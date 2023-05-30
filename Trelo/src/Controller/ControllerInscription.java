package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modele.*;
import Vue.*;


public class ControllerInscription {
    private ModeleInscription modeleInscription;
    private VueInscription vueInscription;

    public ControllerInscription(VueInscription vueInscription) {
        this.vueInscription = vueInscription;

        // Ajouter les listeners
        vueInscription.ajouterListenerInscrire(new InscrireListener());
    }

     class InscrireListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Inscrire");
            vueInscription.afficherVide();
            String identifiant = vueInscription.getIdentifiant();
            String motDePasse = vueInscription.getMotDePasse();
            String nom = vueInscription.getNom();
            String prenom = vueInscription.getPrenom();
            String adressemail = vueInscription.getAdresse();

            if (identifiant.isEmpty() || motDePasse.isEmpty() || nom.isEmpty() || prenom.isEmpty() || adressemail.isEmpty()) {
                vueInscription.afficherVide();
            } 
            else {
                    vueInscription.setVisible(true);
                    ModeleInscription membre = new ModeleInscription(identifiant, motDePasse, nom, prenom, adressemail);

            }
        }
    }
}