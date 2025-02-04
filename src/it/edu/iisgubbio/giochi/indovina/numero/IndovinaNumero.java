package it.edu.iisgubbio.giochi.indovina.numero;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class IndovinaNumero extends Application{
	TextField tfNumero = new TextField ();
	Label lRisultato = new Label ("Indovina il numero!");
	Button bProva = new Button("Prova");
	
	int numero = (int)(Math.random()*100)+1;
	
	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(tfNumero, 0, 0); 
		principale.add(lRisultato, 0, 3); 
		principale.add(bProva, 0, 1, 1, 2);
		bProva.setMaxWidth(Integer.MAX_VALUE);
		

		Scene scena = new Scene(principale);
		scena.getStylesheets().add("it/edu/iisgubbio/giochi/indovina/numero/spazi.css");
		finestra.setTitle("Indovina");
		finestra.setScene(scena);
		finestra.show();
		
		principale.setId("sfondo");
		
		bProva.setOnAction( e -> eseguiProva ());
		System.out.println(numero);
	}
	
	private void eseguiProva() {
		int numeroscritto;
		
		numeroscritto = Integer.parseInt(tfNumero.getText());
		
		if (numero>numeroscritto) {
			lRisultato.setText ("Più Grande");
		}
		if(numero<numeroscritto) {
			lRisultato.setText ("Più piccolo");
		}
		
		if(numero==numeroscritto) {
			lRisultato.setText ("Hai trovato il numero!");
		}
		 
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
