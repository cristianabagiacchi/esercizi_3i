package it.edu.iisgubbio.negozi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class NegoziPanini extends Application{
	
	TextField tfPersone = new TextField ();
	TextField tfPrezzo = new TextField ();
	
	Label lPersone = new Label ("Persone");
	Label lPrezzo = new Label ("Prezzo");
	Label lScontato = new Label ("Scontato");
	Label lRisultatoTotale = new Label ();
	Label lRisultatoScontato = new Label ();
	
	Button bTotale = new Button("Totale");
	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(lPersone, 0, 0); 
		principale.add(lPrezzo, 0, 1); 
		principale.add(tfPersone, 1, 0); 
		principale.add(tfPrezzo, 1, 1); 
		
		principale.add(bTotale, 0, 2); 
		principale.add(lRisultatoTotale, 1, 2); 
		principale.add(lScontato, 0, 3); 
		principale.add(lRisultatoScontato, 1, 3); 
		
		Scene scena = new Scene(principale);
		finestra.setTitle("Panini");
		finestra.setScene(scena);
		finestra.show();
		
		bTotale.setOnAction( e -> eseguiProva ());
		
	}
	
	private void eseguiProva() {
		double sconto50,sconto100, prezzo, totale;
		int persone;
		
		persone = Integer.parseInt(tfPersone.getText());
		prezzo = Double.parseDouble(tfPrezzo.getText());
		
		totale=persone*prezzo;
		lRisultatoTotale.setText("" + totale);
		
		if(totale>50){
			sconto50= (totale * 10) / 100;
			lRisultatoScontato.setText (""+ sconto50);
			totale=totale-sconto50;
			lRisultatoTotale.setText(""+totale);
		}
		
		if(totale>100) {
			sconto100=(totale* 20)/100;
			lRisultatoScontato.setText (""+ sconto100);
			totale=totale-sconto100;
			lRisultatoTotale.setText("" + totale);
		}
	
		}
	
	public static void main(String[] args) {
		launch(args);
	}
}
