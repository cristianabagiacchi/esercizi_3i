package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Inversione extends Application{
	
	TextField tfNumeri = new TextField ();

	Button bInverti = new Button("Inverti");
	
	Label lNumeri = new Label ("Numeri");
	Label lInversi = new Label ("N. Invertiti");
	Label lRisultato = new Label ("???");
	
	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane ();
		
		principale.add(tfNumeri,1,0);
		principale.add(lNumeri,0,0);
		principale.add(lRisultato,1,2);
		principale.add(bInverti,1,1);
		principale.add(lInversi,0,2);
		
			
		Scene scena = new Scene(principale);
		finestra.setTitle("Massimo e Mininmo");
		finestra.setScene(scena);
		finestra.show(); 
			
		principale.getStyleClass().add("principale");

		bInverti.setOnAction( e -> eseguiInverti() );

	}
	private void eseguiInverti() {
		String testo;
		int posizione;
			
		testo=tfNumeri.getText();
		String parti[];
		parti=testo.split(" ");
		int numeri[]=new int[parti.length];
		for(int i=0;i<parti.length;i++) {
			numeri[i]=Integer.parseInt(parti[i]);
		}
		
		posizione=0;
		for(int i=0;i<numeri.length;i++) {
			if(numeri[i]==numeri[0]) {
				posizione=numeri[i];
			}else {
				posizione++;
			}
		}
		
		for(int i=0;i<posizione;i++) {
			posizione=numeri[posizione -1];
			numeri[0]=posizione;
		}
		lRisultato.setText(" " + posizione);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
