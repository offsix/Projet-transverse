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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.naming.NoPermissionException;
import javax.swing.Action;
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
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import Modele.ModeleEspacedetravail;
import Modele.ModeleProjet;

public class VueNvprojdansEDT extends JPanel {
    private JPanel wrapper;
    Font customFont;
    private JButton btnaccederauprojet;
    private ModeleProjet projet;
    public VueNvprojdansEDT(ModeleProjet projet) {
this.projet = projet;
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
    
        JLabel labelNomProjet1 = new JLabel(projet.getsNomProjet());
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
       JTextArea descProjet = new JTextArea(projet.getDescription());
       descProjet.setLineWrap(true);
       descProjet.setWrapStyleWord(true);
        btnaccederauprojet = new JButton("Acceder au projet");
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
        add (wrapper);


    }
    public void ajouterlisstenerouvrirproj(ActionListener listener) {
        btnaccederauprojet.addActionListener(listener);
      }
      public ModeleProjet getprojet()
   {
       return projet;
   }
}
