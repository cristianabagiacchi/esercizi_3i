package it.edu.iisgubbio.mobilita.mezzi;

public class MezziDiTrasporto {
	protected double costo;
	protected String nome;
	
	public MezziDiTrasporto() {
		
	}
	public MezziDiTrasporto(String nome, double costo) {
		super();
		this.costo = costo;
		this.nome = nome;
	}

	public double importoRata(int numeroRate) {
		return numeroRate/this.costo;
	}
	
	
	
	@Override
	public String toString() {
		return "Mezzo di trasporto: " + nome +" , " + costo;
	}
	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
