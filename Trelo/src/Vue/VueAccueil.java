package Vue;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicBorders.FieldBorder;

import java.awt.*;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import java.util.concurrent.Future;

import Modele.ModeleAccueil;

public class VueAccueil extends JFrame {
    private JTextField identifiantField;
    private JPasswordField motDePasseField;
    private JButton seConnecterButton;
    
	public VueAccueil(ModeleAccueil accueil) {
        // Configuration de la fen�tre
        setIconImage(new ImageIcon("Trelo/Image/testlogo.png").getImage());
        setTitle("Bienvenue");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Configuration du layout
        JPanel glop = new JPanel();
        JPanel gloid = new JPanel();
        gloid.setLayout(new GridLayout(1, 1));
        gloid.setBorder(new EmptyBorder(100, 100, 100, 100));
        
        glop.setLayout(new GridLayout(1, 2));        
        glop.add(new JLabel(new ImageIcon("Trelo/Image/forme.png")));
        

        // Cr�ation des composants
        JLabel identifiantLabel = new JLabel("Identifiant:");
        JLabel motDePasseLabel = new JLabel("Mot de passe:");
        JLabel phraseLabel = new JLabel("Vous n'avez pas de compte ? - ");
        JLabel sInscrireLabel = new JLabel("S'inscrire");
        identifiantField = new JTextField(10);
        motDePasseField = new JPasswordField(10);
        seConnecterButton = new JButton("Se connecter");

   
       

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
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

        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(30, 125, 0, 0);
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(sInscrireLabel, gbc);
                
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(30, -120, 0, 0);
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(phraseLabel, gbc);

        // Configuration du style
        panel.setBackground(Color.WHITE);
        Border fieldBorder = BorderFactory.createLineBorder(Color.BLACK, 1);
        panel.setBorder(fieldBorder);
        identifiantField.setBorder(fieldBorder);
        motDePasseField.setBorder(fieldBorder);
        identifiantLabel.setFont(new Font("Arial", Font.BOLD, 14));
        motDePasseLabel.setFont(new Font("Arial", Font.BOLD, 14));
        seConnecterButton.setFont(new Font("Arial", Font.BOLD, 16));
        seConnecterButton.setBackground(new Color(52, 152, 219));
        seConnecterButton.setForeground(Color.WHITE);
        
        sInscrireLabel.setFont(new Font("Arial", Font.BOLD, 16));
        sInscrireLabel.setForeground(new Color(52, 152, 219));
        sInscrireLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        sInscrireLabel.setFont(new Font("Arial", Font.BOLD, 16));
        sInscrireLabel.setForeground(new Color(52, 152, 219));
        sInscrireLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        // Section en haut pour le titre
        JPanel titrePanel = new JPanel();
        ImageIcon future = new ImageIcon(new ImageIcon("Trelo/Image/futuretexte.png").getImage().getScaledInstance(120, 50, Image.SCALE_DEFAULT));
        JLabel texteFuture = new JLabel(future);
        titrePanel.add(texteFuture,CENTER_ALIGNMENT);
        titrePanel.setBackground(Color.WHITE);
       
        add(titrePanel, BorderLayout.NORTH);
        add(glop);
        glop.add(gloid);
        gloid.add(panel);
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
        JOptionPane.showMessageDialog(this, "Votre mot de passe ou votre identifiant est incorrect", "Erreur", JOptionPane.ERROR_MESSAGE);
    }
    public void ajouterListenerSeConnecter(ActionListener listener) {
        seConnecterButton.addActionListener(listener);
    }

    public void afficherMessageBienvenue() {
        JOptionPane.showMessageDialog(this, "Bienvenue sur Trelo", "Bienvenue", JOptionPane.INFORMATION_MESSAGE);
    }
    public void afficherVide() {
        if(motDePasseField.getText().isEmpty() || identifiantField.getText().isEmpty()) {
            motDePasseField.setText("");
            identifiantField.setText("");
            JOptionPane.showMessageDialog(this, "Veuillez saisir un identifiant et un mot de passe valides", "Erreur", JOptionPane.WARNING_MESSAGE);
        }
    }
}

