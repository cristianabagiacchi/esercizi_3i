package it.edu.iisgubbio.oggetti.figure;

public class Cerchio {
	double raggio;
	
	
	
	public Cerchio(double raggio) {
		super();
		this.raggio = raggio;
	}

	public double circonferenza() {
		double c = raggio*2 * Math.PI;
		return c;
	}
	
	public double diametro() {
		double d = raggio * 2; 
		return d;
	}
	
	public Cerchio() {
		raggio=1;
	}

	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}
	
	public double getRaggio() {
		return raggio;
	}
	

}
