
public class CapteurIncend {
	public String nom;
	public String type;
	public String lieu;
	public float valeur;
	CapteurListener a;
	CapteurListener b;
	public CapteurIncend(String nom,String type,String lieu, float valeur) {
		this.nom=nom;
		this.type=type;
		this.lieu=lieu;
		this.valeur=valeur;
		
	}
	
	public void remplir (CapteurListener j) {
		this.a=j;
		
	}
	public void generate_new_alarme(String nom,String type, String lieu,float valeur) {
		ProblemeEvent probleme= new ProblemeEvent(this,type,lieu,valeur,nom);
		a.PbSeuille(probleme);
		
		
		
	}
	public void verif(float valeur) {
		if (valeur>10) {
			generate_new_alarme( nom, type, lieu, valeur);
		}
	}

}
