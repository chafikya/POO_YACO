
public class MoniteurB implements CapteurListener{
	String nom ="Service environement";
	InterfaceMoniteur inter = new InterfaceMoniteur("Service de l'environnement");
	
	public MoniteurB() {}
	public void PbSeuille(ProblemeEvent probleme) {
		System.out.println("message transmis au moniteurA. ");
		String natPb = probleme.type;
		inter.Alarme(natPb);
	}
	

}
