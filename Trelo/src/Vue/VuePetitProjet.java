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

public class VuePetitProjet extends JPanel {	//Coder par Mathieu Flesch

    private static final long serialVersionUID = 1L;
    private static final int BUTTON_SIZE = 13;

    public VuePetitProjet(ModeleProjet project) {
        setPreferredSize(new Dimension(100, 500));
        setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Ajouter une bordure noire autour du panneau
        setLayout(new GridLayout(4, 1, 5, 5)); // Utiliser un GridLayout avec 4 lignes et 1 colonne, espacement de 5 pixels

        JLabel labelNomProjet = new JLabel("Nom du projet: " + project.getsNomProjet());
        labelNomProjet.setHorizontalAlignment(SwingConstants.CENTER);
        add(labelNomProjet);

        JLabel labelProprietaire = new JLabel("Propriétaire: " + project.getProprietaire());
        labelProprietaire.setHorizontalAlignment(SwingConstants.CENTER);
        add(labelProprietaire);

        int nombreCartes = project.gettableauCarte().length;
        JLabel labelNombreCartes = new JLabel("Nombre de cartes: " + nombreCartes);
        labelNombreCartes.setHorizontalAlignment(SwingConstants.CENTER);
        add(labelNombreCartes);

        int nombreMembres = project.getTableauMembres().length;
        JLabel labelNombreMembres = new JLabel("Nombre de membres: " + nombreMembres);
        labelNombreMembres.setHorizontalAlignment(SwingConstants.CENTER);
        
     // Création des contraintes pour positionner le bouton
        GridBagConstraints gbcBouton = new GridBagConstraints();
        gbcBouton.gridx = 0; // Colonne 0
        gbcBouton.gridy = 2; // Ligne 2
        gbcBouton.weightx = 1.0;
        gbcBouton.weighty = 0.1;
        gbcBouton.fill = GridBagConstraints.BOTH;

        // Création du bouton
        JButton bouton = new JButton("Ouvrir");
        bouton.setPreferredSize(new Dimension(200, 50)); // Définir la taille souhaitée pour le bouton

        // Ajout du bouton dans le panel avec les contraintes
        add(bouton, gbcBouton);

        add(bouton, BorderLayout.NORTH);
        add(labelNombreMembres);
    }
}
