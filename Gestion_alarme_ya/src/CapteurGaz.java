import java.util.ArrayList;

public class CapteurGaz {
	private String type="gaz";
	public String lieu;
	String nom;
	CapteurListener a;
	CapteurListener b;
	public CapteurGaz(String un_nom, String lieu) {
		this.nom = un_nom;
		this.lieu=lieu;
		
	}
	
	public void remplir (CapteurListener j,CapteurListener i) {
		this.a=j;
		this.b=i;
	}
	public void generate_new_alarme(int niveau) {
		ProblemeEvent probleme= new ProblemeEvent(this,this.nom, this.type, this.lieu,niveau);
		a.PbSeuille(probleme);
		b.PbSeuille(probleme);
		
		
	}/*
	public void verif(float valeur) {
		if (valeur>10) {
			generate_new_alarme(type, lieu, 3);
		}
	}*/
}
