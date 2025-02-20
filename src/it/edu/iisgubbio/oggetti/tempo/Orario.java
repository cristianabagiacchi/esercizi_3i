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
	
	public void aggiungiOre(int x) {
		ora=ora+x;
	}
	
	public void aggiungiMinuti(int x) {
		minuti=minuti+x;
		if(minuti>60) {
			int oreDaAggiungere=minuti/60;
			minuti=minuti%60;
			aggiungiOre(oreDaAggiungere);
		}
	}
	public void aggiungiSecondi(int x) {
		secondi=secondi+x;
		if(secondi>60) {
			int minutiDaAggiungere=secondi/60;
			secondi=secondi%60;
			aggiungiMinuti(minutiDaAggiungere);
		}
	}
	
	public void aggiungiOrario (Orario x) {
		aggiungiOre(x.ora);
		aggiungiSecondi(x.secondi);
		aggiungiMinuti(x.minuti);
	}
	
}
