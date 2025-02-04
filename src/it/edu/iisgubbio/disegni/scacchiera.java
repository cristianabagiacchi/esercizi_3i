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


public class scacchiera extends Application{
		
	Canvas tela = new Canvas(400, 400);
	GraphicsContext gc = tela.getGraphicsContext2D();
	
	Button bDisegna= new Button("Disegna");
	Label lDimensione= new Label("Dimensione");
	TextField tfDimensione = new TextField ();
	
	
public void start(Stage primaryStage) {
		
		GridPane pannello = new GridPane();

	    pannello.add(lDimensione, 0, 0);
	    pannello.add(tfDimensione, 1, 0);
	    pannello.add(bDisegna, 2, 0);
	    
	    pannello.add(tela, 0, 1, 3, 1);

	    Scene scene = new Scene(pannello);
	    primaryStage.setTitle("Scacchiera");
	    primaryStage.setScene(scene);
	    primaryStage.show();
	    
	    bDisegna.setOnAction( e -> eseguiDisegna ());
	}

	private void eseguiDisegna() {
		double dimensione;
	
		dimensione= Double.parseDouble(tfDimensione.getText());
		 gc.setFill(Color.PINK);
	
		for(double y=0;y<=400;y+=dimensione+1) {
			for(double x=0;x<=400; x+=dimensione+1) {

				 gc.fillRect(x, y, dimensione, dimensione);
		}
			 

	
			 

	  
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}



