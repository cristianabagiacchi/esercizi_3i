package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Media extends Application{
	
	TextField cNumeri = new TextField ();
	Button eMedia = new Button("Media");
	Label pMedia = new Label ();
		
	public void start(Stage finestra) throws Exception {
		eMedia.setText("media");
		GridPane principale = new GridPane ();
		principale.add(cNumeri,0,0);
		principale.add(pMedia,0,1);
		principale.add(eMedia,0,2);
			
		Scene scena = new Scene(principale);
		finestra.setTitle("media");
		finestra.setScene(scena);
		finestra.show(); 
			
		principale.getStyleClass().add("principale");

		eMedia.setOnAction( e -> eseguiMedia() );	

		}
	private void eseguiMedia() {
		double somma=0;
		String testo,testoMedia;
			
		testo=cNumeri.getText();
		String parti[];
		parti=testo.split(" ");
		int numeri[]=new int[parti.length];
		for(int i=0;i<parti.length;i++) {
			numeri[i]=Integer.parseInt(parti[i]);
		}
		for(int i=0;i<numeri.length;i++) {
			somma=somma+numeri[i];
		}
		double media;
		media=somma/numeri.length;
		testoMedia=""+media;
		eMedia.setText(testoMedia);
	}
	public static void main(String[] args) {
		launch(args);
	}
	}