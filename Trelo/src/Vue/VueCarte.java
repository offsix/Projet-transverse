package Vue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import java.awt.*;
import Modele.ModeleCartes;
import javafx.scene.layout.Border;

import java.time.format.DateTimeFormatter;

public class VueCarte extends JPanel { 

    private static final long serialVersionUID = 1L;
    private static final Font LABEL_FONT = new Font(Font.SANS_SERIF, Font.PLAIN, 20);
    private static final int BUTTON_SIZE = 13;

    public VueCarte(ModeleCartes modele) {
        // Récupération des informations de la carte depuis le modèle
        String titre = modele.getTitreCarte();
        String description = modele.getDescriptionCarte();
        String statut = modele.getStatutCarte();
        String dateFin = modele.getDateLimiteCarte();

        // Construction du texte à afficher dans la carte
        String labelText = "<html><body>" +
                "<p style='text-align: center'>" +
                "Titre: " + titre +
                "<br>Description: " + description +
                "<br>Statut: " + statut +
                "<br>Date de fin: " + dateFin +
                "</p></body></html>";

        // Création du JLabel pour afficher le texte de la carte
        JLabel affichageCarte = new JLabel(labelText);
        setBackground(Color.WHITE);
        affichageCarte.setFont(LABEL_FONT);
        affichageCarte.setHorizontalAlignment(SwingConstants.CENTER);
        affichageCarte.setBorder(new EmptyBorder(30, 30, 30, 30));
        // Récupération de la couleur de fond de la carte depuis le modèle

        // Configuration du panneau de la carte
        // Création du bouton de suppression
        JButton boutonSupprimer = new JButton("Supprimer");
        boutonSupprimer.setPreferredSize(new Dimension(BUTTON_SIZE, BUTTON_SIZE));

        // Configuration du layout du panneau de la carte
        setLayout(new BorderLayout());
        add(affichageCarte, BorderLayout.CENTER);

        // Création d'un panneau pour les trois petits points
        JPanel panneauTroisPoints = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panneauTroisPoints.setOpaque(false);

        // Création du bouton des trois petits points
        JButton boutonTroisPoints = new JButton("...");
        boutonTroisPoints.setPreferredSize(new Dimension(BUTTON_SIZE, BUTTON_SIZE));

        // Ajout du bouton des trois petits points dans le panneau
        panneauTroisPoints.add(boutonTroisPoints);

        // Ajout du panneau des trois petits points dans le panneau principal
        add(panneauTroisPoints, BorderLayout.SOUTH);

        // Ajout d'un écouteur d'événements au bouton des trois petits points
        boutonTroisPoints.addActionListener(e -> afficherMenuTroisChoix());
    }

    private void afficherMenuTroisChoix() {
        // Créer et afficher le menu des trois choix
        JPopupMenu menu = new JPopupMenu();

        JMenuItem choix1 = new JMenuItem("Choix 1");
        JMenuItem choix2 = new JMenuItem("Choix 2");
        JMenuItem choix3 = new JMenuItem("Choix 3");

        menu.add(choix1);
        menu.add(choix2);
        menu.add(choix3);

        menu.show(this, getWidth() - BUTTON_SIZE, getHeight() - BUTTON_SIZE);
    }
}
