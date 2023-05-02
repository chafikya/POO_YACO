import java.util.EventObject;

public class ProblemeEvent extends EventObject{
	String type_capteur;
	int niveau;
	String nom;
	String lieu;
	
	
	public ProblemeEvent(Object source, String un_type, String un_lieu, int un_niveau) {
		super(source);
		this.niveau = un_niveau;
		this.type_capteur = un_type;
		
		this.lieu= un_lieu;
	}
}