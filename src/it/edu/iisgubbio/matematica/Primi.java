package it.edu.iisgubbio.matematica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Primi  extends Application  {
	
	TextField tfNumero = new TextField ();
	Label lPrimi = new Label ();
	Label lNumero = new Label ("Numero");
	Button bDivisori = new Button("Numero Primo?");
	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(lNumero, 0, 0); 
		principale.add(tfNumero, 1, 0); 
		principale.add(bDivisori, 2, 0);
		principale.add(lPrimi, 0, 1, 2, 1);
		lPrimi.setMaxWidth(Integer.MAX_VALUE);
		
		Scene scena = new Scene(principale);
		finestra.setTitle("Tabellina");
		finestra.setScene(scena);
		finestra.show();
		
		bDivisori.setOnAction( e -> eseguiDivisori ());
		
	}
	
	private void eseguiDivisori() {
		String sequenza, virgola;
		int numero;
		
		numero= Integer.parseInt(tfNumero.getText());
		
		sequenza="";
		virgola=", ";
		boolean primo=true;
		
		for(int x=2; x<numero; x++) {
			
			if(numero%x==0) {
				primo=false;
				
			}else{
				lPrimi.setText("non è un numero primo");
			}
		}
		if (primo){
			lPrimi.setText("il numero è primo");
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}