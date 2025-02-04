package it.edu.iisgubbio.equazione;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Equazione  extends Application{
	TextField tfA = new TextField ();
	TextField tfB = new TextField ();
	TextField tfC = new TextField ();
	TextField tfX1 = new TextField ();
	TextField tfX2 = new TextField ();
	Button bRisolvi = new Button("Risolvi");
	Label lA = new Label ("A");
	Label lB = new Label ("B");
	Label lC = new Label ("C");
	Label lX1 = new Label ("X1");
	Label lX2 = new Label ("X2");
	
	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(lA, 0, 0); 
		principale.add(lB, 0, 1); 
		principale.add(lC, 0, 2);
		
		principale.add(tfA, 1, 0); 
		principale.add(tfB, 1, 1); 
		principale.add(tfC, 1, 2);
		
		principale.add(lX1, 0, 3); 
		principale.add(lX2, 2, 3); 
		
		principale.add(tfX1, 1, 3);
		principale.add(tfX2, 3, 3);
		
		principale.add(bRisolvi, 2, 0, 2, 3);
		bRisolvi.setMaxHeight(Integer.MAX_VALUE);
		bRisolvi.setMaxWidth(Integer.MAX_VALUE);
		
		lA.getStyleClass().add("parametri");
		lB.getStyleClass().add("parametri");
		lC.getStyleClass().add("parametri");
		lX1.getStyleClass().add("incognite");
		lX2.getStyleClass().add("incognite");
		principale.setId("sfondo");
		
		Scene scena = new Scene(principale);
		scena.getStylesheets().add("it/edu/iisgubbio/equazione/stile.css");
		finestra.setTitle("Equazione");
		finestra.setScene(scena);
		finestra.show();
		
		bRisolvi.setOnAction( e -> eseguiEquazione ());
		
	}
	
	private void eseguiEquazione() {
		double a, b, c, x1, x2, delta;
		
		a= Integer.parseInt(tfA.getText());
		b = Integer.parseInt(tfB.getText());
		c = Integer.parseInt(tfC.getText());
		
		delta=(b*b)-(4*a*c);
		
		x1=((b*-1) + Math.sqrt(delta)) /(2*a);
		x2=((b*-1) - Math.sqrt(delta)) /(2*a);
		tfX1.setText(""+x1);
		tfX2.setText(""+x2);
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
