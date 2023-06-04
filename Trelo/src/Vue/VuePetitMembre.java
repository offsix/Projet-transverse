package Vue;

import javax.swing.*;
import java.awt.*;

import Modele.ModeleMembre;

public class VuePetitMembre extends JPanel {
    private JLabel pseudoLabel;
    private JLabel nomLabel;
    private JLabel prenomLabel;
    private JLabel adresseMailLabel;

    /** @autor Mathieu Flesh **/

    public VuePetitMembre(ModeleMembre membre) {
        setLayout(new GridLayout(5, 2, 10, 10));
        setBackground(Color.WHITE);

        pseudoLabel = new JLabel("Pseudo:");
        nomLabel = new JLabel("Nom:");
        prenomLabel = new JLabel("Prénom:");
        adresseMailLabel = new JLabel("Addresse mail:");

        add(pseudoLabel);
        add(new JLabel(membre.getPseudo()));
        add(nomLabel);
        add(new JLabel(membre.getNom()));
        add(prenomLabel);
        add(new JLabel(membre.getPrenom()));
        add(adresseMailLabel);
        add(new JLabel(membre.getAdressemail()));
    }
}
