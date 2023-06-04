package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import Modele.ModeleProjet;
import Vue.VueCreerProjet;
import Vue.VueNvprojdansEDT;
import Vue.VueProject;

public class ControlerNvprojdansEDT {
 private VueNvprojdansEDT vueNvprojdansEDT;
    public ControlerNvprojdansEDT(VueNvprojdansEDT vueNvprojdansEDT) {

    this.vueNvprojdansEDT = vueNvprojdansEDT;
    
    vueNvprojdansEDT.ajouterlisstenerouvrirproj(new listenerouvrirproj());

    }
    public class listenerouvrirproj implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("ouvrir projet");
            ModeleProjet modeleProjet = vueNvprojdansEDT.getprojet();
            VueProject ouvrirProject = new VueProject(modeleProjet);
            ControllerProjet controllerProjet = new ControllerProjet(ouvrirProject,modeleProjet);
            JFrame frame = new JFrame();
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(ouvrirProject);
            frame.setVisible(true);

            
        }
    }
}
