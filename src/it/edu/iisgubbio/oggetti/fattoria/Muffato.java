package it.edu.iisgubbio.oggetti.fattoria;

public class Muffato extends Formaggio {
	protected String muffa;
	protected boolean muffaInteno;
	
	
	public Muffato(String nome, double prezzoAlChilo, String muffa) {
		super(nome, prezzoAlChilo,0,false);
		this.muffa = muffa;
		this.muffaInteno=true;
	}

	public void setMuffaInteno(boolean muffaInteno) {
		this.muffaInteno = muffaInteno;
	}
	
	@Override
	public String toString() {
		
		String descrizione=nome +" || prezzo al chilo= "+prezzoAlChilo+" || nome muffa="+muffa;
		if(dop) {
			descrizione=descrizione+" [dop] ";
		}else {
			descrizione=descrizione+" [no dop] ";
		}
		if(stagionatura>0) {
			descrizione=descrizione + " [stagionatura "+stagionatura+" mesi] ";
		}
		if(muffaInteno) {
			descrizione=descrizione +"[la muffa è interna]";
		}else {
			descrizione=descrizione +"[la muffa è esterna]";
		}
		
	return descrizione;
	}
	
}
