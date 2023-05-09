
public class MoniteurA implements CapteurListener{
	String nom = "Pompier";
	InterfaceMoniteur inter = new InterfaceMoniteur("pompier");
	
	public MoniteurA() {}
	
	public void PbSeuille(ProblemeEvent probleme) {
		System.out.println("message transmis au moniteurA. ");
		String natPb = probleme.type;
		inter.Alarme(natPb);
		
		
	}
	public static void main(String[] args) {
		//InterfaceMoniteur fen = new InterfaceMoniteur("moniteur");
		//fen.Alarme("why not");
	}

}