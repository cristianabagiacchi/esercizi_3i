package it.edu.iisgubbio.oggetti.fattoria;

public class Muffato extends Formaggio {
	protected String muffa;
	protected boolean muffaInteno;
	
	
	public Muffato(String nome, double prezzoAlChilo, String muffa, boolean muffaInteno) {
		super(nome, prezzoAlChilo,0,false);
		this.muffa = muffa;
		this.muffaInteno=true;
	}
	
	
	
}
