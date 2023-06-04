package Vue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class VueCreerProjet extends JPanel {
    private JTextField titleTextField;
    private JTextField image;
    private JTextArea description;
    private JButton CreerProjet;
    private BufferedImage imageFile;

    public VueCreerProjet() {
        setLayout(new GridBagLayout());
        setBackground(Color.WHITE);
        setBorder(new EmptyBorder(10, 10, 10, 10));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);

        // Titre
        JLabel TitreLabel = new JLabel("Titre du Projet:");
        titleTextField = new JTextField(25);
        add(TitreLabel, gbc);
        gbc.gridy++;
        add(titleTextField, gbc);
        gbc.gridy++;

    
        // Description
        
        JLabel DescriptionLabel = new JLabel("Description:");
        description = new JTextArea(15, 15);
        description.setLineWrap(true);
        description.setWrapStyleWord(true);
        description.setPreferredSize(new Dimension(300, 100));
        description.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        


        add(DescriptionLabel, gbc);
        gbc.gridy++;
        add(description, gbc);
        gbc.gridy++;

        // Bouton Inscrire
        CreerProjet = new JButton("Creer Projet");
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridwidth = 2;
        add(CreerProjet, gbc);
       

}
        public String getImage() { return image.getText();}
         public String getTitle() { return titleTextField.getText();}
         public String getDescription() { return description.getText();}


        /**
        * Adds a listener to the "CreerProjet" button, which triggers the 
        * specified action when the button is clicked.
        *
        * @param  listener  the ActionListener to be added
        */ 
         public void ajouterListenerAjouterProjet(ActionListener listener) {
            CreerProjet.addActionListener(listener);
        }
}