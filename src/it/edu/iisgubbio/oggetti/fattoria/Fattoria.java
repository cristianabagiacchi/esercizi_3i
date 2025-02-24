package it.edu.iisgubbio.oggetti.fattoria;

public class Fattoria {

	/*public static void main(String[] args) {
		Prodotto carote = new Prodotto("carote",2.5);

		System.out.println(carote);
		
		double p = carote.calcolaPrezzo(4);
		System.out.println(p);
	}*/
	
	public static void main(String[] args) {
		Ortaggio pomodoro=new Ortaggio("pomodoro",2,true);
		double m=pomodoro.calcolaPrezzo(500);
		System.out.println(pomodoro);
		System.out.println(m);
	}

}
