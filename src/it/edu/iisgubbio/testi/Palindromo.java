package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Palindromo extends Application {
	
	Button bControlla = new Button("Controlla");
	Label lTesto = new Label("Testo");
	TextField tfParola = new TextField();
	Label lRisultato = new Label("???");
	
	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(tfParola, 1, 0);
		principale.add(lTesto, 0, 0);
		principale.add(bControlla, 1, 1);
		principale.add(lRisultato, 1, 2);
		

		Scene scena = new Scene(principale);
		finestra.setTitle("Palindromo");
		finestra.setScene(scena);
		finestra.show();

		principale.getStyleClass().add("principale");
		
		bControlla.setOnAction(e -> eseguiControlla());
	
	}
	
	private void eseguiControlla() {
		String parola = tfParola.getText();
		char[] originale = parola.toCharArray();
		char[] invertito = new char[originale.length];
		
		
		for (int i = 0; i < invertito.length; i++) {
			
			invertito[i]=originale[originale.length -(i+1)];	
			
		
			String scritta= new String(parola);
			String inverso= new String(invertito);
					
		if(scritta.equals(inverso)) {
			
			lRisultato.setText("è un polindromo!");
			
		}else{
			
			lRisultato.setText("non è un polindromo");
			
		}
		}

	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
