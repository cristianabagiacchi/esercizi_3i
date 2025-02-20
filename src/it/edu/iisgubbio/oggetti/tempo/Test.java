package it.edu.iisgubbio.oggetti.tempo;
/*
 * creare una istanza di orario che rappresenta l0ora di fine lezione 
 */
public class Test {

	public static void main(String[] args) {
		
		Orario fineLezione=new Orario(17,59,00);
		System.out.println(fineLezione);
		
		fineLezione.aggiungiOre(0);
		System.out.println(fineLezione);
		
		fineLezione.aggiungiMinuti(8);
		System.out.println(fineLezione);
		
		fineLezione.aggiungiSecondi(30);
		System.out.println(fineLezione);
		
		fineLezione.aggiungiSecondi(270);
		System.out.println(fineLezione);
		
		Orario inPiu=new Orario (1,50,30);
		fineLezione.aggiungiOrario(inPiu);
		System.out.println(fineLezione);
		
		
	}

}
