package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import Modele.*;
import Vue.*;

public class ControllerCreerProjet {
    private VueCreerProjet vueCreerProjet;
    private VueEspacedetravail vueEspacedetravail;
    
    // Constructeur controleur creer projet
    public ControllerCreerProjet(VueCreerProjet vueCreerProjet,VueEspacedetravail vueEspacedetravail) {
        this.vueEspacedetravail = vueEspacedetravail;
        this.vueCreerProjet = vueCreerProjet;
        vueCreerProjet.ajouterListenerAjouterProjet(new AddProjectlistener());
    }

    //permet d'ajoter un projet dans l'espace de travail
    class AddProjectlistener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            System.out.println("Ajouter projet");
            vueEspacedetravail.ajoutProjet(vueCreerProjet.getTitle(), vueCreerProjet.getDescription());
            vueCreerProjet.validate();

        }
}
}