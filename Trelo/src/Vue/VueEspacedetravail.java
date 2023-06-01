package Vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.List;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import Modele.ModeleEspacedetravail;
import Modele.ModeleProjet;

public class VueEspacedetravail extends JPanel { 

  private static final long serialVersionUID = 1L;

  public VueEspacedetravail(ModeleEspacedetravail espacedetravail) {
    MatteBorder vert = new MatteBorder(2, 2, 2, 2, Color.GREEN);
    MatteBorder bleu = new MatteBorder(2, 2, 2, 2, Color.BLUE);
    MatteBorder rose = new MatteBorder(2, 2, 2, 2, Color.PINK);
    MatteBorder jaune = new MatteBorder(2, 2, 2, 2, Color.YELLOW);
    MatteBorder rouge = new MatteBorder(2, 2, 2, 2, Color.RED);
    //Panel Global
    setLayout(new BorderLayout());
    JPanel panelglobal = new JPanel(new GridBagLayout());
    panelglobal.setPreferredSize(new Dimension(400, 300));
    panelglobal.setBorder(rouge);
    panelglobal.setBackground(Color.WHITE);




    //-----------------------------------------//
    // 		        PANNEL GAUCHE 	BARRE NAV	  	   //
    //-----------------------------------------//
    GridBagConstraints gbcbarrenav = new GridBagConstraints();
    gbcbarrenav.gridx = 0;
    gbcbarrenav.gridy = 0;
    gbcbarrenav.weightx = 0.05;
    gbcbarrenav.weighty = 1.0;
    gbcbarrenav.gridwidth = 1; // Fixer la largeur � 1
    gbcbarrenav.fill = GridBagConstraints.BOTH;

    JPanel panelFirst = new JPanel(new GridBagLayout());
    panelFirst.setBackground(Color.WHITE);
    panelglobal.add(panelFirst, gbcbarrenav);
    
    //-----------------------------------------//
    //PANNEL LOGO
    //-----------------------------------------//

    ImageIcon logoIcon = new ImageIcon("Trelo/Image/testlogo.png");
    // Redimensionner l'image � une taille sp�cifique (par exemple, 50x50)
    Image scaledImage = logoIcon.getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH);
    ImageIcon scaledLogoIcon = new ImageIcon(scaledImage);
    JLabel logoLabel = new JLabel(scaledLogoIcon);
    JPanel section11 = new JPanel(new BorderLayout());

    
    ImageIcon logoIcon2 = new ImageIcon("Trelo/Image/profile.png"); 
    //Redimensionner l'image � une taille sp�cifique (par exemple, 50x50)
    Image scaledImage2 = logoIcon2.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
    ImageIcon scaledLogoIcon2 = new ImageIcon(scaledImage2);
    JLabel logoLabel2 = new JLabel(scaledLogoIcon2);
    JPanel section122 = new JPanel(new BorderLayout());

        
    ImageIcon logoIcon3 = new ImageIcon("Trelo/Image/door-open.png");
    //Redimensionner l'image � une taille sp�cifique (par exemple, 50x50)
    Image scaledImage3 = logoIcon3.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
    ImageIcon scaledLogoIcon3 = new ImageIcon(scaledImage3);
    JLabel logoLabel3 = new JLabel(scaledLogoIcon3);
    JPanel section123 = new JPanel(new BorderLayout());

    // ImageIcon logoIcon4 = new ImageIcon("Trelo/Image/door-open.png");
    // //Redimensionner l'image � une taille sp�cifique (par exemple, 50x50)
    // Image scaledImage4 = logoIcon4.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
    // ImageIcon scaledLogoIcon4 = new ImageIcon(scaledImage3);
    // JLabel logoLabel4 = new JLabel(scaledLogoIcon3);
    // JPanel section124 = new JPanel(new BorderLayout());
    // section124.setBorder(rouge);


    GridBagConstraints gbcSection11 = new GridBagConstraints();
    gbcSection11.gridx = 0;
    gbcSection11.gridy = 0;
    gbcSection11.weightx = 1.0;
    gbcSection11.weighty = 0.05;
    gbcSection11.fill = GridBagConstraints.BOTH;
    section11.add(logoLabel, BorderLayout.CENTER);
    panelFirst.add(section11, gbcSection11);

    gbcSection11.gridx = 0;
    gbcSection11.gridy = 1;
    gbcSection11.weightx = 1.0;
    gbcSection11.weighty = 0;
    gbcSection11.fill = GridBagConstraints.BOTH;
    section122.add(logoLabel2, BorderLayout.CENTER);
    panelFirst.add(section122, gbcSection11);

    gbcSection11.gridx = 0;
    gbcSection11.gridy = 2;
    gbcSection11.weightx = 1.0;
    gbcSection11.weighty = 1;
    gbcSection11.fill = GridBagConstraints.BOTH;
    section123.add(logoLabel3, BorderLayout.SOUTH);
    panelFirst.add(section123, gbcSection11);

    // gbcSection11.gridx = 0;
    // gbcSection11.gridy = 3;
    // gbcSection11.weightx = 1.0;
    // gbcSection11.weighty = 0;
    // gbcSection11.fill = GridBagConstraints.BOTH;
    // section124.add(logoLabel4, BorderLayout.SOUTH);
    // panelFirst.add(section124, gbcSection11);

 


    //-----------------------------------------//
    //              PANNEL MAIN                  //
    //-----------------------------------------//
    GridBagConstraints gbcSecond = new GridBagConstraints();
    gbcSecond.gridx = 1;
    gbcSecond.gridy = 0;
    gbcSecond.weightx = 0.9;
    gbcSecond.weighty = 1.0;
    gbcSecond.fill = GridBagConstraints.BOTH;

    JPanel panelSecond = new JPanel(new GridBagLayout());
    panelSecond.setBackground(Color.white);
    panelSecond.setBorder(bleu);
    panelglobal.add(panelSecond, gbcSecond);

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
    section21.setBorder(bleu);
    section21.setBackground(Color.white);
    section21.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // D�finir une marge vide autour du panneau

    //Récupération du nom du projet
    String nomProjet = ("Bienvenu sur votre espace de travail ") + espacedetravail.getProprietaire().getPseudo();

    //Création du JLabel pour afficher le nom du projet en grand au milieu
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

    // Création du conteneur pour les cartes
    JPanel section22 = new JPanel(new GridLayout(0, 4, 10, 10)); // GridLayout avec 4 colonnes et espacement de 10 pixels
    section22.setBackground(Color.white);

    // Ajout des cartes dans le conteneur
    for (ModeleProjet projet: espacedetravail.getProject()) {
      VuePetitProjet vuePetitProjet = new VuePetitProjet(projet);
      Dimension carteSize = new Dimension(200, 150); // Définir la taille des cartes souhaitée
      vuePetitProjet.setPreferredSize(carteSize);

      Border border1 = new LineBorder(Color.BLACK, 1); // Crée une bordure avec une ligne noire d'épaisseur 1
      vuePetitProjet.setBorder(border1);

      section22.add(vuePetitProjet);
    }
    VueAjoute vueAjouteProjet = new VueAjoute(null);
    vueAjouteProjet.setAlignmentX(Component.LEFT_ALIGNMENT);
    section22.add(vueAjouteProjet);

    // Création du JScrollPane avec le conteneur des cartes
    JScrollPane scrollPane = new JScrollPane(section22);
    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

    // Ajout du JScrollPane dans le panelSecond avec les contraintes
    panelSecond.add(scrollPane, gbcSection22);

   
    add(panelglobal);
    
  }
}