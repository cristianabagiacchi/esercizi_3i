package it.edu.iisgubbio.negozi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class NegoziInteressi extends Application{
	
	TextField tfCapitale = new TextField ();
	TextField tfAnni = new TextField ();
	TextField tfInteressi = new TextField ();
	Label lCapitale = new Label ("Capitale");
	Label lAnni = new Label ("Anni");
	Label lInteressi = new Label ("Interessi");
	Label lRisultato = new Label ("Risultato");
	Button bCalcola = new Button("Calcola");
	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(lCapitale, 0, 0); 
		principale.add(lAnni, 0, 1); 
		principale.add(lInteressi, 0, 2); 
		
		principale.add(tfCapitale, 1, 0); 
		principale.add(tfAnni, 1, 1); 
		principale.add(tfInteressi, 1, 2);
		principale.add(lRisultato, 1, 3);
		
		principale.add(bCalcola, 0, 3); 
		
		Scene scena = new Scene(principale);
		finestra.setTitle("Interessi");
		finestra.setScene(scena);
		finestra.show();
		
		bCalcola.setOnAction( e -> eseguiCalcolo ());
	}
	
	private void eseguiCalcolo(){
		String risultato1;
		int anni, interessi;
		double interessiAnnui,capitale;
		
		capitale = Double.parseDouble(tfCapitale.getText());
		anni = Integer.parseInt(tfAnni.getText());
		interessi = Integer.parseInt(tfInteressi.getText());
		

		for(int x=1;x<=anni;x+=1) {
			interessiAnnui=capitale/100*interessi;
			capitale=capitale+interessiAnnui;
			
		}
		
		risultato1=""+capitale;
		lRisultato.setText(risultato1);
		
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
