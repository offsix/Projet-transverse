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
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

public class VueProject extends JPanel { 
  private Font customFont;

  private static final long serialVersionUID = 1L;
  private JLabel logoAJoutProjet;
  private JLabel logoDeco;
  private JLabel logoMembre;

  public VueProject(ModeleProjet project) {
    MatteBorder vert = new MatteBorder(2, 2, 2, 2, Color.GREEN);
    MatteBorder bleu = new MatteBorder(2, 2, 2, 2, Color.BLUE);
    MatteBorder rose = new MatteBorder(2, 2, 2, 2, Color.PINK);
    MatteBorder jaune = new MatteBorder(2, 2, 2, 2, Color.YELLOW);
    MatteBorder rouge = new MatteBorder(2, 2, 2, 2, Color.RED);



    setLayout(new BorderLayout());
    JPanel panel = new JPanel(new GridBagLayout());
    panel.setPreferredSize(new Dimension(400, 300));




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
    panel.add(panelFirst, gbcbarrenav);

    
    //-----------------------------------------//
    //PANNEL LOGO
    //-----------------------------------------//

    ImageIcon logoIcon = new ImageIcon("Trelo/Image/profile.png");
    // Redimensionner l'image � une taille sp�cifique (par exemple, 50x50)
    Image scaledImage = logoIcon.getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH);
    ImageIcon scaledLogoIcon = new ImageIcon(scaledImage);
    logoMembre = new JLabel(scaledLogoIcon);
    logoMembre.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    JPanel section11 = new JPanel(new BorderLayout());
    section11.setBorder(new MatteBorder(0,0,0,3,Color.BLACK));

    


        
    ImageIcon logoIcon3 = new ImageIcon("Trelo/Image/door-open.png");
    //Redimensionner l'image � une taille sp�cifique (par exemple, 50x50)
    Image scaledImage3 = logoIcon3.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
    ImageIcon scaledLogoIcon3 = new ImageIcon(scaledImage3);
    logoDeco = new JLabel(scaledLogoIcon3);
    logoDeco.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    JPanel section123 = new JPanel(new BorderLayout());
    section123.setBorder(new MatteBorder(0,0,0,3,Color.BLACK));


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
    gbcSection11.weighty = 0.1;
    gbcSection11.fill = GridBagConstraints.BOTH;
    section11.add(logoMembre, BorderLayout.CENTER);
    panelFirst.add(section11, gbcSection11);


    gbcSection11.gridx = 0;
    gbcSection11.gridy = 2;
    gbcSection11.weightx = 1.0;
    gbcSection11.weighty = 1;
    gbcSection11.fill = GridBagConstraints.BOTH;
    section123.add(logoDeco, BorderLayout.SOUTH);
    panelFirst.add(section123, gbcSection11);



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
    // section21.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // D�finir une marge vide autour du panneau
    section21.setBorder(rouge);
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
JPanel headersec1 = new JPanel();

section1.setLayout(new BoxLayout(section1, BoxLayout.Y_AXIS)); // Utilisation d'un BoxLayout vertical
section1.setBackground(Color.BLUE);
// Titre de la section 1
JLabel titreSection1 = new JLabel("Section 1");
try {
  customFont = Font.createFont(Font.TRUETYPE_FONT, new File("Trelo/Fonts/BebasNeue-Regular.ttf"));
  titreSection1.setFont(customFont.deriveFont(Font.PLAIN, 30));
  
} catch (IOException | FontFormatException e) {
  e.printStackTrace();
}
JButton boutonSection1 = new JButton("Nouvelle carte");
headersec1.add(titreSection1);
headersec1.add(boutonSection1);
section1.add(headersec1);

ModeleCartes carte = new ModeleCartes();
VueCarte vueCarte = new VueCarte(carte);
ModeleCartes carte2 = new ModeleCartes();
VueCarte vueCarte2 = new VueCarte(carte2);
ModeleCartes carte3 = new ModeleCartes();
VueCarte vueCarte3 = new VueCarte(carte3);
section1.add(vueCarte);
section1.add(vueCarte2);
section1.add(vueCarte3);  // Ajouter la carte à la section 1


//VueAjoute vueAjouteCarte = new VueAjoute(null);
//vueAjouteCarte.setAlignmentX(Component.LEFT_ALIGNMENT);
//section1.add(vueAjouteCarte);

// Création du JScrollPane avec le conteneur de la section 1
JScrollPane scrollPane1 = new JScrollPane(section1);
scrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

// Définition de la taille de la section 1
scrollPane1.setPreferredSize(new Dimension(70, 500)); // Taille souhaitée de la section 1

// Ajout du JScrollPane dans la section 1
section22.add(scrollPane1);

// Section 2
JPanel section2 = new JPanel();
JPanel headersec2 = new JPanel();

section2.setLayout(new BoxLayout(section2, BoxLayout.Y_AXIS)); // Utilisation d'un BoxLayout vertical
section2.setBackground(Color.BLUE);
// Titre de la section 2
JLabel titreSection2 = new JLabel("Section 2");
try {
  customFont = Font.createFont(Font.TRUETYPE_FONT, new File("Trelo/Fonts/BebasNeue-Regular.ttf"));
  titreSection2.setFont(customFont.deriveFont(Font.PLAIN, 30));
  
} catch (IOException | FontFormatException e) {
  e.printStackTrace();
}
JButton boutonSection2 = new JButton("Nouvelle carte");
headersec2.add(titreSection2);
headersec2.add(boutonSection2);
section2.add(headersec2);

//VueAjoute vueAjouteCarte = new VueAjoute(null);
//vueAjouteCarte.setAlignmentX(Component.LEFT_ALIGNMENT);
//section2.add(vueAjouteCarte);

// Création du JScrollPane avec le conteneur de la section 2
JScrollPane scrollPane2 = new JScrollPane(section2);
scrollPane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

// Définition de la taille de la section 2
scrollPane2.setPreferredSize(new Dimension(70, 500)); // Taille souhaitée de la section 2

// Ajout du JScrollPane dans la section 2
section22.add(scrollPane2);

section2.add(vueCarte);
section2.add(vueCarte2);
section2.add(vueCarte3); 

// Section 3
JPanel section3 = new JPanel();
JPanel headersec3 = new JPanel();

section3.setLayout(new BoxLayout(section3, BoxLayout.Y_AXIS)); // Utilisation d'un BoxLayout vertical
section3.setBackground(Color.BLUE);
// Titre de la section 3
JLabel titreSection3 = new JLabel("Section 3");
try {
  customFont = Font.createFont(Font.TRUETYPE_FONT, new File("Trelo/Fonts/BebasNeue-Regular.ttf"));
  titreSection3.setFont(customFont.deriveFont(Font.PLAIN, 30));
  
} catch (IOException | FontFormatException e) {
  e.printStackTrace();
}
JButton boutonSection3 = new JButton("Nouvelle carte");
headersec3.add(titreSection3);
headersec3.add(boutonSection3);
section3.add(headersec3);

//VueAjoute vueAjouteCarte = new VueAjoute(null);
//vueAjouteCarte.setAlignmentX(Component.LEFT_ALIGNMENT);
//section3.add(vueAjouteCarte);

// Création du JScrollPane avec le conteneur de la section 3
JScrollPane scrollPane3 = new JScrollPane(section3);
scrollPane3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

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




    
// Ajout des cartes dans la section 1
// for (ModeleCartes carte : project.gettableauCarte()) {
//   VueCarte vueCarte = new VueCarte(carte);
//   vueCarte.setAlignmentX(Component.LEFT_ALIGNMENT); // Alignement à gauche

//   // Ajouter la carte à la section 1
//   section1.add(vueCarte);
// }


// // Ajout des cartes dans la section 1
// for (ModeleCartes carte : project.gettableauCarte()) {
//   VueCarte vueCarte = new VueCarte(carte);
//   vueCarte.setAlignmentX(Component.LEFT_ALIGNMENT); // Alignement à gauche

//   // Ajouter la carte à la section 1
//   section2.add(vueCarte);
// }


// // Ajout des cartes dans la section 1
// for (ModeleCartes carte : project.gettableauCarte()) {
//   VueCarte vueCarte = new VueCarte(carte);
//   vueCarte.setAlignmentX(Component.LEFT_ALIGNMENT); // Alignement à gauche

//   // Ajouter la carte à la section 1
//   section3.add(vueCarte);
//}
  }
}