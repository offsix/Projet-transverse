package Vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import Modele.ModeleEspacedetravail;

public class VueEspacedetravail extends JPanel {	//Coder par Mathieu Flesch

  private static final long serialVersionUID = 1L;

  public VueEspacedetravail(ModeleEspacedetravail espacedetravail) {
    setLayout(new BorderLayout());
    JPanel panel = new JPanel(new GridBagLayout());
    panel.setPreferredSize(new Dimension(400, 300));

    //-----------------------------------------//
    //	        GBCFIRST 	 		  	   	 //
    //-----------------------------------------//
    GridBagConstraints gbcFirst = new GridBagConstraints();
    gbcFirst.gridx = 0;
    gbcFirst.gridy = 0;
    gbcFirst.weightx = 0.1;
    gbcFirst.weighty = 1.0;
    gbcFirst.gridwidth = 1; // Fixer la largeur � 1
    gbcFirst.fill = GridBagConstraints.BOTH;

    JPanel panelFirst = new JPanel(new GridBagLayout());
    panelFirst.setBackground(Color.white);
    MatteBorder border = new MatteBorder(0, 0, 0, 2, Color.BLACK);
    panelFirst.setBorder(border);
    panel.add(panelFirst, gbcFirst);
    //-----------------------------------------//
    //     		        GBCFIRST 1.1 		   //
    //-----------------------------------------//
    GridBagConstraints gbcSection11 = new GridBagConstraints();
    gbcSection11.gridx = 0;
    gbcSection11.gridy = 0;
    gbcSection11.weightx = 1.0;
    gbcSection11.weighty = 0.1;
    gbcSection11.fill = GridBagConstraints.BOTH;

    JPanel section11 = new JPanel(new BorderLayout());
    section11.setBackground(Color.blue);

    // Chargement de l'image du logo
    ImageIcon logoIcon = new ImageIcon("/Trelo/Image/logo.jpg");
    JLabel logoLabel = new JLabel(logoIcon);

    panelFirst.add(section11, gbcSection11);
    panelFirst.setBackground(Color.RED);
    //-----------------------------------------//
    // 		        GBCFIRST 1.2 		  	   //
    //-----------------------------------------//
    GridBagConstraints gbcSection12 = new GridBagConstraints();
    gbcSection12.gridx = 0;
    gbcSection12.gridy = 1;
    gbcSection12.weightx = 1.0;
    gbcSection12.weighty = 0.9;
    gbcSection12.fill = GridBagConstraints.BOTH;

    JPanel section12 = new JPanel();
    section12.setBackground(Color.white);
    panelFirst.add(section12, gbcSection12);

    //-----------------------------------------//
    // GBCSECOND //
    //-----------------------------------------//
    GridBagConstraints gbcSecond = new GridBagConstraints();
    gbcSecond.gridx = 1;
    gbcSecond.gridy = 0;
    gbcSecond.weightx = 0.9;
    gbcSecond.weighty = 1.0;
    gbcSecond.fill = GridBagConstraints.BOTH;

    JPanel panelSecond = new JPanel(new GridBagLayout());
    panelSecond.setBackground(Color.white);
    panelSecond.setBorder(border);
    panel.add(panelSecond, gbcSecond);

    //-----------------------------------------//
    // GBCSECOND 2.1 //
    //-----------------------------------------//
    GridBagConstraints gbcSection21 = new GridBagConstraints();
    gbcSection21.gridx = 0;
    gbcSection21.gridy = 0;
    gbcSection21.weightx = 1.0;
    gbcSection21.weighty = 0.05;
    gbcSection21.fill = GridBagConstraints.BOTH;

    JPanel section21 = new JPanel();
    section21.setBackground(Color.white);
    section21.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // D�finir une marge vide autour du panneau

    //R�cup�ration du nom du projet
    String nomProjet = ("Voici les projets de : ") + espacedetravail.getProprietaire().getPseudo();

    //Cr�ation du JLabel pour afficher le nom du projet en grand au milieu
    JLabel labelNomProjet = new JLabel(nomProjet);
    labelNomProjet.setFont(new Font("Arial", Font.BOLD, 34));
    labelNomProjet.setHorizontalAlignment(SwingConstants.CENTER);

    //Ajout du JLabel dans la section21
    section21.setLayout(new BorderLayout());
    section21.add(labelNomProjet, BorderLayout.CENTER);

    //Ajout de la section 21 dans panelSecond
    panelSecond.add(section21, gbcSection21);

    //-----------------------------------------//
    // GBCSECOND 2.2 //
    //-----------------------------------------//
    GridBagConstraints gbcSection22 = new GridBagConstraints();
    gbcSection22.gridx = 0;
    gbcSection22.gridy = 1;
    gbcSection22.weightx = 1.0;
    gbcSection22.weighty = 0.95;
    gbcSection22.fill = GridBagConstraints.BOTH;

    // Cr�ation du conteneur pour les cartes
    JPanel section22 = new JPanel(new GridLayout(0, 4, 10, 10)); // GridLayout avec 4 colonnes et espacement de 10 pixels
    section22.setBackground(Color.white);

    // Ajout des cartes dans le conteneur
    // for (ModeleProjet projet: espacedetravail.getProject()) {
    //   VuePetitProjet vuePetitProjet = new VuePetitProjet(projet);
    //   Dimension carteSize = new Dimension(200, 150); // D�finir la taille des cartes souhait�e
    //   vuePetitProjet.setPreferredSize(carteSize);

    //   Border border1 = new LineBorder(Color.BLACK, 1); // Cr�e une bordure avec une ligne noire d'�paisseur 1
    //   vuePetitProjet.setBorder(border1);

    //   section22.add(vuePetitProjet);
    // }

    // Cr�ation du JScrollPane avec le conteneur des cartes
    JScrollPane scrollPane = new JScrollPane(section22);
    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

    // Ajout du JScrollPane dans le panelSecond avec les contraintes
    panelSecond.add(scrollPane, gbcSection22);

   
    add(panel);
  }
}