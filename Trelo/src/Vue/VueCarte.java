package Vue;

import javax.swing.*;
import java.awt.*;
import Modele.ModeleCartes;
import java.time.format.DateTimeFormatter;

public class VueCarte extends JPanel {	//Coder par Mathieu Flesch

    private static final long serialVersionUID = 1L;
    private static final Font LABEL_FONT = new Font(Font.SANS_SERIF, Font.PLAIN, 20);
    private static final int BUTTON_SIZE = 13;

    public VueCarte(ModeleCartes modele) {
        //R�cup�ration des informations de la carte depuis le mod�le
        String titre = modele.getTitreCarte();
        String description = modele.getDescriptionCarte();
        String statut = modele.getStatutCarte();
        String dateFin = modele.getDateLimiteCarte().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        //Construction du texte � afficher dans la carte
        String labelText = "<html><body>" +
                "<p style='text-align: center'>" +
                "Titre: " + titre +
                "<br>Description: " + description +
                "<br>Statut: " + statut +
                "<br>Date de fin: " + dateFin +
                "</p></body></html>";

        //Cr�ation du JLabel pour afficher le texte de la carte
        JLabel affichageCarte = new JLabel(labelText);
        affichageCarte.setFont(LABEL_FONT);
        affichageCarte.setHorizontalAlignment(SwingConstants.CENTER);

        //R�cup�ration de la couleur de fond de la carte depuis le mod�le
        Color couleurFond = modele.getCouvertureCarteColor();

        //Configuration du panneau de la carte
        setOpaque(true);
        setBackground(couleurFond);

        //Cr�ation du bouton de suppression
        JButton boutton = new JButton("Supprimer");
        boutton.setPreferredSize(new Dimension(BUTTON_SIZE, BUTTON_SIZE));

        //Configuration du layout du panneau de la carte
        setLayout(new BorderLayout());
        add(affichageCarte, BorderLayout.CENTER);
        add(boutton, BorderLayout.NORTH);

    }
}
