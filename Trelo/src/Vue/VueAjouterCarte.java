package Vue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import Modele.ModeleAjouterCarte;
import Modele.ModeleCartes;

public class VueAjouterCarte extends JPanel {
    private JTextField titreCarteField;
    private JTextField dateDebutCarteField;
    private JTextField descriptionCarteField;
    private JTextField dateLimiteCarteField;
    private JTextField statutCarteField;
    private JTextField couvertureCarteField;
    private JButton ajouterCarteButton;
    private int section;

    /** @autor Mathieu Flesh **/
    
    public VueAjouterCarte() {
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

        
        // Bouton Ajouter Carte
        ajouterCarteButton = new JButton("Ajouter Carte");
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridwidth = 2;
        add(ajouterCarteButton, gbc);
    }

    

    public String getTitreCarte() {
        return titreCarteField.getText();
    }

    public String getDateDebutCarte() {
    return dateDebutCarteField.getText();
    }
    public String getDateLimiteCarte() {
        return dateLimiteCarteField.getText();
    }

    public String getDescriptionCarte() {
        return descriptionCarteField.getText();
    }


    public String getStatutCarte() {
        return statutCarteField.getText();
    }

    public String getCouvertureCarte() {
        return couvertureCarteField.getText();
    }

    /**
     * Adds an ActionListener to the ajouterCarteButton component.
     *
     * @param  listener  the ActionListener to add
     */
    public void ajouterListenerAjouterCarte(ActionListener listener) {
        ajouterCarteButton.addActionListener(listener);
    }
    public void setSection(int section) {
    this.section = section;
    }
    public int getSection() {
    return section;
    }
}
