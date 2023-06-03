package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modele.ModeleAjouterCarte;
import Modele.ModeleProjet;
import Vue.VueAjouterCarte;
import Vue.VueProject;

public class ControllerAjouterCarte {
    private VueAjouterCarte vueAjouterCarte;
    private VueProject vueProject;
    private ModeleAjouterCarte modeleAjouterCarte;
    private ModeleProjet modeleProjet;

    public ControllerAjouterCarte(VueAjouterCarte vueAjouterCarte, VueProject vueProject, ModeleProjet modeleProjet) {
        this.vueAjouterCarte = vueAjouterCarte;
        this.vueProject = vueProject;
        this.modeleProjet = modeleProjet;

        // Ajouter les listeners
        vueAjouterCarte.ajouterListenerAjouterCarte(new AjoutcarteListener());
    }

    public class AjoutcarteListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
           ModeleAjouterCarte modeleAjouterCarte = new ModeleAjouterCarte(modeleProjet,vueAjouterCarte.getTitreCarte(),vueAjouterCarte.getDateDebutCarte(),vueAjouterCarte.getDescriptionCarte(),vueAjouterCarte.getDateLimiteCarte(),vueAjouterCarte.getStatutCarte());
           modeleAjouterCarte.getCarte().setSection(vueAjouterCarte.getSection());
           vueProject.ajouterCarte(modeleAjouterCarte.getCarte());
           vueAjouterCarte.validate();
           vueProject.validate();

            }
    }

 

}

