package Controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

import java.awt.event.MouseAdapter;

import Modele.*;
import Vue.*;

public class ControllerEspacedetravail {
    private ModeleEspacedetravail modeleEspacedetravail;
    private VueEspacedetravail vueEspacedetravail;

    public ControllerEspacedetravail(ModeleEspacedetravail modeleEspacedetravail, VueEspacedetravail vueEspacedetravail) {
        this.modeleEspacedetravail = modeleEspacedetravail;
        this.vueEspacedetravail = vueEspacedetravail;
    
    vueEspacedetravail.ajouterlisstenerNouveauprojet(new NouveauprojetListener());
    }
    public class NouveauprojetListener extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
            
        }
        
    }
}