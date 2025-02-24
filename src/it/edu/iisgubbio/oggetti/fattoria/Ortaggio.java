package it.edu.iisgubbio.oggetti.fattoria;
/*
 * iplemetare metodo tostring come preferimo
 * creare istantza che rappresenta pomodor, 2 euro al kg, e biologico
 */
public class Ortaggio extends Prodotto {
	protected boolean biologico;
	protected double prezzoKG;
	protected String nome;
	
	public Ortaggio(String nome, double prezzoAlChilo, boolean biologico, double prezzoKG) {
		super(nome, prezzoAlChilo);
		this.biologico = biologico;
	}


	public boolean isBiologico() {
		return biologico;
	}


	public void setBiologico(boolean x) {
		this.biologico = x;
	}


	public double getPrezzoKG() {
		return prezzoKG;
	}


	public void setPrezzoKG(double prezzoKG) {
		this.prezzoKG = prezzoKG;
	}


	@Override
	public String toString() {
		if(biologico==true) {
			return "Ortaggio"+nome+ "[biologico=" + biologico + ", prezzoKG=" + prezzoKG + "]";
		}else {
			return "Ortaggio"+nome+ " [biologico=" + "no" + ", prezzoKG=" + prezzoKG + "]";
		}
	}
	
	
	
}
