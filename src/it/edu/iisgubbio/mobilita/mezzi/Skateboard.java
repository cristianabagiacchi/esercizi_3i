package it.edu.iisgubbio.mobilita.mezzi;

public class Skateboard extends AMuscoli{
	private int lunghezza;

	public Skateboard(String nome, double costo) {
		super();
		this.costo = costo;
		this.nome = nome;
	}
	
	public Skateboard(String nome, double costo,int lunghezza) {
		super();
		this.costo = costo;
		this.nome = nome;
		this.lunghezza = lunghezza;
	}
	
	public boolean longboard() {
		boolean longboard;
		if(lunghezza>80) {
			return longboard=true;
		}else {
			return longboard=false;
		}
	}
	
	

	@Override
	public String toString() {
		String descrizione;
		if(longboard) {
			descrizione+="skateboard longboard";
		}else {
			descrizione+="skateboard";
		}
	}

	public int getLunghezza() {
		return lunghezza;
	}

	public void setLunghezza(int lunghezza) {
		this.lunghezza = lunghezza;
	}
	
	
	
	
	

	
	
}


