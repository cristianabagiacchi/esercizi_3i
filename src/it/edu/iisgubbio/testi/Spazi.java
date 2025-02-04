package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Spazi extends Application{
	
	Button bCompatta = new Button("Compatta");
	Button bEspandi = new Button("Espandi");
	Label lFrase = new Label("Frase");
	TextField tfFrase = new TextField();
	TextField tfRisultato = new TextField();
	TextField tfEspandi = new TextField();
	TextField lEspandi = new TextField();
	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(tfFrase, 1, 0, 2, 1);
		tfFrase.setMaxWidth(Integer.MAX_VALUE);
		principale.add(lFrase, 0, 0);
		principale.add(bCompatta, 0, 1);
		bCompatta.setMaxWidth(Integer.MAX_VALUE);
		principale.add(tfRisultato, 1, 1, 2,1);
		tfRisultato.setMaxWidth(Integer.MAX_VALUE);
		principale.add(bEspandi, 1, 2);
		bEspandi.setMaxWidth(Integer.MAX_VALUE);
		principale.add(tfEspandi, 0, 2);
		principale.add(lEspandi, 2, 2);
		

		Scene scena = new Scene(principale);
		scena.getStylesheets().add("it/edu/iisgubbio/testi/spazi/spazi.css");
		
		finestra.setTitle("Spazi");
		finestra.setScene(scena);
		finestra.show();

		principale.getStyleClass().add("principale");
		
		bCompatta.setOnAction(e -> eseguiCompatta());
		bEspandi.setOnAction(e -> eseguiEspandi());
		
	}
	
	private void eseguiCompatta() {
		
		int contatoreLettere=0;
		int conta=0;
		
		
		String parola = tfFrase.getText();
		char[] originale = parola.toCharArray();
		
		
		for (int i = 0; i < originale.length; i++) {
			if(originale[i]!=' ') {
				contatoreLettere++;
			}
		}
		char[] compresso = new char[contatoreLettere];
		
		for (int i = 0; i < originale.length; i++) {
			if(originale[i] != ' ') {
			compresso[conta]=originale[i];
			conta++;
			}
		}
		
		String risultato= new String (compresso);
		tfRisultato.setText(risultato);
	}
	
	private void eseguiEspandi() {
		char frase[]=tfFrase.getText().toCharArray();
		int lunghezza=Integer.parseInt(tfFrase.getText());
		char espanso[]=new char[lunghezza];
		int spaziDaAggiungereTotale=lunghezza-frase.length;
		System.out.println(spaziDaAggiungereTotale);
		int numeroSpazi=0;
		
		for(int i=0;i<frase.length;i++) {
			if(frase[i]==' ') {
				numeroSpazi++;
			}
		}
		int spazidaAggiungere= spaziDaAggiungereTotale/ numeroSpazi;
		int spaziAvanzati=spaziDaAggiungereTotale % numeroSpazi;
		
		int indiceEspanso=0;
		
		for(int indiceFrase=0;indiceFrase<frase.length;indiceFrase++) {
			espanso[indiceEspanso]=frase[indiceFrase];
			
			indiceEspanso++;
			
			if(frase[indiceFrase]==' ') {
				
				for(int i=0;i<spazidaAggiungere;i++) {
					espanso[indiceEspanso]='#';
					indiceEspanso++;
				}
				if(spaziAvanzati > 0) {
					espanso[indiceEspanso]='#';
					indiceEspanso++;
					spaziAvanzati--;
				}
			}
		}

		String allungato= new String(espanso);
		lEspandi.setText(allungato);
	}
	
	String allungato= new String(espanso);
	tfEspanso.setText(allungato);
	
	public static void main(String[] args) {
		launch(args);
	}

}
	
	
