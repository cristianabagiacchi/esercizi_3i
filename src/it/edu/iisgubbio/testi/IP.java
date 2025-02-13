package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class IP extends Application{
	
	Button bVerifica = new Button("Verifica");
	Label lIndirizzo = new Label("Indirizzo");
	TextField tfNumeri = new TextField();
	Label lRisultato = new Label("???");
	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(lIndirizzo, 0, 0);
		principale.add(tfNumeri, 1, 0);
		principale.add(bVerifica, 0, 1);
		principale.add(lRisultato, 1, 1);
		

		Scene scena = new Scene(principale);
		finestra.setTitle("IP");
		finestra.setScene(scena);
		finestra.show();

		principale.getStyleClass().add("principale");
		
		bVerifica.setOnAction(e -> eseguiVerifica());
	
	}
	
	private void eseguiVerifica() {
		
		
		String testo;
		testo=tfNumeri.getText();
		String parti[];
		parti=testo.split("\\.");
		int numeri[]=new int[parti.length];
		
		for(int i=0;i<parti.length;i++) {
			numeri[i]=Integer.parseInt(parti[i]);
		}

		if(parti.length==4) {

			boolean valido=true;

			for(int i=0;i<parti.length;i++) {

				if(numeri[i]>=255 || numeri[i]<=0) {
					valido=false;
				}
				if(valido==false) {
					lRisultato.setText("l'indirizzo non è valido");
				}else {
					lRisultato.setText("l'indirizzo è valido");
				}
			}	}else {
			lRisultato.setText("l'indirizzo è errato");
		}

	}
		


	public static void main(String[] args) {
		launch(args);
	}

}
