package Vue;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import Modele.ModeleCartes;
import Modele.ModeleMembre;
import Modele.ModeleProjet;
import java.awt.*;

public class VueProject extends JPanel { //Coder par Mathieu Flesch

  private static final long serialVersionUID = 1L;

  public VueProject(ModeleProjet project) {
    setLayout(new BorderLayout());
    JPanel panel = new JPanel(new GridBagLayout());
    panel.setPreferredSize(new Dimension(400, 300));
    //-----------------------------------------//
    // 		        GBCFIRST 	 		  	   //
    //-----------------------------------------//
    GridBagConstraints gbcFirst = new GridBagConstraints();
    gbcFirst.gridx = 0;
    gbcFirst.gridy = 0;
    gbcFirst.weightx = 0.05;
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
    section11.setBackground(Color.white);

    // Chargement de l'image du logo
    ImageIcon logoIcon = new ImageIcon("Trelo/Image/logo.jpg");

    // Redimensionner l'image � une taille sp�cifique (par exemple, 50x50)
    Image scaledImage = logoIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
    ImageIcon scaledLogoIcon = new ImageIcon(scaledImage);
    JLabel logoLabel = new JLabel(scaledLogoIcon);

    section11.add(logoLabel, BorderLayout.CENTER);

    panelFirst.add(section11, gbcSection11);
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
    //     			GBCSECOND 	 		  	   //
    //-----------------------------------------//
    GridBagConstraints gbcSecond = new GridBagConstraints();
    gbcSecond.gridx = 1;
    gbcSecond.gridy = 0;
    gbcSecond.weightx = 0.70;
    gbcSecond.weighty = 1.0;
    gbcSecond.fill = GridBagConstraints.BOTH;

    JPanel panelSecond = new JPanel(new GridBagLayout());
    panelSecond.setBackground(Color.white);
    panelSecond.setBorder(border);
    panel.add(panelSecond, gbcSecond);
    //-----------------------------------------//
    //				GBCSECOND 2.1 	 		   //
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
    String nomProjet = project.getsNomProjet();

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
//             GBCSECOND 2.2                //
//-----------------------------------------//
GridBagConstraints gbcSection22 = new GridBagConstraints();
gbcSection22.gridx = 0;
gbcSection22.gridy = 1;
gbcSection22.weightx = 1.0;
gbcSection22.weighty = 0.6;
gbcSection22.fill = GridBagConstraints.BOTH;

// Création du conteneur pour les sections
JPanel section22 = new JPanel(new GridLayout(1, 3, 10, 10)); // GridLayout avec 1 ligne et 3 colonnes
section22.setBackground(Color.white);

// Section 1
JPanel section1 = new JPanel();
section1.setLayout(new BoxLayout(section1, BoxLayout.Y_AXIS)); // Utilisation d'un BoxLayout vertical

// Titre de la section 1
JLabel titreSection1 = new JLabel("Section 1");
titreSection1.setHorizontalAlignment(SwingConstants.CENTER);
section1.add(titreSection1);

// Ajout des cartes dans la section 1
for (ModeleCartes carte : project.gettableauCarte()) {
    VueCarte vueCarte = new VueCarte(carte);
    vueCarte.setAlignmentX(Component.LEFT_ALIGNMENT); // Alignement à gauche

    // Ajouter la carte à la section 1
    section1.add(vueCarte);
}

//VueAjoute vueAjouteCarte = new VueAjoute(null);
//vueAjouteCarte.setAlignmentX(Component.LEFT_ALIGNMENT);
//section1.add(vueAjouteCarte);

// Création du JScrollPane avec le conteneur de la section 1
JScrollPane scrollPane1 = new JScrollPane(section1);
scrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

// Définition de la taille de la section 1
scrollPane1.setPreferredSize(new Dimension(70, 500)); // Taille souhaitée de la section 1

// Ajout du JScrollPane dans la section 1
section22.add(scrollPane1);

// Section 2
JPanel section2 = new JPanel();
section2.setBackground(Color.white);

// Titre de la section 2
JLabel titreSection2 = new JLabel("Section 2");
titreSection2.setHorizontalAlignment(SwingConstants.CENTER);
section2.add(titreSection2);

// Création du JScrollPane avec la section 2 (sans barre de défilement)
JScrollPane scrollPane2 = new JScrollPane(section2);
scrollPane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
scrollPane2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

// Définition de la taille de la section 2
scrollPane2.setPreferredSize(new Dimension(70, 500)); // Taille souhaitée de la section 2

// Ajout du JScrollPane dans la section 2
section22.add(scrollPane2);

// Section 3
JPanel section3 = new JPanel();
section3.setBackground(Color.white);

// Titre de la section 3
JLabel titreSection3 = new JLabel("Section 3");
titreSection3.setHorizontalAlignment(SwingConstants.CENTER);
section3.add(titreSection3);

// Création du JScrollPane avec la section 3 (sans barre de défilement)
JScrollPane scrollPane3 = new JScrollPane(section3);
scrollPane3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
scrollPane3.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

// Définition de la taille de la section 3
scrollPane3.setPreferredSize(new Dimension(70, 500)); // Taille souhaitée de la section 3

// Ajout du JScrollPane dans la section 3
section22.add(scrollPane3);

// Ajout de la section 2.2 dans le panelSecond avec les contraintes
panelSecond.add(section22, gbcSection22);


    //-----------------------------------------//
    //				GBCTHIRD 	 		  	   //
    //-----------------------------------------//
    GridBagConstraints gbcThird = new GridBagConstraints();
    gbcThird.gridx = 2;
    gbcThird.gridy = 0;
    gbcThird.weightx = 0.17;
    gbcThird.weighty = 1.0;
    gbcThird.fill = GridBagConstraints.BOTH;

    JPanel panelThird = new JPanel(new GridLayout(2, 1));
    panelThird.setBackground(Color.white);
    panel.add(panelThird, gbcThird);
    //-----------------------------------------//
    //				GBCTHIRD 3.1 	 		   //
    //-----------------------------------------//
    JPanel gbcSection31 = new JPanel(new GridLayout(0, 1, 10, 10)); //GridLayout avec 1 colonne et espacement de 10 pixels
    gbcSection31.setBackground(Color.white);

    int membresParLigne = 2; //D�fini le nombre de membres par ligne
    int count = 0;
    JPanel lignePanel = null;

    for (ModeleMembre membre: project.getTableauMembres()) {
      if (count % membresParLigne == 0) {
        lignePanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        lignePanel.setBorder(new EmptyBorder(0, 0, 0, 0)); //Ajoute une marge vide autour du panel
        gbcSection31.add(lignePanel);
      }

      //VueAjoute vueAjouteMembre = new VueAjoute(null);
      //vueAjouteMembre.setAlignmentX(Component.LEFT_ALIGNMENT);
      //gbcSection31.add(vueAjouteMembre);

      VuePetitMembre vueMembre = new VuePetitMembre(membre);
      Dimension smallerSize = new Dimension(120, 120);
      vueMembre.setPreferredSize(smallerSize);

      Border border1 = new LineBorder(Color.BLACK, 1); //Cr�e une bordure avec une ligne noire d'�paisseur 1
      vueMembre.setBorder(border1);

      lignePanel.add(vueMembre);

      count++;
    }
    //Cr�ation du JScrollPane avec la sous-section des membres
    JScrollPane scrollPane31 = new JScrollPane(gbcSection31);
    scrollPane31.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

    //Ajout du JScrollPane dans la premi�re sous-section
    panelThird.add(scrollPane31);
    //-----------------------------------------//
    //				GBCTHIRD 3.2 	 		               //
    //-----------------------------------------//
    JPanel gbcSection32 = new JPanel();
    gbcSection32.setBackground(Color.white);
    panelThird.add(gbcSection32);

    add(panel, BorderLayout.CENTER);
    setVisible(true);
  }
}