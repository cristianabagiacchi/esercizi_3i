package it.edu.iisgubbio.mobilita.mezzi;

public class AMuscoli extends MezziDiTrasporto {
	private String muscoliCoinvolti;

	public AMuscoli() {
		
	}
	
	public AMuscoli(String nome,double costo, String muscoliCoinvolti) {
		super(nome, costo);
		this.muscoliCoinvolti = muscoliCoinvolti;
	}
	
	public boolean parteAlta() {
		
		 boolean parteAlta;
		if(muscoliCoinvolti=="tricipiti" || muscoliCoinvolti=="bicipiti" ) {
			parteAlta=true;
		}else {
			parteAlta=false;
		}
		return parteAlta;
		}
	
	
	
	@Override
	public String toString() {
		return "veicolo A muscoli: " + this.nome +" , " + this.costo+" (usa= "+ this.muscoliCoinvolti+")";
	}

	public String getMuscoliCoinvolti() {
		return muscoliCoinvolti;
	}

	public void setMuscoliCoinvolti(String muscoliCoinvolti) {
		this.muscoliCoinvolti = muscoliCoinvolti;
	}

	
	
	
	
	
}
