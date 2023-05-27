package Vue;

import javax.swing.*;
import java.awt.*;
import Modele.ModeleCalendrier;
import java.time.format.DateTimeFormatter;

public class VueCalendrier extends JPanel {	//Coder par Mathieu Flesch

    private static final long serialVersionUID = 1L;

    private static final Font LABEL_FONT = new Font(Font.SANS_SERIF, Font.PLAIN, 14);

    private JLabel lblDateDebut;
    private JLabel lblDateFin;

    public VueCalendrier(ModeleCalendrier calendrier) {
        //Création des JLabel pour afficher les dates de début et de fin du calendrier
        lblDateDebut = new JLabel("Date de début: " + calendrier.getDatedebut().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        lblDateFin = new JLabel("Date de fin: " + calendrier.getDatefin().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        //Configuration de la police des labels
        lblDateDebut.setFont(LABEL_FONT);
        lblDateFin.setFont(LABEL_FONT);

        //Configuration du layout du panneau de calendrier
        setLayout(new GridLayout(2, 1));
        add(lblDateDebut);
        add(lblDateFin);
    }
}
