package it.edu.iisgubbio.verifica.traingolo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class VerificaTriangolo extends Application {


	TextField tfLato1 = new TextField ();
	TextField tfLato2= new TextField ();
	TextField tfLato3= new TextField ();
	Button bControlla = new Button("Controlla");
	Button bTipo = new Button("Tipo");
	Label lLato1 = new Label ("lato1");
	Label lLato2 = new Label ("Lato2");
	Label lLato3 = new Label ("Lato3");
	Label lRisultato = new Label ("Risultato");
	Label lEtichetta1 = new Label ("?1");
	Label lEtichetta2= new Label ("?2");
	
	CheckBox ControlloTriangolo = new CheckBox();



	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(lLato1, 0, 0);
		principale.add(tfLato1, 1, 0);
		
		principale.add(lLato2, 0, 1);
		principale.add(tfLato2, 1, 1);
		
		principale.add(lLato3, 0, 3);
		principale.add(tfLato3, 1, 3);
		
		principale.add(bTipo, 4, 0, 1, 2);
		bTipo.setMaxHeight(Integer.MAX_VALUE);
		principale.add(lEtichetta1, 4, 2);
		principale.add(lEtichetta2, 4, 3);
		
		principale.add(lRisultato, 1, 4, 1 , 4);
		lRisultato.setMaxHeight(Integer.MAX_VALUE);
		
		principale.add(bControlla, 2, 0, 1, 3);
		bControlla.setMaxHeight(Integer.MAX_VALUE);
		
		Scene scena = new Scene(principale);
		finestra.setTitle("Triangolo?");
		finestra.setScene(scena);
		finestra.show();
		
		bControlla.setOnAction( e -> eseguiControllo ());
		
	}

	private void eseguiControllo() {
		int lato1, lato2, lato3 ;
		
		lato1= Integer.parseInt(tfLato1.getText());
		lato2 = Integer.parseInt(tfLato2.getText());
		lato3 = Integer.parseInt(tfLato3.getText());
		
		if(lato1+lato2>lato3 && lato2+lato3>lato1 && lato3+lato1>lato2) {
	         
	         lRisultato.setText ("Formano un triangolo!");
		}
	    else {
	    	lRisultato.setText("Non formano un triangolo");
	    }

	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
	