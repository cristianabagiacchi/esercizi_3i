package it.edu.iisgubbio.matematica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Matematica extends Application{
	
	TextField tfNumero = new TextField ();
	Label lTabellina = new Label ("Tabellina");
	Button bCalcola = new Button("Calcola la tabellina");

	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(tfNumero, 0, 0); 
		principale.add(lTabellina, 0, 1); 
		principale.add(bCalcola, 1, 0);
		
		Scene scena = new Scene(principale);
		finestra.setTitle("Tabellina");
		finestra.setScene(scena);
		finestra.show();
		
		bCalcola.setOnAction( e -> eseguiCalcola ());
		
	}
	
	private void eseguiCalcola() {
		String sequenza;
		int numero;
		
		numero= Integer.parseInt(tfNumero.getText());
		sequenza=""+numero;
		
		for(int x= numero*2; x<= numero*10; x+=numero) {
			sequenza += ", " + x;
		}
		
		lTabellina.setText(sequenza);
		
	}
		
		public static void main(String[] args) {
			launch(args);
		}
}
	
