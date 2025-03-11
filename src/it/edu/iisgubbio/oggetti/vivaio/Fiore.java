package it.edu.iisgubbio.oggetti.vivaio;

public class Fiore extends Pianta {
	private String colore;
	private int stagioneFioritura;
	
	public Fiore(String nome, double costo, String colore, String stagioneFioritura) {
		super(nome, costo);
		this.colore = colore;
		setStagioneFioritura(stagioneFioritura);
	
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public String getStagioneFioritura() {
		String x;
		switch (stagioneFioritura) {
		case 1:
			x="primavera";
			break;
		case 2:
			x="estate";
			break;
		case 3:
			x="autunno";
			break;
		case 4:
			x="inverno";
			break;
		default:
			x="non so";
		}
		return x;
		
	}
	
	

	@Override
	public String toString() {
		return "nome= "+this.getNome()+" || costo="+this.getCosto() +"[colore=" + colore + ", stagioneFioritura=" + getStagioneFioritura() + "]";
	}

	public void setStagioneFioritura(String s) {
		switch (s) {
		case "primavera":
			stagioneFioritura=1;
			break;
		case "estate":
			stagioneFioritura=2;
			break;
		case "autunno":
			stagioneFioritura=3;
			break;
		case "inverno":
			stagioneFioritura=4;
			break;
		default:
			stagioneFioritura=0;
		}}
		
	/*
	* 	switch(StagioneFioritura){
	* case "primavera":
	* 	StagioneFioritura=1;
	* 	break;
	* 
	* case "estate":
	* 	StagioneFioritura=2;
	* 	break;
	* 
	* case "autunno":
	* 	StagioneFioritura=3;
	* 	break;
	* 
	* case "inverno":
	* 	StagioneFioritura=4;
	* 	break;
	* deafault:
	* 	StagioneFioritura=0;
	* }
	*/

	}

