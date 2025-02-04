package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Doppie extends Application{
	
	TextField tfTesto = new TextField ();
	Label lTesto = new Label ("testo");
	Button bConta = new Button("Conta");
	Label lRisultato = new Label ();
	Label lDoppie = new Label ("N. Doppie");
	

	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane ();
		principale.add(tfTesto,1,0);
		principale.add(lTesto,0,0);
		principale.add(bConta,1,2);
		principale.add(lDoppie,0,3);
		principale.add(lRisultato,1,3);
			
		Scene scena = new Scene(principale);
		finestra.setTitle("Elimina Duplicati");
		finestra.setScene(scena);
		finestra.show(); 
			
		principale.getStyleClass().add("principale");
	
		bConta.setOnAction( e -> eseguiConta() );

}
	private void eseguiConta() {
		String testo;
		int contatore =0;
		
		String k = tfTesto.getText();
		char c[];
		c=k.toCharArray();
		
		
		for(int i=1; i<c.length;i++){
			if(c[i]==c[i-1]) {
				contatore ++;
			}
		}
		 testo = "" + contatore;
		 lRisultato.setText(testo);
	
	
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
