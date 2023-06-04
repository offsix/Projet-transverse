package Vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Modele.ModeleProjet;

public class VuePetitProjet extends JPanel {

  private static final long serialVersionUID = 1L;
  private static final int BUTTON_SIZE = 13;

  public VuePetitProjet(ModeleProjet project) {
    setPreferredSize(new Dimension(100, 500));
    setBorder(BorderFactory.createLineBorder(Color.BLACK));
    setLayout(new BorderLayout(5, 5));

    // Panneau supérieur pour le bouton de suppression
    JPanel panelSup = new JPanel();
    panelSup.setBackground(Color.WHITE);
    panelSup.setLayout(new BorderLayout());

    JButton boutonSupprimer = new JButton("Supprimer");
    boutonSupprimer.setPreferredSize(new Dimension(100, BUTTON_SIZE));
    panelSup.add(boutonSupprimer, BorderLayout.NORTH);

    add(panelSup, BorderLayout.NORTH);

    JPanel panelCentral = new JPanel(new GridLayout(4, 1, 5, 5));
    panelCentral.setBackground(Color.WHITE);
    // Panneau centrale
    JLabel labelNomProjet = new JLabel("Nom du projet: " + project.getsNomProjet());
    labelNomProjet.setHorizontalAlignment(SwingConstants.CENTER);
    panelCentral.add(labelNomProjet);

    JLabel labelProprietaire = new JLabel("Propriétaire: " + project.getProprietaire());
    labelProprietaire.setHorizontalAlignment(SwingConstants.CENTER);
    panelCentral.add(labelProprietaire);

    int nombreCartes = project.getTableauCarte().size();
    JLabel labelNombreCartes = new JLabel("Nombre de cartes: " + nombreCartes);
    labelNombreCartes.setHorizontalAlignment(SwingConstants.CENTER);
    panelCentral.add(labelNombreCartes);

    int nombreMembres = project.getTableauMembres().size();
    JLabel labelNombreMembres = new JLabel("Nombre de membres: " + nombreMembres);
    labelNombreMembres.setHorizontalAlignment(SwingConstants.CENTER);
    panelCentral.add(labelNombreMembres);

    add(panelCentral, BorderLayout.CENTER);
  }
}
