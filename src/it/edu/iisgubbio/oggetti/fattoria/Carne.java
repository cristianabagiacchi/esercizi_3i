package it.edu.iisgubbio.oggetti.fattoria;

public class Carne extends Prodotto{
	private boolean kosher;
	private boolean carneBianca;
	
	
	public Carne(String nome, double prezzoAlChilo, boolean kosher, boolean carneBianca) {
		super(nome, prezzoAlChilo);
		this.kosher = kosher;
		this.carneBianca = carneBianca;
	}
	
	@Override
	public String toString() {
		String descrizione= nome+" "+prezzoAlChilo+"€/kg";
		if(kosher) {
			descrizione=descrizione+" kosher";
		}else {
			descrizione=descrizione+" NON kosher";
		}
		
		if(carneBianca) {
			descrizione=descrizione+" [carne bianca]";
		}else {
			descrizione=descrizione+" [carne rossa]";
		}
		return descrizione;
		
	}


	public boolean isKosher() {
		return kosher;
	}

	public boolean isCarneBianca() {
		return carneBianca;
	}
}
