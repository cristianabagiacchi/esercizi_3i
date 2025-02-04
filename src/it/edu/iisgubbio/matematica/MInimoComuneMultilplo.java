package it.edu.iisgubbio.matematica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MInimoComuneMultilplo extends Application {
	
	TextField tfNumero1 = new TextField ();
	TextField tfNumero2 = new TextField ();
	Label lNumero1 = new Label ("Numero1");
	Label lNumero2 = new Label ("Numero2");
	Label lRisultato = new Label ("???");
	Button bMCM = new Button("MCM");
	
	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(lNumero1, 0, 0); 
		principale.add(tfNumero1, 1, 0); 
		
		principale.add(lNumero2, 0, 1); 
		principale.add(tfNumero2, 1, 1);
		
		
		principale.add(bMCM, 0, 2);
		principale.add(lRisultato, 1, 2);
		
		
		Scene scena = new Scene(principale);
		scena.getStylesheets().add("it/edu/iisgubbio/matematica/MInimoComuneMultiplo/stile.css");
		finestra.setTitle("Minimo Comune Multiplo");
		finestra.setScene(scena);
		finestra.show();
		
		bMCM.setOnAction( e -> eseguiMCM ());
		
	}
	
	private void eseguiMCM() {
		int numero1, numero2, mcm;
		
		numero1= Integer.parseInt(tfNumero1.getText());
		numero2= Integer.parseInt(tfNumero2.getText());
		
		mcm=1;
		
		while(mcm%numero1!=0 || mcm%numero2!=0) {
			mcm++;
		}
		lRisultato.setText("è "+mcm);

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
