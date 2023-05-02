
public class CapteurRad {
	public String nom;
	public String type= "radiation";
	public String lieu;
	public float valeur;
	
	CapteurListener b;
	public CapteurRad(String nom,String lieu, float valeur) {
		this.nom=nom;
		
		this.lieu=lieu;
		this.valeur=valeur;
		
	}
	
	public void remplir (CapteurListener i) {
		
		this.b=i;
	}
	public void generate_new_alarme(String nom,String type, String lieu,float valeur) {
		ProblemeEvent probleme= new ProblemeEvent(this,type,lieu,valeur,nom);
		b.PbSeuille(probleme);
		
	}
	public void verif(float valeur) {
		if (valeur>10) {
			generate_new_alarme( nom, type, lieu, valeur);
		}
	}
}
