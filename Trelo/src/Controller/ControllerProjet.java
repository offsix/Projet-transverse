package Controller;

import Vue.*;
import Modele.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


public class ControllerProjet {
    private VueProject vueProject;
    private ModeleProjet ModeleProjet;


    public ControllerProjet(VueProject vueProject , ModeleProjet ModeleProjet) {
        this.vueProject = vueProject;
        this.ModeleProjet = ModeleProjet;
        // Ajouter les listeners
        vueProject.ajouterListenerSection1butt(new Section1Listener());
        vueProject.ajouterListenerSection2butt(new Section2Listener());
        vueProject.ajouterListenerSection3butt(new Section3Listener());

    }


    class Section1Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            ModeleAjouterCarte modeleAjouterCarte = new ModeleAjouterCarte(ModeleProjet);
            VueAjouterCarte vueAjouterCarte = new VueAjouterCarte(modeleAjouterCarte);            
            JFrame fenetreAjouteCarte = new JFrame("VueAjouteCarte");
            fenetreAjouteCarte.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            fenetreAjouteCarte.setSize(750, 550);
            fenetreAjouteCarte.setLocationRelativeTo(null);
            fenetreAjouteCarte.add(vueAjouterCarte);   
            fenetreAjouteCarte.setVisible(true);
        }
    }
    

    class Section2Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            ModeleAjouterCarte modeleAjouterCarte = new ModeleAjouterCarte(ModeleProjet);
            VueAjouterCarte vueAjouterCarte = new VueAjouterCarte(modeleAjouterCarte);            
            JFrame fenetreAjouteCarte = new JFrame("VueAjouteCarte");
            fenetreAjouteCarte.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            fenetreAjouteCarte.setSize(750, 550);
            fenetreAjouteCarte.setLocationRelativeTo(null);
            fenetreAjouteCarte.add(vueAjouterCarte);   
            fenetreAjouteCarte.setVisible(true);
        }
    }

    

    class Section3Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            ModeleAjouterCarte modeleAjouterCarte = new ModeleAjouterCarte(ModeleProjet);
            VueAjouterCarte vueAjouterCarte = new VueAjouterCarte(modeleAjouterCarte);            
            JFrame fenetreAjouteCarte = new JFrame("VueAjouteCarte");
            fenetreAjouteCarte.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            fenetreAjouteCarte.setSize(750, 550);
            fenetreAjouteCarte.setLocationRelativeTo(null);
            fenetreAjouteCarte.add(vueAjouterCarte);   
            fenetreAjouteCarte.setVisible(true);
        }
    }


}
