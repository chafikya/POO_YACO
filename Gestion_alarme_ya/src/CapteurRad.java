
public class CapteurRad {
	private String type= "radiation";
	public String lieu;
	String nom;
	float valeur_capteur;
	
	CapteurListener b;
	public CapteurRad(String un_nom, String lieu) {
		this.lieu=lieu;
		this.nom=un_nom;
		
	}
	
	public void remplir (CapteurListener i) {
		
		this.b=i;
	}
	public void generate_new_alarme(int niveau) {
		ProblemeEvent probleme= new ProblemeEvent(this,this.nom, this.type, this.lieu, niveau);
		b.PbSeuille(probleme);
		
	}/*
	public void verif(float valeur) {
		if (valeur>10) {
			generate_new_alarme( nom, type, lieu, valeur);
		}
	}*/
}
