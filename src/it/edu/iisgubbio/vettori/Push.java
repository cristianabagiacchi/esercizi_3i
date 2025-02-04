package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Push extends Application{
	
	int NumeroCaselle=16;
	Button bPush = new Button("Push");
	TextField numeri[]=new TextField[NumeroCaselle]; 

	public void start(Stage finestra) throws Exception {
		
		GridPane principale = new GridPane();
		for(int i=0;i<NumeroCaselle;i++) {
			numeri[i] = new TextField();
			principale.add(numeri[i], 0, i);
		}
		
		principale.add(bPush, 0, NumeroCaselle);
		Scene scena = new Scene(principale);
		finestra.setTitle("Caselle");
		finestra.setScene(scena);
		finestra.show(); 
			
		principale.getStyleClass().add("principale");
		bPush.setOnAction( e -> eseguiPush() );

	}
	
	private void eseguiPush() {	
		int pos=0;
		for(int i=0;i<NumeroCaselle;i++) {
			if(numeri[i].getText()) {
				
			}
		pos++;
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
	

}