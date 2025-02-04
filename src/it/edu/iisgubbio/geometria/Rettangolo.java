package it.edu.iisgubbio.geometria;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Rettangolo extends Application{



	TextField cBase = new TextField ();
	TextField cAltezza = new TextField ();
	Button pArea = new Button("Area");
	Label eBase = new Label ("Base");
	Label eAltezza = new Label ("Altezza");
	Label eRisultato = new Label ();



	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(eBase, 0, 0); // FIXME
		principale.add(cBase, 1, 0);
	
		principale.add(eAltezza, 0, 1);
		principale.add(cAltezza, 1, 1);
	
		principale.add(pArea, 1, 2);
	
		principale.add(eRisultato, 1, 3);
	
				
		Scene scena = new Scene(principale);
		finestra.setTitle("Area Quadrato");
		finestra.setScene(scena);
		finestra.show();
	
		pArea.setOnAction( e -> eseguiAreaQuadrato ());
	}

	private void eseguiAreaQuadrato() {
		String testoBase, testoAltezza, testoArea;
		int base,altezza,area;
	
		testoBase = cBase.getText();
		testoAltezza = cAltezza.getText();
		base = Integer.parseInt(testoBase);
		altezza = Integer.parseInt(testoAltezza);
		area = base * altezza;
		testoArea = "" + area;
		eRisultato.setText(testoArea);
	}
	public static void main(String[] args) {
		launch(args);
	}

}