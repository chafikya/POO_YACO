
public class CapteurIncend {
	public String nom;
	public String type="incendie";
	public String lieu;
	public float valeur;
	CapteurListener a;
	CapteurListener b;
	public CapteurIncend(String nom,String lieu, float valeur) {
		this.nom=nom;
		
		this.lieu=lieu;
		this.valeur=valeur;
		
	}
	
	public void remplir (CapteurListener j) {
		this.a=j;
		
	}
	public void generate_new_alarme(String nom,String type, String lieu,int niveau) {
		ProblemeEvent probleme= new ProblemeEvent(this,type,lieu,valeur,nom);
	
		a.PbSeuille(probleme);
		
		
		
	}
	public void verif(float valeur) {
		if (valeur>10 && valeur<20) {
			int niv =2;
			generate_new_alarme( nom, type, lieu, niv);
		}
		else if (valeur>=20 && valeur<30) {
			int niv =2;
			generate_new_alarme( nom, type, lieu, niv);
		}
		else if (valeur>=30) {
			int niv =2;
			generate_new_alarme( nom, type, lieu, niv);
		}
	}

}
