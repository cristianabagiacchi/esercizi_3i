package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Duplicati extends Application{
	
	
	TextField tfNumeri = new TextField ();
	Button bRisultato = new Button("Trova duplicati");
	Label lMedia = new Label ();
		
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane ();
		principale.add(tfNumeri,0,0);
		principale.add(lMedia,0,1);
		principale.add(bRisultato,0,2);
			
		Scene scena = new Scene(principale);
		finestra.setTitle("Duplicati");
		finestra.setScene(scena);
		finestra.show(); 
			
		principale.getStyleClass().add("principale");

		bRisultato.setOnAction( e -> eseguiRisultato() );	

		}
	private void eseguiRisultato() {	
		String testo,parti[];
		testo=tfNumeri.getText();
		parti=testo.split(" ");
		int numeri[]=new int[parti.length];
		for(int i=0;i<parti.length;i++) {
			numeri[i]=Integer.parseInt(parti[i]);
		}
		boolean duplicate=false;
		for(int i=1; i<numeri.length;i++){
			if(numeri[i]==numeri[i-1]) {
				duplicate=true;
			}
		}
		if(duplicate) {
			lMedia.setText("Ci sono numeri duplicati");
		}else {
			lMedia.setText("Non ci sono numeri duplicati");
		}
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
