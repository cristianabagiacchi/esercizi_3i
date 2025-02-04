package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class MinimoMassimo extends Application{

	TextField tfNumeri = new TextField ();
	Button bMinimo = new Button("Minimo");
	Button bMassimo = new Button("massimo");
	Label lRisultato = new Label ("???");
	
		
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane ();
		principale.add(tfNumeri,0,0);
		principale.add(lRisultato,0,2);
		principale.add(bMinimo,0,1);
		principale.add(bMassimo,1,1);
			
		Scene scena = new Scene(principale);
		finestra.setTitle("Massimo e Mininmo");
		finestra.setScene(scena);
		finestra.show(); 
			
		principale.getStyleClass().add("principale");

		bMinimo.setOnAction( e -> eseguiMinimo() );
		bMassimo.setOnAction( e -> eseguiMassimo() );
	}
	
	private void eseguiMinimo() {	
		int minimo;
		String testo,parti[];
		testo=tfNumeri.getText();
		parti=testo.split(" ");
		int numeri[]=new int[parti.length];
		for(int i=0;i<parti.length;i++) {
			numeri[i]=Integer.parseInt(parti[i]);
		}
		minimo=numeri[0];
		for(int i=1;i<numeri.length;i++) {
			if(numeri[i]<minimo) {
				minimo=numeri[i];
			}
		}
		lRisultato.setText(""+minimo);
	}
	
	private void eseguiMassimo() {	
		int massimo;
		String testo,parti[];
		testo=tfNumeri.getText();
		parti=testo.split(" ");
		int numeri[]=new int[parti.length];
		for(int i=0;i<parti.length;i++) {
			numeri[i]=Integer.parseInt(parti[i]);
		}
		massimo=numeri[0];
		for(int i=1;i<numeri.length;i++) {
			if(numeri[i]>massimo) {
				massimo=numeri[i];
			}
		}
		lRisultato.setText(""+massimo);
	}
		

	public static void main(String[] args) {
		launch(args);
	}
}
