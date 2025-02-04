package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Anagramma extends Application{
	
	TextField tfParola1 = new TextField ();
	TextField tfParola2 = new TextField ();
	Label lParola1 = new Label ("Parola 1");
	Label lParola2 = new Label ("Parola 2");
	Label lRisultato = new Label ("???");
	Button bAnagramma = new Button("Anagramma");
	
	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane ();
		principale.add(tfParola1,1,0);
		principale.add(lParola1,0,0);
		principale.add(tfParola2,1,1);
		principale.add(lParola2,0,1);
		principale.add(bAnagramma,0,2);
		principale.add(lRisultato,1,2);
			
		Scene scena = new Scene(principale);
		finestra.setTitle("Anagramma");
		finestra.setScene(scena);
		finestra.show(); 
			
		principale.getStyleClass().add("principale");
	
		bAnagramma.setOnAction( e -> eseguiAnagramma() );
	}
	
	private void eseguiAnagramma() {
		
		int lettera= 0;
		
		String parola1 = tfParola1.getText();
		char[] Parola1 = parola1.toCharArray();
		
		String parola2 = tfParola2.getText();
		char[] Parola2 = parola2.toCharArray();
		
		boolean trovato;
		
		if(Parola1.length==Parola2.length) {
			for (int i = 0; i < Parola1.length ; i++) {
				trovato=false;
				for (int c = 0; c < Parola2.length && trovato==false; i++) {
					if(Parola1[i]==Parola2[c]) {
						trovato=true;
						Parola1[c]='§';
						lettera++;
					}
				}
			}
		}
		if(lettera==Parola1.length) {
			lRisultato.setText(" è un anagramma");
		}else {
			lRisultato.setText(" non è un anagramma");
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
