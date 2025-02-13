package it.edu.iisgubbio.oggetti.animali.cani;

public class Cuccia {

	private int prezzo;
	private boolean interno;
	private int quantiCani;
	private String colore;
	

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

	public boolean isInterno() {
		return interno;
	}

	public void setInterno(boolean interno) {
		this.interno = interno;
	}

	public int getQuantiCani() {
		return quantiCani;
	}

	public void setQuantiCani(int quantiCani) {
		this.quantiCani = quantiCani;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}
	public String toString() {
	
		if(interno==false) {
			if(colore==null) {
				return  "prezzo:"+prezzo+","+" è da interno"+", "+"quanti:"+quantiCani;
				
			}else {
				return "prezzo:"+prezzo+","+" è da interno"+", "+"quanti:"+quantiCani+", "+"colore:"+colore;
			}
			
		}else {
			if (colore==null) {
				return  "prezzo:"+prezzo+","+" è da esterno"+", "+"quanti:"+quantiCani;
			}else {
				return "prezzo:"+prezzo+","+" è da interno"+", "+"quanti:"+quantiCani+", "+"colore:"+colore;
			}
		}
	}

}