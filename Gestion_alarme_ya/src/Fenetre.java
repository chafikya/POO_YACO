import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame {
    private JComboBox<String> typeAlarmeComboBox;
    private JComboBox<String> niveauUrgenceComboBox;

    public Fenetre(){
        super();
        this.setTitle("Tour de controle");
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Créer les menus déroulants
        String[] batiments = {"Batiment1", "Batiment2", "Batiment3"};
        typeAlarmeComboBox = new JComboBox<>(batiments);
        typeAlarmeComboBox.setSelectedIndex(0);

        String[] types = {"gaz", "incendie", "radiation"};
        niveauUrgenceComboBox = new JComboBox<>(types);
        niveauUrgenceComboBox.setSelectedIndex(0);
        
        String[] niveaux = {"1", "2", "3"};
        niveauUrgenceComboBox = new JComboBox<>(niveaux);
        niveauUrgenceComboBox.setSelectedIndex(0);
        
        // Créer le bouton "Générer l'alarme"
        JButton genererAlarmeButton = new JButton("Générer l'alarme");

        // Ajouter un gestionnaire d'événements pour le bouton
        genererAlarmeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String batiment = (String) typeAlarmeComboBox.getSelectedItem();
                String type = (String) niveauUrgenceComboBox.getSelectedItem();
                int niveau = (int) niveauUrgenceComboBox.getSelectedItem();
                // Appeler une méthode de l'autre classe pour utiliser les valeurs récupérées
                if(type=="gaz") {
                	CapteurGaz.generate_new_alarme(type,batiment,niveau);
                }
            }
        });

        // Ajouter les menus déroulants et le bouton à la fenêtre
        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
        contentPane.add(typeAlarmeComboBox);
        contentPane.add(niveauUrgenceComboBox);
        contentPane.add(genererAlarmeButton);
        this.setContentPane(contentPane);

        this.setVisible(true);
    }

    public static void main(String[] args){
        Fenetre fen = new Fenetre();
    }
}
