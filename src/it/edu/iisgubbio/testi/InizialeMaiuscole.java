package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class InizialeMaiuscole  extends Application{
	
	TextField tfParola = new TextField ();
	Button bMaiuscole = new Button("Maiuscole");
	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane ();
		principale.add(tfParola,0,0);
		principale.add(bMaiuscole,1,0);
			
		Scene scena = new Scene(principale);
		finestra.setTitle("Iniziali Maiuscole");
		finestra.setScene(scena);
		finestra.show(); 
			
		principale.getStyleClass().add("principale");
	
		bMaiuscole.setOnAction( e -> eseguiMaiuscole() );
	}
	
	private void eseguiMaiuscole() {
		
		char[] lettere = tfParola.getText().toCharArray();
		
		lettere[0]= (char) (lettere[0] -32);
		
		
		for(int i = 0; i < lettere.length ; i++) {
			if(lettere[i] == '.' && lettere[i+1]== ' ') {
				lettere[i+2]=(char) (lettere[i+2] -32);
			}
		}
		
		
		String risultato= new String (lettere);
		tfParola.setText(risultato);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
