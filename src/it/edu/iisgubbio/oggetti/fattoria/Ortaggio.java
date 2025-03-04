package it.edu.iisgubbio.oggetti.fattoria;
/*
 * iplemetare metodo tostring come preferimo
 * creare istantza che rappresenta pomodor, 2 euro al kg, e biologico
 */
public class Ortaggio extends Prodotto {
	protected boolean biologico;


	public Ortaggio(String nome, double prezzoAlChilo, boolean biologico) {
		super(nome, prezzoAlChilo);
		this.biologico = biologico;
	
	}

	public boolean isBiologico() {
		return biologico;
	}

	public void setBiologico(boolean biologico) {
		this.biologico = biologico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		if(biologico==true) {
			return nome+ " [biologico=" + "si" + "][ prezzoKG=" + prezzoAlChilo + "]";
		}else {
			return nome+ " [biologico=" + "no" + "][ prezzoKG=" + prezzoAlChilo + "]";
		}
	}
	
	
	
}
