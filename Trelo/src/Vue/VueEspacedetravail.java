package Vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.List;
import java.awt.event.MouseAdapter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.naming.NoPermissionException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import Modele.ModeleEspacedetravail;
import Modele.ModeleProjet;

public class VueEspacedetravail extends JPanel { 
  private JLabel logoAJoutProjet;
  private JLabel logoDeco;
  private JLabel logoMembre;
  private ModeleEspacedetravail modeleEspacedetravail;
  private Font customFont;
  private JPanel mainproj;
  private JPanel wrapper;

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
    panelglobal.add(panelFirst, gbcbarrenav);

    
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

    
    ImageIcon logoIcon2 = new ImageIcon("Trelo/Image/plus-document.png"); 
    //Redimensionner l'image � une taille sp�cifique (par exemple, 50x50)
    Image scaledImage2 = logoIcon2.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
    ImageIcon scaledLogoIcon2 = new ImageIcon(scaledImage2);
     logoAJoutProjet = new JLabel(scaledLogoIcon2);
     logoAJoutProjet.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    JPanel section122 = new JPanel(new BorderLayout());
    JLabel label2 = new JLabel("Creer un nouveau projet");
    label2.setHorizontalAlignment(SwingConstants.CENTER);
    section122.setBorder(new MatteBorder(0,0,0,3,Color.BLACK));


        
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
    section123.add(logoDeco, BorderLayout.SOUTH);
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
 

    GridBagConstraints gbcSecond = new GridBagConstraints();
    gbcSecond.gridx = 1;
    gbcSecond.gridy = 0;
    gbcSecond.weightx = 0.9;
    gbcSecond.weighty = 1.0;
    gbcSecond.fill = GridBagConstraints.BOTH;
    panelglobal.add(panelSecond, gbcSecond);

     JLabel labelNomProjet = new JLabel(("Bienvenu sur votre espace de travail ") + espacedetravail.getProprietaire().getPseudo());
     labelNomProjet.setBorder(new MatteBorder(0,0,3,0,Color.BLACK));

     try {
         customFont = Font.createFont(Font.TRUETYPE_FONT, new File("Trelo/Fonts/BebasNeue-Regular.ttf"));
         labelNomProjet.setFont(customFont.deriveFont(Font.PLAIN, 60));
         
     } catch (IOException | FontFormatException e) {
         e.printStackTrace();
     }
     
    labelNomProjet.setHorizontalAlignment(SwingConstants.CENTER);



     mainproj = new JPanel(new GridLayout(0,4,20,0));


   


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
    panelSecond.add(mainproj, gbctitleform);


  
  
   
    add(panelglobal);



    
  }
  public void ajoutProjet (String Nomprojet,String Description){   
    wrapper = new JPanel(new GridLayout(1, 1));

    JPanel pangennewproj = new JPanel(new GridBagLayout());
    wrapper.setBorder(new EmptyBorder(50,50,175,50));
    wrapper.add(pangennewproj);
    JPanel nomProjet = new JPanel(new GridLayout(1,2));
    pangennewproj.setBorder(new MatteBorder(3,3,3,3,Color.BLACK));
    nomProjet.setBorder(new EmptyBorder(10, 20, 10, 20));

    ImageIcon logoproj = new ImageIcon("Trelo/Image/plus-document.png"); 
   //Redimensionner l'image � une taille sp�cifique (par exemple, 50x50)
   Image scaledlogoproj = logoproj.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
   ImageIcon scaledlogoprojt = new ImageIcon(scaledlogoproj);
   JLabel Iconeprojet = new JLabel(scaledlogoprojt);

    JLabel labelNomProjet1 = new JLabel(Nomprojet);
    try {
     customFont = Font.createFont(Font.TRUETYPE_FONT, new File("Trelo/Fonts/BebasNeue-Regular.ttf"));
     labelNomProjet1.setFont(customFont.deriveFont(Font.PLAIN, 30));
     
   } catch (IOException | FontFormatException e) {
     e.printStackTrace();
   }

    labelNomProjet1.setHorizontalAlignment(SwingConstants.CENTER);

   nomProjet.setBackground(Color.WHITE);
   nomProjet.add(Iconeprojet);
    nomProjet.add(labelNomProjet1);

   JPanel pannelinfoprojet = new JPanel(new GridBagLayout());
   JLabel labeldesc = new JLabel("Description du projet : ");
   try {
     customFont = Font.createFont(Font.TRUETYPE_FONT, new File("Trelo/Fonts/BebasNeue-Regular.ttf"));
     labeldesc.setFont(customFont.deriveFont(Font.PLAIN, 30));
     
 } catch (IOException | FontFormatException e) {
     e.printStackTrace();
 }
 labeldesc.setHorizontalAlignment(SwingConstants.CENTER);
   JTextArea descProjet = new JTextArea(Description);
   JButton btnaccederauprojet = new JButton("Acceder au projet");
   try {
     customFont = Font.createFont(Font.TRUETYPE_FONT, new File("Trelo/Fonts/BebasNeue-Regular.ttf"));
     btnaccederauprojet.setFont(customFont.deriveFont(Font.PLAIN, 30));
     
 } catch (IOException | FontFormatException e) {
     e.printStackTrace();
 }
   btnaccederauprojet.setBackground(Color.BLACK);
   btnaccederauprojet.setForeground(Color.WHITE);
   btnaccederauprojet.setBorder(new MatteBorder(10,20,10,10,Color.BLACK));
   btnaccederauprojet.setFocusPainted(getFocusTraversalKeysEnabled());

   GridBagConstraints gbcinfopart = new GridBagConstraints();
   gbcinfopart.gridx = 0;
   gbcinfopart.gridy = 0;
   gbcinfopart.weightx = 1.0;
   gbcinfopart.weighty = 0.05;
   gbcinfopart.fill = GridBagConstraints.BOTH;
   pannelinfoprojet.add(labeldesc, gbcinfopart);

   gbcinfopart.gridx = 0;
   gbcinfopart.gridy = 1;
   gbcinfopart.weightx = 1.0;
   gbcinfopart.weighty = 1;
   gbcinfopart.fill = GridBagConstraints.BOTH;
   pannelinfoprojet.add(descProjet, gbcinfopart);

   gbcinfopart.gridx = 0;
   gbcinfopart.gridy = 2;
   gbcinfopart.weightx = 1.0;
   gbcinfopart.weighty = 0.05;
   pannelinfoprojet.add(btnaccederauprojet, gbcinfopart);

    pannelinfoprojet.setBorder(new MatteBorder(3, 0,0,0,Color.BLACK));
    pannelinfoprojet.setBackground(Color.WHITE);


    GridBagConstraints gbcnouveauprojet = new GridBagConstraints();
   gbcnouveauprojet.gridx = 0;
   gbcnouveauprojet.gridy = 0;
   gbcnouveauprojet.weightx = 1.0;
   gbcnouveauprojet.weighty = 0.05;
   gbcnouveauprojet.fill = GridBagConstraints.BOTH;
   pangennewproj.add(nomProjet, gbcnouveauprojet);

 gbcnouveauprojet.gridx = 0;
   gbcnouveauprojet.gridy = 1;
   gbcnouveauprojet.weightx = 1.0;
   gbcnouveauprojet.weighty = 1;
   gbcnouveauprojet.fill = GridBagConstraints.BOTH;
   pangennewproj.add(pannelinfoprojet, gbcnouveauprojet);
   mainproj.add(wrapper);
  revalidate();
  }


  public void ajouterlisstenerNouveauprojet(MouseAdapter listener) {
    logoAJoutProjet.addMouseListener(listener);
}
  public void ajouterlisstenerDeconexion(MouseAdapter listener) {
  logoDeco.addMouseListener(listener);
  }
  public void ajouterlisstenerMembre(MouseAdapter listener) {
  logoMembre.addMouseListener(listener);
  }

}