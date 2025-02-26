package it.edu.iisgubbio.oggetti.fattoria;

public class Formaggio extends Prodotto {
	protected String formaggio;
	protected int stagionatura;
	protected boolean dop;	
	
	public Formaggio(String nome, double prezzoAlChilo, int stagonatura, boolean dop) {
		super(nome, prezzoAlChilo);
		this.stagionatura = stagonatura;
		this.dop = dop;
	}
	
	public Formaggio(String nome,double prezzoAlChilo,int stagionatura) {
		super(nome,prezzoAlChilo);
		this.stagionatura=stagionatura;
		dop=false;
	}

	@Override
	public String toString() {
		
		String descrizione="formaggio=" + nome +"prezzo al chilo="+prezzoAlChilo;
		if(dop) {
			descrizione=descrizione+"dop";
		}else {
			descrizione=descrizione+"no dop";
		}
		if(stagionatura>0) {
			descrizione=descrizione + "stagionatura"+stagionatura+"mesi";
		}
		
	return descrizione;
	}
	
		
	
}
