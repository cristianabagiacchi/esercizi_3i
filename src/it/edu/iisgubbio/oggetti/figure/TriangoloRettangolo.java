package it.edu.iisgubbio.oggetti.figure;

public class TriangoloRettangolo {
	private double base;
	private double altezza;
	
	
	public double ipotenusa() {
		double ipotenusa;
		ipotenusa= Math.sqrt((altezza * altezza)+(base*base));
		return ipotenusa;
	}
	
	public double perimetro() {
		double p = altezza + base + ipotenusa();
		return p;
	}
	
	public double area() {
		double a= (base * altezza) /2;
		return a;
	}

	public TriangoloRettangolo(double base, double altezza) {
		super();
		this.base = base;
		this.altezza = altezza;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	
	public String toString() {
		return "Triangolo Retangolo " + base +" x "+ altezza;
		
	}
	
	

}
