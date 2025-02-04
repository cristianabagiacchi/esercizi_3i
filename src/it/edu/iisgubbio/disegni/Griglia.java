package it.edu.iisgubbio.disegni;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;



public class Griglia extends Application{
	
	Button bDisegna= new Button("Disegna");
	Button bPulisci= new Button("Pulisci");
	Label lDistanza= new Label("Distanza");
	TextField tfDistanza = new TextField ();
	
	Canvas tela = new Canvas(300, 300);
	GraphicsContext gc = tela.getGraphicsContext2D();

	public void start(Stage primaryStage) {
		


		
		GridPane pannello = new GridPane();

	    pannello.add(lDistanza, 0, 0);
	    pannello.add(tfDistanza, 1, 0);
	    pannello.add(bDisegna, 2, 0);
	    pannello.add(bPulisci, 3, 0);
	    
	    pannello.add(tela, 0, 1, 4, 1);

	    Scene scene = new Scene(pannello);
	    primaryStage.setTitle("Griglia");
	    primaryStage.setScene(scene);
	    primaryStage.show();
	    
	    bDisegna.setOnAction( e -> eseguiDisegna ());
	    bPulisci.setOnAction( e -> eseguiPulisci());
	}
	
	private void eseguiDisegna() {
		int distanza;
		
		distanza= Integer.parseInt(tfDistanza.getText());
	    gc.setStroke(Color.PINK);
	    gc.setLineWidth(5);
		
		for(int x=0;x<=300; x+=distanza) {

		    gc.strokeLine(x,1,x,300);
		    
		    gc.strokeLine(1,x,300,x); //linee orizontali.
		}
		
	}
	
	private void eseguiPulisci() {
		
		 gc.setFill(Color.WHITE);
		 gc.fillRect(0, 0, 600, 600);
		 
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
