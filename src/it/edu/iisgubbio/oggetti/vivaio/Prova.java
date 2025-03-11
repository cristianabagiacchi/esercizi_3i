package it.edu.iisgubbio.oggetti.vivaio;

public class Prova {

	public static void main(String[] args) {
		Commestibile fragola=new Commestibile("fragola",40);
		fragola.setQuantita(1);
		fragola.setStagioneProduzione("primavera");

		System.out.println(fragola);
		
		Bonsai economico=new Bonsai("acero",30,7);
		System.out.println(economico);
			
		int getUnitaPerImballo=0;
		//da completare//
		getUnitaPerImballo+=fragola.getQuantita()/fragola.getUnitaPerImballo();
		if(fragola.getQuantita()%fragola.getUnitaPerImballo()>0) {
			getUnitaPerImballo++;
		}
		System.out.println(getUnitaPerImballo);
	}

}
