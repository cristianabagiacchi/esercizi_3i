package it.edu.iisgubbio.oggetti.fattoria;

public class Fattoria {

	public static void main(String[] args) {
		Prodotto carote = new Prodotto("carote",2.5);

		System.out.println(carote);
		
		double p = carote.calcolaPrezzo(4);
		System.out.println(p);
		
		Formaggio Taleggio=new Formaggio("Taleggio",25,1,true);
		System.out.println(Taleggio);
		
		Formaggio Ricotta=new Formaggio("Ricotta",4,0,false);
		System.out.println(Ricotta);
		
		Carne costarelle=new Carne("costarelle",9.5,false,false);
		System.out.println(costarelle);
		
		Carne pollo=new Carne("pollo",2.5,false,true);
		System.out.println(pollo);
		
		pollo.isCarneBianca();
		System.out.println(pollo.isCarneBianca());
	}
}
