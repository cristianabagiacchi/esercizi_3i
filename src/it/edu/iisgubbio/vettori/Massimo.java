package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Massimo extends Application{
	
	TextField tfNumeri = new TextField ();

	Button bRicerca = new Button("Ricerca");
	
	Label lRisultato = new Label ("???");
	Label lValori = new Label ("Valori");
	Label lMax2 = new Label ("Massimo");
	Label lPosizione2 = new Label ("Posizione");
	Label lElenco = new Label ("Elenco");
	Label lPosizione = new Label ("???");
	Label lMax = new Label ("???");
	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane ();
		
		principale.add(tfNumeri,1,0);
		principale.add(bRicerca,0,4);
		principale.add(lRisultato,1,3);
		principale.add(lValori,0,0);
		principale.add(lMax2,0,1);
		principale.add(lMax,1,1);
		principale.add(lPosizione2,0,2);
		principale.add(lPosizione,1,2);
		principale.add(lElenco,0,3);
			
		Scene scena = new Scene(principale);
		finestra.setTitle("Massimo e Mininmo");
		finestra.setScene(scena);
		finestra.show(); 
			
		principale.getStyleClass().add("principale");

		bRicerca.setOnAction( e -> eseguiRicerca() );
	}
	
	private void eseguiRicerca() {	
		int massimo, posizione;
		String e="";
		String testo,parti[];
		testo=tfNumeri.getText();
		parti=testo.split(" ");
		int numeri[]=new int[parti.length];
		for(int i=0;i<parti.length;i++) {
			numeri[i]=Integer.parseInt(parti[i]);
		}
		massimo=numeri[0];
		posizione=0;
		for(int i=0;i<numeri.length;i++) {
			if(numeri[i]>massimo) {
				massimo=numeri[i];
				posizione=i;
			}
		}
		
		lMax.setText("" + massimo);
		lPosizione.setText("" + posizione);
		
		for(int i=0;i<numeri.length;i++) {
			if(i==0) {
				e=e+numeri[i]+";";
			}else {
				e=e+numeri[i]+";";
			}
		}
		lRisultato.setText("" + e);
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
