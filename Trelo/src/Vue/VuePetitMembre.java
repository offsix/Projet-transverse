package Vue;

import javax.swing.*;
import Modele.ModeleMembre;
import java.awt.*;

public class VuePetitMembre extends JPanel {	//Coder par Mathieu Flesch

    private static final long serialVersionUID = 1L;

    public VuePetitMembre(ModeleMembre membre) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        //Cr�ation de l'image
        /*ImageIcon imageIcon = new ImageIcon(membre.getImagePath());
        Image image = imageIcon.getImage();
        Image resizedImage = image.getScaledInstance(75, 75, Image.SCALE_SMOOTH);
        ImageIcon resizedImageIcon = new ImageIcon(resizedImage);
        JLabel imageLabel = new JLabel(resizedImageIcon);
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(imageLabel);
        */
        //Cr�ation du label pour le pr�nom du membre
        JLabel firstNameLabel = new JLabel(membre.getPrenom());
        firstNameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(firstNameLabel);

        //Cr�ation du label pour le nom du membre
        JLabel lastNameLabel = new JLabel(membre.getNom());
        lastNameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(lastNameLabel);
    }
}
