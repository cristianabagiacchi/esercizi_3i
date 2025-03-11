package it.edu.iisgubbio.oggetti.vivaio;

public class Bonsai extends Pianta implements Imballabile{
	private int eta;

	public Bonsai(String nome, double costo, int eta) {
		super(nome, costo);
		this.eta = eta;
	}
	
	public boolean vecchio() {
		boolean vecchio;
		if(eta>20) {
			return vecchio=true;
		}else {
			return vecchio=false;
		}
	}
	//return eta>20;//

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	@Override
	public String toString() {
		String descrizione= "nome= "+this.getNome()+" || costo="+this.getCosto() +"[eta=" + eta + "]";
		if(this.vecchio()==true) {
			descrizione=descrizione+"il bonsai è vecchio";
		}else{
			descrizione=descrizione+"il bonsai è giovane";
		}
		return descrizione;
	}

	@Override
	public double getVolumeImballo() {
		return 8;
	}

	@Override
	public int getUnitaPerImballo() {
		
		return 1;
	}
	
	
	
	
}
