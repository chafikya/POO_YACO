import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame {
    private JComboBox<String> batimentAlarme;
    private JComboBox<String> niveauUrgence;
    private JComboBox<String> typeAlarme;
    MoniteurA monitA = new MoniteurA();
    MoniteurB monitB = new MoniteurB();
    JPanel contentPane = new JPanel();
    
     ActionListener boutonListener = new ActionListener(){
    	public void actionPerformed(ActionEvent e) {
    		String Batiment = batimentAlarme.getSelectedItem().toString();
    		String type = typeAlarme.getSelectedItem().toString();
    		int niveau = Integer.parseInt(niveauUrgence.getSelectedItem().toString());
    		ProblemeEvent probleme = new ProblemeEvent(this,"Problème Test", type,Batiment,niveau);
    				
    		if(type=="gaz") {
    			monitA.PbSeuille(probleme);
    			monitB.PbSeuille(probleme);
    		}
    		else if(type=="incendie") {
    			monitA.PbSeuille(probleme);
    		}
    		else {
    			monitB.PbSeuille(probleme);
    		}
    	}
    };

    public Fenetre(){
        super();
        this.setTitle("Tour de controle");
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        // Créer les menus déroulants
        String[] batiments = {"Batiment1", "Batiment2", "Batiment3"};
        this.batimentAlarme = new JComboBox<>(batiments);
        //this.batimentAlarme.setSelectedIndex(0);

        String[] types = {"gaz", "incendie", "radiation"};
        this.typeAlarme = new JComboBox<>(types);
        //this.typeAlarme.setSelectedIndex(0);
        
        String[] niveaux = {"1", "2", "3"};
        this.niveauUrgence = new JComboBox<>(niveaux);
        //this.niveauUrgence.setSelectedIndex(0);
        
        // Créer le bouton "Générer l'alarme"
        JButton genererAlarmeButton = new JButton("Générer l'alarme");
        

        // Ajouter un gestionnaire d'événements pour le bouton
        

        // Ajouter les menus déroulants et le bouton à la fenêtre
        
        JPanel top = new JPanel();
        top.add(batimentAlarme);
        top.add(typeAlarme);
        top.add(niveauUrgence);
        top.add(genererAlarmeButton);
        genererAlarmeButton.addActionListener(boutonListener);
        genererAlarmeButton.setActionCommand("actione");
        
        this.contentPane.add(top, BorderLayout.NORTH);
        this.setContentPane(this.contentPane);

        this.setVisible(true);
    }
    
    public void ajout_label() {
    	JLabel lab = new JLabel("bonjour");
    	this.contentPane.add(lab);
    	
    	
    }
/*
    genererAlarmeButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String batiment = (String) typeAlarme.getSelectedItem();
            String type = (String) niveauUrgence.getSelectedItem();
            int niveau = (int) niveauUrgence.getSelectedItem();
            // Appeler une méthode de l'autre classe pour utiliser les valeurs récupérées
            if(type=="gaz") {
            	//CapteurGaz capteurgaz = new CapteurGaz(Batiment);
            	//capteurGaz.generate_new_alarme(type,batiment,niveau);
            }
        }
    });*/
    public static void main(String[] args){
        Fenetre fen = new Fenetre();
        fen.ajout_label();
        fen.ajout_label();
    }
}
