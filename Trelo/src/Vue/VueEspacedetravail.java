package Vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.List;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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
  private JLabel logoAJoutProjet;
  private ModeleEspacedetravail modeleEspacedetravail;
  
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

    ImageIcon logoIcon = new ImageIcon("Trelo/Image/profile.png");
    // Redimensionner l'image � une taille sp�cifique (par exemple, 50x50)
    Image scaledImage = logoIcon.getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH);
    ImageIcon scaledLogoIcon = new ImageIcon(scaledImage);
    JLabel logoLabel = new JLabel(scaledLogoIcon);
    JPanel section11 = new JPanel(new BorderLayout());

    
    ImageIcon logoIcon2 = new ImageIcon("Trelo/Image/plus-document.png"); 
    //Redimensionner l'image � une taille sp�cifique (par exemple, 50x50)
    Image scaledImage2 = logoIcon2.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
    ImageIcon scaledLogoIcon2 = new ImageIcon(scaledImage2);
     logoAJoutProjet = new JLabel(scaledLogoIcon2);
     logoAJoutProjet.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    JPanel section122 = new JPanel(new BorderLayout());
    JLabel label2 = new JLabel("Creer un nouveau projet");
    label2.setHorizontalAlignment(SwingConstants.CENTER);


        
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
    gbcSection11.weighty = 0.1;
    gbcSection11.fill = GridBagConstraints.BOTH;
    section11.add(logoLabel, BorderLayout.CENTER);
    panelFirst.add(section11, gbcSection11);

    gbcSection11.gridx = 0;
    gbcSection11.gridy = 1;
    gbcSection11.weightx = 1.0;
    gbcSection11.weighty = 0;
    gbcSection11.fill = GridBagConstraints.BOTH;
    section122.add(logoAJoutProjet, BorderLayout.CENTER);
    section122.add(label2, BorderLayout.SOUTH);
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

    
    JPanel panelSecond = new JPanel(new GridBagLayout());
    panelSecond.setBackground(Color.white);
    panelSecond.setBorder(bleu);
 

    GridBagConstraints gbcSecond = new GridBagConstraints();
    gbcSecond.gridx = 1;
    gbcSecond.gridy = 0;
    gbcSecond.weightx = 0.9;
    gbcSecond.weighty = 1.0;
    gbcSecond.fill = GridBagConstraints.BOTH;
    panelglobal.add(panelSecond, gbcSecond);

     JLabel labelNomProjet = new JLabel(("Bienvenu sur votre espace de travail ") + espacedetravail.getProprietaire().getPseudo());
    labelNomProjet.setFont(new Font("Arial", Font.BOLD, 34));
    labelNomProjet.setHorizontalAlignment(SwingConstants.CENTER);




    JPanel section21 = new JPanel(new GridLayout(2, 0));
    section21.setBorder(bleu);
   

   


    GridBagConstraints gbctitleform = new GridBagConstraints();
    gbctitleform.gridx = 0;
    gbctitleform.gridy = 0;
    gbctitleform.weightx = 1.0;
    gbctitleform.weighty = 0.10;
    gbctitleform.fill = GridBagConstraints.BOTH;
    panelSecond.add(labelNomProjet, gbctitleform);

    gbctitleform.gridx = 0;
    gbctitleform.gridy = 1;
    gbctitleform.weightx = 1.0;
    gbctitleform.weighty = 0.90;
    gbctitleform.fill = GridBagConstraints.BOTH;
    panelSecond.add(section21, gbctitleform);



    //-----------------------------------------//
    // GBCSECOND 2.1 //
    //-----------------------------------------//
    
    //Récupération du nom du projet
    //Création du JLabel pour afficher le nom du projet en grand au milieu
   

    

    


    

    // Création du conteneur pour les cartes
  
   
    add(panelglobal);



    
  }
  public void ajouterlisstenerNouveauprojet(MouseAdapter listener) {
    logoAJoutProjet.addMouseListener(listener);
}


}