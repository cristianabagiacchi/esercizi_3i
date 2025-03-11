package it.edu.iisgubbio.mobilita.mezzi;

public class MezziRimessa {
	
	public static void main(String[] args) {
		MezziDiTrasporto papamobile= new MezziDiTrasporto("papamobile",135);
		System.out.println(papamobile);
		
		AMuscoli sediaARotelle=new AMuscoli("sedia a rotelle",90,"tricipiti");
		System.out.println(sediaARotelle);

	}
}
