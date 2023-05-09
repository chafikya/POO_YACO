
public class CapteurIncend {
	public String type="incendie";
	public String lieu;
	String nom;
	CapteurListener a;
	
	public CapteurIncend(String un_nom, String lieu) {
		this.lieu=lieu;
		this.nom = un_nom;
		
	}
	
	public void remplir (CapteurListener j) {
		this.a=j;
	}
	
	public void generate_new_alarme(int niveau) {
		ProblemeEvent probleme= new ProblemeEvent(this, this.nom, this.type, this.lieu, niveau );
	
		a.PbSeuille(probleme);
		
	}
	/*
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
*/
}
