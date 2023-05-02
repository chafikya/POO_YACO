import java.util.ArrayList;

public class CapteurGaz {
	public String nom;
	public String type="gaz";
	public String lieu;
	public float valeur;
	CapteurListener a;
	CapteurListener b;
	public CapteurGaz(String nom,String lieu, float valeur) {
		this.nom=nom;
		this.lieu=lieu;
		this.valeur=valeur;
		
	}
	
	public void remplir (CapteurListener j,CapteurListener i) {
		this.a=j;
		this.b=i;
	}
	public void generate_new_alarme(String type, String lieu,int niveau) {
		ProblemeEvent probleme= new ProblemeEvent(this,type,lieu,niveau);
		a.PbSeuille(probleme);
		b.PbSeuille(probleme);
		
		
	}
	public void verif(float valeur) {
		if (valeur>10) {
			generate_new_alarme( nom, type, lieu, valeur);
		}
	}
}
