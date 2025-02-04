package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PariDispari extends Application {

	TextField tfNumeri = new TextField ();
	Button bRisultato = new Button("Trova pari e dispari");
	Label lRisultato = new Label ();
	Label lRisultato1 = new Label ();
		
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane ();
		principale.add(tfNumeri,0,0);
		principale.add(lRisultato,0,1);
		principale.add(lRisultato1,2,1);
		principale.add(bRisultato,0,2);
			
		Scene scena = new Scene(principale);
		finestra.setTitle("Pari e Dispari");
		finestra.setScene(scena);
		finestra.show(); 
			
		principale.getStyleClass().add("principale");

		bRisultato.setOnAction( e -> eseguiRisultato() );	
	}
	
	private void eseguiRisultato() {	
		int pari=0;
		int dispari=0;
		String testo,parti[];
		testo=tfNumeri.getText();
		parti=testo.split(" ");
		int numeri[]=new int[parti.length];
		for(int i=0;i<parti.length;i++) {
			numeri[i]=Integer.parseInt(parti[i]);
		}

		for(int i=0;i<parti.length;i++) {
			if(numeri[i]%2==0) {
				pari++;
			}else {
				dispari++;
			}
		}
		lRisultato.setText(pari+ " sono pari");
		lRisultato1.setText(dispari+ " sono dispari");
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
