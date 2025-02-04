package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Cesare extends Application{
	
	TextField tfCifra = new TextField ();
	Button bCifra = new Button("Cifra");
	TextField tfDecifra = new TextField ();
	Button bDecifra= new Button("Decifra");
	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane ();
		principale.add(tfCifra,0,0);
		principale.add(bCifra,0,1);
		principale.add(bDecifra,1,1);
		principale.add(tfDecifra,0,2);
			
		Scene scena = new Scene(principale);
		finestra.setTitle("Iniziali Maiuscole");
		finestra.setScene(scena);
		finestra.show(); 
			
		principale.getStyleClass().add("principale");
	
		bCifra.setOnAction( e -> eseguicifra() );
		bDecifra.setOnAction( e -> eseguidecifra() );
	}
	
	private void eseguicifra() {
		
		char[] lettere = tfCifra.getText().toCharArray();
		int pos=lettere.length;
		
		for (int i = 0; i < lettere.length ; i++){

			if(lettere[i] >= 'x') {
				lettere[i]= (char) (lettere[i] -26);
			}
			lettere[i]= (char) (lettere[i] +3);
			
			
		}
		
		String risultato= new String (lettere);
		tfDecifra.setText(risultato);
	}
	
	private void eseguidecifra() {
		char[] lettere = tfDecifra.getText().toCharArray();
		
		for (int i = 0; i < lettere.length ; i++){
			if(lettere[i] <= 'c') {
				lettere[i]= (char) (lettere[i] +26);
			}
			lettere[i]=(char) (lettere[i] -3);
		}
		
		String risultato= new String (lettere);
		tfCifra.setText(risultato);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
