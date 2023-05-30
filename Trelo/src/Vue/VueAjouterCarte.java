package Vue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import Modele.ModeleAjouterCarte;

public class VueAjouterCarte extends JPanel {
    private JTextField titreCarteField;
    private JTextField dateDebutCarteField;
    private JTextField descriptionCarteField;
    private JTextField dateLimiteCarteField;
    private JTextField statutCarteField;
    private JTextField couvertureCarteField;
    private JButton ajouterCarteButton;

    public VueAjouterCarte(ModeleAjouterCarte ajoutCarte) {
        setLayout(new GridBagLayout());
        setBackground(Color.WHITE);
        setBorder(new EmptyBorder(10, 10, 10, 10));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);

        // Titre de la carte
        JLabel titreCarteLabel = new JLabel("Titre de la carte:");
        titreCarteField = new JTextField(15);
        add(titreCarteLabel, gbc);
        gbc.gridy++;
        add(titreCarteField, gbc);
        gbc.gridy++;

        // Date de début de la carte
        JLabel dateDebutCarteLabel = new JLabel("Date de début:");
        dateDebutCarteField = new JTextField(15);
        add(dateDebutCarteLabel, gbc);
        gbc.gridy++;
        add(dateDebutCarteField, gbc);
        gbc.gridy++;

        // Description de la carte
        JLabel descriptionCarteLabel = new JLabel("Description:");
        descriptionCarteField = new JTextField(15);
        add(descriptionCarteLabel, gbc);
        gbc.gridy++;
        add(descriptionCarteField, gbc);
        gbc.gridy++;

        // Date limite de la carte
        JLabel dateLimiteCarteLabel = new JLabel("Date limite:");
        dateLimiteCarteField = new JTextField(15);
        add(dateLimiteCarteLabel, gbc);
        gbc.gridy++;
        add(dateLimiteCarteField, gbc);
        gbc.gridy++;

        // Statut de la carte
        JLabel statutCarteLabel = new JLabel("Statut:");
        statutCarteField = new JTextField(15);
        add(statutCarteLabel, gbc);
        gbc.gridy++;
        add(statutCarteField, gbc);
        gbc.gridy++;

        // Couverture de la carte
        JLabel couvertureCarteLabel = new JLabel("Couverture:");
        couvertureCarteField = new JTextField(15);
        add(couvertureCarteLabel, gbc);
        gbc.gridy++;
        add(couvertureCarteField, gbc);
        gbc.gridy++;

        // Bouton Ajouter Carte
        ajouterCarteButton = new JButton("Ajouter Carte");
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridwidth = 2;
        add(ajouterCarteButton, gbc);
    }

    

    public String getTitreCarte() {
        return titreCarteField.getText();
    }

    public LocalDate getDateDebutCarte() {
        String dateDebutText = dateDebutCarteField.getText();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(dateDebutText, formatter);
    }

    public String getDescriptionCarte() {
        return descriptionCarteField.getText();
    }

    public LocalDate getDateLimiteCarte() {
        String dateLimiteText = dateLimiteCarteField.getText();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(dateLimiteText, formatter);
    }

    public String getStatutCarte() {
        return statutCarteField.getText();
    }

    public String getCouvertureCarte() {
        return couvertureCarteField.getText();
    }

    public void ajouterListenerAjouterCarte(ActionListener listener) {
        ajouterCarteButton.addActionListener(listener);
    }
}
