package Controller;

import Vue.*;
import Modele.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


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
        vueProject.ajouterlisstenerDeconexion(new DeconexionListener());
        vueProject.ajouterListenerInvbutt(new InvListener());
    }



    class InvListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        String content = vueProject.getlabelinv();
        if(content.contains("@") && content.contains(".")){
            JOptionPane.showMessageDialog(null, "Invitation bien envoyée ! ");
            vueProject.setlabelinv("");
        }
        else{
            JOptionPane.showMessageDialog(null, "Veuillez saisir un mail valide !", "Erreur", JOptionPane.ERROR_MESSAGE);
        }

    }
    }

    class Section1Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            VueAjouterCarte vueAjouterCarte = new VueAjouterCarte();         
            ControllerAjouterCarte controllerAjouterCarte = new ControllerAjouterCarte(vueAjouterCarte, vueProject,ModeleProjet);              
            vueAjouterCarte.setSection(1);
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
            VueAjouterCarte vueAjouterCarte = new VueAjouterCarte();            
            ControllerAjouterCarte controllerAjouterCarte = new ControllerAjouterCarte(vueAjouterCarte, vueProject,ModeleProjet);              
            vueAjouterCarte.setSection(2);
            JFrame fenetreAjouteCarte = new JFrame("VueAjouteCarte");
            fenetreAjouteCarte.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            fenetreAjouteCarte.setSize(750, 550);
            fenetreAjouteCarte.setLocationRelativeTo(null);
            fenetreAjouteCarte.add(vueAjouterCarte);   
            fenetreAjouteCarte.setVisible(true);
        }
    }

    
    // 
    class Section3Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            VueAjouterCarte vueAjouterCarte = new VueAjouterCarte(); 
            ControllerAjouterCarte controllerAjouterCarte = new ControllerAjouterCarte(vueAjouterCarte, vueProject,ModeleProjet);              
            JFrame fenetreAjouteCarte = new JFrame("VueAjouteCarte");
            vueAjouterCarte.setSection(3);
            fenetreAjouteCarte.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            fenetreAjouteCarte.setSize(750, 550);
            fenetreAjouteCarte.setLocationRelativeTo(null);
            fenetreAjouteCarte.add(vueAjouterCarte);   
            fenetreAjouteCarte.setVisible(true);
        }
    }


    // quand il est appelé ça fait affiché une fenetre si oui ou non il veut quitter l'appli
    class DeconexionListener extends MouseAdapter{
    public void mouseClicked(MouseEvent e) {
        System.out.println("mouse clicked");
        int option = JOptionPane.showOptionDialog(null, "Voulez-vous vraiment vous déconnecter ?", "Confirmation",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
    
        if (option == JOptionPane.YES_OPTION) {
          JFrame parent = (JFrame) vueProject.getTopLevelAncestor();
          parent.dispose();
        } 
           }



    }}
