package Controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.imageio.stream.MemoryCacheImageInputStream;
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
    vueEspacedetravail.ajouterlisstenerMembre(new MembreListener());
    vueEspacedetravail.ajouterlisstenerDeconexion(new Decolistener());
    }

  public class MembreListener extends MouseAdapter {
    public void mouseClicked(MouseEvent e) {
        System.out.println("Membre");
    }
}
public class Decolistener extends MouseAdapter {
    public void mouseClicked(MouseEvent e) {
        System.out.println("Deco");
    }
}
    public class NouveauprojetListener extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
            System.out.println("Nouveau projet");

        }
        
    }
}