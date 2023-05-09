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
			JWindow fenDetail = new JWindow();
		}
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
	
	public void Alarme(String nat_probleme) {
		System.out.println("probleme transmis interface graphique");
		
		JLabel attentionPb = new JLabel("attention un "+ nat_probleme+ " est surveneue");
		this.fene.add(attentionPb);
        JButton boutonDetail = new JButton("voir détails");
        this.top.add(boutonDetail);
        boutonDetail.addActionListener(voirDetail);
        
        JFrame frameDetail = new JFrame();
        this.revalidate();
		
		
		
	}
	public static void main(String[] args) {
		//InterfaceMoniteur fen = new InterfaceMoniteur("moniteur");
		//fen.Alarme("why not");
		
	}
}
