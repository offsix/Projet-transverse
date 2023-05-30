package Vue;

import javax.swing.*;

import Modele.ModeleAjout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VueAjoute extends JPanel {

    private static final int CARD_WIDTH = 200;
    private static final int CARD_HEIGHT = 150;

    public VueAjoute(ModeleAjout ajout) {
        setPreferredSize(new Dimension(CARD_WIDTH, CARD_HEIGHT));
        setLayout(new BorderLayout());

        JButton plusButton = new JButton("+");
        plusButton.setFont(new Font("Arial", Font.BOLD, 48));
        plusButton.setHorizontalAlignment(SwingConstants.CENTER);
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Action à effectuer lorsque le bouton "+" est cliqué
                // Ajoutez votre code ici
            }
        });

        add(plusButton, BorderLayout.CENTER);
    }
}
