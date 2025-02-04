package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Impiccato extends Application {
	
	TextField tfParola = new TextField();
	Button bVia = new Button("Via");
	Button bProva = new Button("Prova");
	Label lLettera = new Label("Lettera");
	TextField tfRisultato = new TextField();
	Label lRisposta = new Label("???");
	Label lTentativi = new Label("Tentativi:");
	
	char c[];
	char soluzione[];
	int tentativi=7;

	public void start(Stage finestra) throws Exception {
		
		Canvas tela = new Canvas(500, 500);
		GraphicsContext gc = tela.getGraphicsContext2D();
		
		GridPane principale = new GridPane();
		
		
		principale.add(tfParola, 0, 0, 2, 1);
		tfParola.setMaxWidth(Integer.MAX_VALUE);
		principale.add(bVia, 2, 0);
		principale.add(lLettera, 0, 1);
		principale.add(tfRisultato, 1, 1);
		principale.add(bProva, 2, 1); 
		principale.add(lRisposta, 1, 2);
		principale.add(lTentativi, 1, 3);
		
		principale.add(tela, 0, 0);

	
		Scene scena = new Scene(principale);
		finestra.setTitle("Indovina la parola");
		finestra.setScene(scena);
		finestra.show();
		
		principale.getStyleClass().add("principale");

		bVia.setOnAction(e -> eseguiVia());
		bProva.setOnAction(e -> eseguiProva());
	}

	private void eseguiVia() {
		String parola = tfParola.getText();
		c = parola.toCharArray();
		soluzione = parola.toCharArray();

		for (int i = 1; i < c.length - 1; i++) {
			c[i] = '-';
		}
		String testo = new String(c);
		tfParola.setText(testo);
	}

	private void eseguiProva() {
		int contatore=0;
		boolean trova=false;
		
		char lettera = tfRisultato.getText().charAt(0);
		for(int i=0; i<c.length; i++) {
			if(lettera==soluzione[i]) {
				c[i]=soluzione[i];
				trova=true;
			}
		}
		
		if(trova==false) {
			tentativi--;
			lTentativi.setText(tentativi +" tentativi: "+ lettera+ " sbagliata");
		}
		if(tentativi==0) {
			lRisposta.setText("hai perso!");
			bProva.setDisable(true);
		}
		
		
		String testo= new String (c);
		tfParola.setText(testo);
		
		for (int i = 1; i < c.length-1; i++) {
				if(c[i]=='-' ) {
					contatore++;
				}
		}
		if(contatore==0) {
			lRisposta.setText("hai vinto!");
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}
