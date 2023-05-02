public class ProblemeEvent extends EventObject{
	String type_capteur;
	float valeur;
	String nom;
	String lieu;
	
	
	public ProblemeEvent(Object source, String un_type, String un_lieu, float une_valeur, String un_nom) {
		super(source);
		this.valeur = une_valeur;
		this.type_capteur = un_type;
		this.nom = un_nom;
		this.lieu= un_lieu;
	}
