package it.edu.iisgubbio.oggetti.tempo;
 /* questo oggeto specifica ore, minuti e secondi, e tutte le proprieta private
  * implementare metodo tostring che deve rappresentare l'ogetto come testo
  * es: 10:13:02
  */
public class Orario {
	private int ora;
	private int minuti;
	private int secondi;

	public Orario(int ora, int minuti, int secondi) {
		super();
		this.ora = ora;
		this.minuti = minuti;
		this.secondi = secondi;
	}
	
	public String toString() {
		return ora+":"+minuti+":"+secondi;
	}
	
	

}
