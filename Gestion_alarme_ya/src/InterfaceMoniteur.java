import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;


public class InterfaceMoniteur extends JFrame {
	String nom;
	JPanel fene= new JPanel();
	JPanel top = new JPanel();
	ActionListener voirDetail = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.out.println("bouton fonctionne");
			/*JDialog fenDetail = new JDialog(this.frameDetail.getSelectedItem().toSting());
		*/}
	};
	
	public InterfaceMoniteur(String nom_moniteur) {
		super();
		this.nom = nom_moniteur;
		this.setTitle(nom_moniteur);
		this.setSize(400,400);
		
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        JLabel bjr = new JLabel("bonjour ");
        this.top.add(bjr);
        this.fene.add(this.top, BorderLayout.NORTH);	
        this.setContentPane(this.fene);
        
        
        
        this.setVisible(true);
		
		
	}
	
	public void Alarme(ProblemeEvent probleme) {
		System.out.println("probleme transmis interface graphique");
		
		JLabel attentionPb = new JLabel("attention un "+ probleme.type + " est surveneue");
		JFrame frameDetail = new JFrame();
		
		this.fene.add(attentionPb);
        JButton boutonDetail = new JButton("voir détails");
        this.top.add(boutonDetail);
        boutonDetail.addActionListener(voirDetail);
        if (probleme.type=="gaz") {
        	JLabel gazResp = new JLabel("une fuite de "+ probleme.getGazFuit() +" a lieu");
        	frameDetail.add(gazResp);
        }
        JLabel localisation = new JLabel(" Batiment :"+ probleme.lieu);
        frameDetail.add(localisation);
        JLabel nivPb = new JLabel("Niveau : "+ probleme.niveau);
        frameDetail.add(nivPb);
        
        
        this.revalidate();
		
		
		
	}
	public static void main(String[] args) {
		//InterfaceMoniteur fen = new InterfaceMoniteur("moniteur");
		//fen.Alarme("why not");
		
	}
}
