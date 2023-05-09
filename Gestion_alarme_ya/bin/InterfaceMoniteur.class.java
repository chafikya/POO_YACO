import javax.swing.*;
import java.awt.event.*;


public class InterfaceMoniteur extends JFrame {
	String nom;
	public InterfaceMoniteurA(String nom_moniteur) {
		super();
		this.nom = nom_moniteur;
		this.setTitle(nom_moniteur);
		this.setSize(400,400);
		this.setVisible(true);
		
	}
	
	public void Alarme(String batiment, String nat_probleme) {
		
		
	}
	public static void main(String[] args) {
		InterfaceMoniteurA fen = new InterfaceMoniteurA("moniteur");
	}
}
