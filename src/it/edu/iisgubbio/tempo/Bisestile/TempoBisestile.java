package it.edu.iisgubbio.tempo.Bisestile;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TempoBisestile extends Application {

	TextField tfAnno = new TextField ();
	TextField tfRisultato = new TextField ();
	Button bControlla = new Button("Controlla");
	Label lAnno = new Label ("Anno");
	
	CheckBox Bisestile = new CheckBox();
	

	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(lAnno, 0, 0);
		principale.add(tfAnno, 1, 0);
		
		principale.add(bControlla, 0, 1, 2, 1);
		bControlla.setMaxWidth(Integer.MAX_VALUE);
		
		principale.add(tfRisultato, 0, 2, 2, 1);
		bControlla.setMaxWidth(Integer.MAX_VALUE);
		
		Scene scena = new Scene(principale);
		finestra.setTitle("Bisestile");
		finestra.setScene(scena);
		finestra.show();
		
		bControlla.setOnAction( e -> eseguiControllo ());
		
	}
	
	private void eseguiControllo() {
		int anno, risultato ;
		
		anno=Integer.parseInt(tfAnno.getText());
		risultato=Integer.parseInt(tfRisultato.getText());
		

	}
}
