package Vue;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;

import Modele.ModeleAccueil;

public class VueAccueil extends JFrame {
    private JTextField identifiantField;
    private JPasswordField motDePasseField;
    private JButton seConnecterButton;
    
	public VueAccueil(ModeleAccueil accueil) {
        // Configuration de la fen�tre
        setTitle("Accueil");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        // Cr�ation des composants
        JLabel identifiantLabel = new JLabel("Identifiant:");
        JLabel motDePasseLabel = new JLabel("Mot de passe:");
        identifiantField = new JTextField(10);
        motDePasseField = new JPasswordField(10);
        seConnecterButton = new JButton("Se connecter");

        // Configuration du layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(10, 10, 10, 10);
        panel.add(identifiantLabel, gbc);

        gbc.gridy = 1;
        panel.add(identifiantField, gbc);

        gbc.gridy = 2;
        panel.add(motDePasseLabel, gbc);

        gbc.gridy = 3;
        panel.add(motDePasseField, gbc);

        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(seConnecterButton, gbc);

        // Configuration du style
        panel.setBackground(new Color(240, 240, 240));
        Border fieldBorder = BorderFactory.createLineBorder(Color.BLACK, 1);
        identifiantField.setBorder(fieldBorder);
        motDePasseField.setBorder(fieldBorder);
        identifiantLabel.setFont(new Font("Arial", Font.BOLD, 14));
        motDePasseLabel.setFont(new Font("Arial", Font.BOLD, 14));
        seConnecterButton.setFont(new Font("Arial", Font.BOLD, 16));
        seConnecterButton.setBackground(new Color(52, 152, 219));
        seConnecterButton.setForeground(Color.WHITE);

        // Chargement de l'image
        String cheminImage = "C:\\Users\\abdoulaye\\OneDrive\\Bureau\\Projet\\Projet-transverse\\Trelo\\Image\\logo.jpg";
        ImageIcon logoIcon = new ImageIcon(cheminImage);
        JLabel logoLabel = new JLabel(logoIcon);

        // Cr�ation du titre "Trelo"
        JLabel titreLabel = new JLabel("Trello Lite+");
        titreLabel.setFont(new Font("Arial", Font.BOLD, 24));

        // Configuration de la fen�tre
        getContentPane().setBackground(Color.WHITE);
        setLayout(new BorderLayout());

        // Section � gauche pour le logo
        JPanel logoPanel = new JPanel();
        logoPanel.setBackground(Color.WHITE);
        logoPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        logoPanel.add(logoLabel);
        add(logoPanel, BorderLayout.WEST);

        // Section en haut pour le titre
        JPanel titrePanel = new JPanel();
        titrePanel.setBackground(Color.WHITE);
        titrePanel.add(titreLabel);
        add(titrePanel, BorderLayout.NORTH);

        add(panel, BorderLayout.CENTER);
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Affichage en plein �cran
        setVisible(true);
    }

    public String getIdentifiant() {
        return identifiantField.getText();
    }

    public String getMotDePasse() {
        return new String(motDePasseField.getPassword());
    }

    public void afficherMessageErreur() {
        JOptionPane.showMessageDialog(this, "Votre mot de passe ou votre identifiant est incorrect", "Erreur", JOptionPane.INFORMATION_MESSAGE);
    }
    public void ajouterListenerSeConnecter(ActionListener listener) {
        seConnecterButton.addActionListener(listener);
    }

    public void afficherMessageBienvenue() {
        JOptionPane.showMessageDialog(this, "Bienvenue sur Trelo", "Bienvenue", JOptionPane.INFORMATION_MESSAGE);
    }
    
}

