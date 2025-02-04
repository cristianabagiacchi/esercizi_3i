package it.edu.iisgubbio.matematica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class MassimoComuneDivisore extends Application{
	TextField tfNumero1 = new TextField ();
	TextField tfNumero2 = new TextField ();
	Label lNumero1 = new Label ("Numero1");
	Label lNumero2 = new Label ("Numero2");
	Label lRisultato = new Label ("???");
	Button bMCD = new Button("MCD");
	
	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(lNumero1, 0, 0); 
		principale.add(tfNumero1, 1, 0); 
		
		principale.add(lNumero2, 0, 1); 
		principale.add(tfNumero2, 1, 1);
		
		
		principale.add(bMCD, 0, 2);
		principale.add(lRisultato, 1, 2);
		
		
		Scene scena = new Scene(principale);
		finestra.setTitle("Tabellina");
		finestra.setScene(scena);
		finestra.show();
		
		bMCD.setOnAction( e -> eseguiMCM ());
		
	}
	
	private void eseguiMCM() {
		int numero1, numero2, mcm;
	}
}
