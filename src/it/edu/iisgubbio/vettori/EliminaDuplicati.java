package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EliminaDuplicati extends Application {
	
	TextField tfNumeri = new TextField ();
	Label lNumeri = new Label ("Numeri");
	Button bElimina = new Button("Elimina Duplicati");
	Button bConta = new Button("Conta Duplicati");
	Label lRisposta = new Label ("Risposta");
	Label lRisultato = new Label ("???");
	
	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane ();
		principale.add(tfNumeri,1,0);
		principale.add(lNumeri,0,0);
		principale.add(bElimina,1,1);
		principale.add(bConta,1,2);
		principale.add(lRisposta,0,3);
		principale.add(lRisultato,1,3);
			
		Scene scena = new Scene(principale);
		finestra.setTitle("Elimina Duplicati");
		finestra.setScene(scena);
		finestra.show(); 
			
		principale.getStyleClass().add("principale");

	
	
		bElimina.setOnAction( e -> eseguiElimina() );
		bConta.setOnAction( e -> eseguiConta() );

		}
	int[] testoNumeri (String testo) {
		String parti[];
		int vettoreNumeri[];
		parti= testo.split(" ");
		vettoreNumeri= new int[parti.length];
		for(int i=0;i<parti.length;i++) {
			vettoreNumeri[i]= Integer.parseInt(parti[i]);
		}
		return vettoreNumeri;
	}
	
	private void eseguiElimina() {	
		int posFinale=0;
		int c=0;
		String sequenza="";
		boolean duplicate=true;
		String testo;
		testo=tfNumeri.getText();
		int numeri[]= testoNumeri(testo); 
		int finale[]= new int [numeri.length];
		

		finale[0]=numeri[0];
		posFinale++;
		for(int i=1; i<numeri.length;i++) {

			c=numeri[i];
			//ricerca se presente nel vettore finele
			duplicate=false;
			for(int k=0; k<posFinale;k++) {
				if(finale[k]==c) {
					duplicate=true;
				}
			}

			if(duplicate==false) {
				finale[posFinale]=c;
				posFinale++;
			}
		}
		for(int i=0; i <posFinale;i++) {
			sequenza+= finale[i] + ",";
			
		}
		lRisultato.setText(sequenza);
	}
	
	private void eseguiConta() {	
		int contatore=0;
		String testo,parti[];
		testo=tfNumeri.getText();
		parti=testo.split(" ");
		int numeri[]=new int[parti.length];
		for(int i=0;i<parti.length;i++) {
			numeri[i]=Integer.parseInt(parti[i]);
		}
		for(int i=0;i<parti.length;i++) {
			for(int c=i+1; c<numeri.length; c++) {
				if(numeri[i]==(numeri[c])) {
					contatore++;
				}
			}
		}
		lRisultato.setText(" "+contatore);
		
	}
		
	public static void main(String[] args) {
		launch(args);
	}

}