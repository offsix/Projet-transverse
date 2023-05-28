package Vue;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicBorders.FieldBorder;

import java.awt.*;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;

import Modele.ModeleInscription;

public class VueInscription extends JPanel {
    private JTextField identifiantField;
    private JPasswordField motDePasseField;
    private JTextField nomField;
    private JTextField prenomField;
    private JTextField adresseField;
    private JButton inscrireButton;

    public VueInscription(ModeleInscription inscription) {
        setLayout(new GridBagLayout());
        setBackground(Color.WHITE);
        setBorder(new EmptyBorder(10, 10, 10, 10));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);

        // Identifiant
        JLabel identifiantLabel = new JLabel("Identifiant:");
        identifiantField = new JTextField(15);
        add(identifiantLabel, gbc);
        gbc.gridy++;
        add(identifiantField, gbc);
        gbc.gridy++;

        // Mot de passe
        JLabel motDePasseLabel = new JLabel("Mot de passe:");
        motDePasseField = new JPasswordField(15);
        add(motDePasseLabel, gbc);
        gbc.gridy++;
        add(motDePasseField, gbc);
        gbc.gridy++;

        // Nom
        JLabel nomLabel = new JLabel("Nom:");
        nomField = new JTextField(15);
        add(nomLabel, gbc);
        gbc.gridy++;
        add(nomField, gbc);
        gbc.gridy++;

        // Prénom
        JLabel prenomLabel = new JLabel("Prénom:");
        prenomField = new JTextField(15);
        add(prenomLabel, gbc);
        gbc.gridy++;
        add(prenomField, gbc);
        gbc.gridy++;

        // Adresse
        JLabel adresseLabel = new JLabel("AdresseMail:");
        adresseField = new JTextField(15);
        add(adresseLabel, gbc);
        gbc.gridy++;
        add(adresseField, gbc);
        gbc.gridy++;

        // Bouton Inscrire
        inscrireButton = new JButton("S'inscrire");
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridwidth = 2;
        add(inscrireButton, gbc);
    }

    public String getIdentifiant() {
        return identifiantField.getText();
    }

    public String getMotDePasse() {
        return new String(motDePasseField.getPassword());
    }

    public String getNom() {
        return nomField.getText();
    }

    public String getPrenom() {
        return prenomField.getText();
    }

    public String getAdresse() {
        return adresseField.getText();
    }

    public void ajouterListenerInscrire(ActionListener listener) {
        inscrireButton.addActionListener(listener);
    }
}