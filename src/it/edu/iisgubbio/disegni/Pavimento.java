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

public class Pavimento extends Application {
	
	Button bDisegna= new Button("Disegna");
	
	Canvas tela = new Canvas(400, 400);
	GraphicsContext gc = tela.getGraphicsContext2D();

	public void start(Stage primaryStage) {
		
		GridPane pannello = new GridPane();

	    pannello.add(bDisegna, 0, 3);
	    
	    pannello.add(tela, 0, 1, 4, 1);

	    Scene scene = new Scene(pannello);
	    primaryStage.setTitle("Serie di Pallini");
	    primaryStage.setScene(scene);
	    primaryStage.show();
	    
	    bDisegna.setOnAction( e -> eseguiDisegna ());
	}
	
	private void eseguiDisegna() {

		
		int dimensione;
		dimensione=10;
		
		
		for(double y=0;y<=400;y+=dimensione+1) {
			for(double x=0;x<=400; x+=dimensione+1) {
				
				double  z=Math.random();
				if(z>0.5) {
					
					gc.setFill(Color.BLUE);
				}else {
					gc.setFill(Color.PINK);
				}

				 gc.fillRect(x, y, dimensione, dimensione);
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
