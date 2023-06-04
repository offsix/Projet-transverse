package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modele.ModeleAjouterCarte;
import Modele.ModeleProjet;
import Vue.VueAjouterCarte;
import Vue.VueProject;

/** @autor Dayssam BAKAAR **/
/** @autor Abdoulaye WAGNE **/
public class ControllerAjouterCarte {
    private VueAjouterCarte vueAjouterCarte;
    private VueProject vueProject;
    private ModeleAjouterCarte modeleAjouterCarte;
    private ModeleProjet modeleProjet;

    // Constructeur controlleur accueil
    public ControllerAjouterCarte(VueAjouterCarte vueAjouterCarte, VueProject vueProject, ModeleProjet modeleProjet) {
        this.vueAjouterCarte = vueAjouterCarte;
        this.vueProject = vueProject;
        this.modeleProjet = modeleProjet;

        // Ajouter les listeners
        vueAjouterCarte.ajouterListenerAjouterCarte(new AjoutcarteListener());
    }
    
    /**
    * Méthode qui est appelée lorsqu'un événement se produit. Cette méthode crée un nouvel objet "ModeleAjouterCarte"
    * et définit ses attributs en utilisant les valeurs de "vueAjouterCarte". Le nouvel objet est ensuite ajouté à "vueProject"
    * et les deux objets "vueAjouterCarte" et "vueProject" sont validés.
    *
    * @param  e  l'événement d'action
    */

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

