package it.edu.iisgubbio.agenziaViaggi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AgenziaViaggi extends Application{
	
	Label lNumeroPersone = new Label ("Numero Persone");
	Label lCostoAutobus = new Label ("Costo a Persone");
	Label lCapienzaAutobus= new Label ("Autobus Necessari");
	Label lAutobusNecessari= new Label ("Capienza Aoutobus");
	Label lCostoPersona= new Label ("Costo a Persona");
	Label lRisultatoAutobus= new Label ();
	Label lRisultatoCosto= new Label ();
	
	TextField tfNumeroPersone = new TextField ();
	TextField tfCostoAutobus = new TextField ();
	TextField tfCapienzaAutobus = new TextField ();
	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(lNumeroPersone, 0, 0); 
		principale.add(lAutobusNecessari, 0, 1); 
		principale.add(lCostoAutobus, 0, 2); 
		principale.add(lCapienzaAutobus, 0, 3); 
		principale.add(lCostoPersona, 0, 4); 
		principale.add(lRisultatoAutobus, 1, 3); 
		principale.add(lRisultatoCosto, 1, 4); 
		principale.add(tfNumeroPersone, 1, 0); 
		principale.add(tfCapienzaAutobus, 1, 1); 
		principale.add(tfCostoAutobus, 1, 2);
		
		
		Scene scena = new Scene(principale);
		finestra.setTitle("Agenzia Viaggi");
		finestra.setScene(scena);
		finestra.show();
		
		tfCostoAutobus.setOnAction( e -> eseguiCosto ());
		
	}
	
	private void eseguiCosto() {
		string risultatoCosto; 
		int costoAutobus, numeroPersone, capienzaAutobus;
		double  autobusNecessari, costoPersona;
		
		numeroPersone = Integer.parseInt(tfNumeroPersone.getText());
		capienzaAutobus = Integer.parseInt(tfCapienzaAutobus.getText());
		costoAutobus = Integer.parseInt(tfCostoAutobus.getText());
		
		
	
		autobusNecessari= (capienzaAutobus / numeroPersone);
			lRisultatoAutobus.setText("" + autobusNecessari);
		
		if(numeroPersone % capienzaAutobus !=0) {
			autobusNecessari++;
		}
		
		costoPersona=costoAutobus / numeroPersone;
		risultatoCosto = "" + costoPersona;
		lRisultatoCosto.setText(risultatoCosto);
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
