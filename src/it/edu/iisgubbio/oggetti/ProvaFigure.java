package it.edu.iisgubbio.oggetti;


import it.edu.iisgubbio.oggetti.animali.cani.Cane;
import it.edu.iisgubbio.oggetti.figure.Cerchio;
import it.edu.iisgubbio.oggetti.figure.TriangoloRettangolo;

public class ProvaFigure {
	
	public static void main(String[] args) {
		it.edu.iisgubbio.oggetti.animali.cani.Cane c;
		c= new Cane();
	
		
		c.setNome("franco");
		c.setRazza("Pastore Tedesco");
		c.setAnno(9);
		c.setGrammiCibo(5.6);
		c.setNomeProprietario("Francesco Giornelli");
		
		System.out.println(c.toString());
	}
}
