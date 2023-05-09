import java.util.EventObject;
import java.util.Random;

public class ProblemeEvent extends EventObject{
	String type;
	int niveau;
	String lieu;
	private String[] difGaz = {"dioxyde de carbonne", "Méthane", "Monoxyde de carbonne"};
	String nom_capt;
	private String gazFuit;
	
	
	public ProblemeEvent(Object source,String nom_capteur, String un_type, String un_lieu, int un_niveau) {
		super(source);
		this.nom_capt= nom_capteur;
		this.niveau = un_niveau;
		this.type = un_type;
		this.lieu= un_lieu;
		this.def_typeGaz();
	}
	
	private void def_typeGaz() {
		if (this.type == "gaz") {
			Random random = new Random();
			int nb;
			nb = random.nextInt(difGaz.length);
			this.gazFuit = difGaz[nb];
		}
	}
	public String getGazFuit() {
		return this.gazFuit;
	}
}