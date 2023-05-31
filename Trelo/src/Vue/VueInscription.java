package Vue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import Modele.ModeleInscription;

public class VueInscription extends JPanel {
    private JTextField identifiantField;
    private JPasswordField motDePasseField;
    private JTextField nomField;
    private JTextField prenomField;
    private JTextField adresseField;
    private JButton inscrireButton;

    public VueInscription() {
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
    //setter
    public void setIdentifiant(String identifiant) {
        identifiantField.setText(identifiant);
    }
    public void setMotDePasse(String motDePasse) {
        motDePasseField.setText(motDePasse);
    }
    public void setNom(String nom) {
        nomField.setText(nom);
    }
    public void setPrenom(String prenom) {
        prenomField.setText(prenom);
    }
    public void setAdresse(String adresse) {
        adresseField.setText(adresse);
    }


    public void ajouterListenerInscrire(ActionListener listener) {
        inscrireButton.addActionListener(listener);
    }

    public void afficherVide() {       
            motDePasseField.setText("");
            identifiantField.setText("");
            prenomField.setText("");
            nomField.setText("");
            adresseField.setText("");
            JOptionPane.showMessageDialog(this, "Veuillez saisir un identifiant et un mot de passe valides", "Erreur", JOptionPane.WARNING_MESSAGE);
        }

    public void afficherCorrect(){
        motDePasseField.setText("");
        identifiantField.setText("");
        prenomField.setText("");
        nomField.setText("");
        adresseField.setText("");
        JOptionPane.showMessageDialog(this, "Inscription reussie", "Succès", JOptionPane.INFORMATION_MESSAGE);
    }
    }