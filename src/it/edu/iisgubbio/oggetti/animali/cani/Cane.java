package it.edu.iisgubbio.oggetti.animali.cani;

public class Cane {
	private String nome;
	private String razza;
	private int anno;
	private double grammiCibo;
	private String nomeProprietario;      //verifica proprietario che dato un nome dici se è il proprietarioo no\\
	
	
	public Cane() {
		nome="Nessuno";
		razza="Nessuna";
		anno=0;
		grammiCibo=0;
		nomeProprietario="nessuno";
		
	}
	
	public Cane(String nome, String razza, int anno, double grammiCibo, String nomeProprietario) {
		super();
		this.nome = nome;
		this.razza = razza;
		this.anno = anno;
		this.grammiCibo = grammiCibo;
		this.nomeProprietario = nomeProprietario;
	}

	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRazza() {
		return razza;
	}
	public void setRazza(String razza) {
		this.razza = razza;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	public double getGrammiCibo() {
		return grammiCibo;
	}
	public void setGrammiCibo(double grammiCibo) {
		this.grammiCibo = grammiCibo;
	}
	public String getNomeProprietario() {
		return nomeProprietario;
	}
	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}
	
	
	/*public String toString() {
		if(nomeProprietario== "Francesco Giornelli" || nomeProprietario== "francesco giornelli" || nomeProprietario== "Francesco giornelli" || nomeProprietario== "francesco Giornelli" ) {
			return nome +", "+ razza +", "+ nomeProprietario  +", "+ anno  +", "+ grammiCibo;
		}
		
		return nome +", "+ razza +", "+ nomeProprietario+" non è corretto"  +", "+ anno  +", "+ grammiCibo;
	}
	*/
	
	/**
	 *  verifica il nome del proprietario
	 * @param nome il nome del proprietario da controllare
	 * @return true quando il nome inserito è uguale a quello del proprietario
	 */
	public boolean verificaProprietario(String nome) {  /* primo metodo*/
		if(nomeProprietario.equals(nome)) {
			return true;
		}else {
			return false;
		}
		/*nomeProprietario.equals(nome);  stessa cosa MA pUi corta 
		 * 
		 */
	}
	
	
	/**metono che dato un anno, restituisce l'eta del cane
	 * @param anno l'anno a cui è riferita l'età
	 * @return calcola l'età del cane nell'anno specificato
	 */
	
	public int eta (int anno) {
		return anno-this.anno;
	}
}
