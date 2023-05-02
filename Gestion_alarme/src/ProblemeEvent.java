import java.util.EventObject;

public class ProblemeEvent extends EventObject{
	String type_capteur;
	float valeur;
	
	
	public ProblemeEvent(Object source, String un_type, float une_valeur) {
		super(source);
		this.valeur = une_valeur;
		this.type_capteur = un_type;
	}
}
