package it.edu.iisgubbio.oggetti.animali.test;

import it.edu.iisgubbio.oggetti.animali.cani.Cane;
import it.edu.iisgubbio.oggetti.animali.cani.Cuccia;

public class ProvaAnimali {

	public static void main(String[] args) {
		Cane fanco;
		Cuccia diFranco;
		
		Cuccia difranco= new Cuccia();
		
		
		Cane franco= new Cane ("franco", "pastore tedesco", 2017, 5.6, "Francesco Giornelli");
		System.out.println(franco);
		System.out.println(difranco);
		System.out.println(franco.eta(2025));
		
		if(franco.verificaProprietario("Francesco Giornelli")) {
			System.out.println("è il proprietario");
		}else {
			System.out.println("non è il proprietario");
		}
		
		

	}

}
