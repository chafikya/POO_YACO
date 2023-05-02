
public class MoniteurA implements CapteurListener{
	String nom = "Pompier";
	
	public MoniteurA() {}
	
	public void PbSeuille(ProblemeEvent probleme) {
		System.out.println("pb");
	}

}