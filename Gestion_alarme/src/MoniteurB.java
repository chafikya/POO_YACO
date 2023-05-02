
public class MoniteurB implements CapteurListener{
	String nom ="Service environement";
	public MoniteurB() {}
	public void PbSeuille(ProblemeEvent probleme) {
		System.out.println("pb");
	}

}
