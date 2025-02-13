package it.edu.iisgubbio.oggetti.animali.test;

import it.edu.iisgubbio.oggetti.animali.cani.Cane;
import it.edu.iisgubbio.oggetti.animali.cani.Cuccia;

public class ProvaAnimali {

	public static void main(String[] args) {
		Cane fanco;
		Cuccia diFranco;
		
		Cuccia difranco= new Cuccia();
		
		
		Cane franco= new Cane ("franco", "pastore tedesco", 9, 5.6, "Francesco Giornelli");
		System.out.println(franco.toString());
		System.out.println(difranco);
		

	}

}
