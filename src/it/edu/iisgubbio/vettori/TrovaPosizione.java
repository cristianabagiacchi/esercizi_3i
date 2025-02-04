package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TrovaPosizione extends Application {
	TextField tfNumeri = new TextField ();
	Button bRisultato = new Button("Cerca");
	Label lNumero = new Label ("Numero:");
	TextField tfNumero = new TextField ();
	Label lRisultato = new Label ("???");
		
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane ();
		principale.add(tfNumeri,0,0,1,1);
		tfNumeri.setMaxHeight(Integer.MAX_VALUE);
		principale.add(lRisultato,0,2);
		principale.add(lNumero,0,1);
		principale.add(bRisultato,2,1);
		principale.add(tfNumero,1,1);
			
		Scene scena = new Scene(principale);
		finestra.setTitle("Trova");
		finestra.setScene(scena);
		finestra.show(); 
			
		principale.getStyleClass().add("principale");

		bRisultato.setOnAction( e -> eseguiRisultato() );	
	}
	
	private void eseguiRisultato() {	
		int numero;
		int posizione=0;
		int sequenza=0;
		String testo,parti[];
		testo=tfNumeri.getText();
		numero=Integer.parseInt(tfNumero.getText());
		parti=testo.split(" ");
		int numeri[]=new int[parti.length];
		for(int i=0;i<parti.length;i++) {
			numeri[i]=Integer.parseInt(parti[i]);
		}
		boolean trova= false;
		for(int  i=0;i<parti.length;i++ ) {
			if(numeri[i]==numero) {
				trova=true;
				posizione=i+1;
				sequenza+="" + posizione + "," +1;

			}

		}
		
		if(trova) {
			lRisultato.setText(numero+" è in posizione "+sequenza);
		}else {
			lRisultato.setText(numero+" non è stato trovato");
		}
	}
	public static void main(String[] args) {
		launch(args);
	}

}
