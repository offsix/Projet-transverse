package Controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.imageio.stream.MemoryCacheImageInputStream;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;

import Modele.*;
import Vue.*;
import Controller.*;

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
        int option = JOptionPane.showOptionDialog(null, "Voulez-vous vraiment vous déconnecter ?", "Confirmation",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
    
        if (option == JOptionPane.YES_OPTION) {
             ModeleAccueil modeleAccueil = new ModeleAccueil();
             VueAccueil VueAccueil = new VueAccueil(modeleAccueil);
             JFrame fenetreAccueil = new JFrame("VueEspacedeTravail");
             fenetreAccueil.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
             fenetreAccueil.setExtendedState(JFrame.MAXIMIZED_BOTH);
            fenetreAccueil.add(VueAccueil);   
            fenetreAccueil.setVisible(true);
             fenetreAccueil.setLocationRelativeTo(null);
          JFrame parent = (JFrame) vueEspacedetravail.getTopLevelAncestor();
          parent.dispose();
        } 
           }

}
    public class NouveauprojetListener extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
            VueCreerProjet VueCreerProjet = new VueCreerProjet();
            ControllerCreerProjet controllerCreerProjet = new ControllerCreerProjet(VueCreerProjet, vueEspacedetravail);

            JFrame fenetreCreerprojet = new JFrame("VueCreerProjet");
            fenetreCreerprojet.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            fenetreCreerprojet.setSize(400,500);
            fenetreCreerprojet.add(VueCreerProjet);
            fenetreCreerprojet.setVisible(true);
            fenetreCreerprojet.setLocationRelativeTo(null);


        }
        
    }
}