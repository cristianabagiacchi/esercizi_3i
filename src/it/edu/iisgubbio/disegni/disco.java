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


public class disco  extends Application {
	
	Button bAggiungi= new Button("Aggiungi");
	int x=0;
	int y=0;
	
	Canvas tela = new Canvas(400, 400);
	GraphicsContext gc = tela.getGraphicsContext2D();

	public void start(Stage primaryStage) {
		
		GridPane pannello = new GridPane();

	    pannello.add(bAggiungi, 0, 0);
	    
	    pannello.add(tela, 0, 1, 4, 1);

	    Scene scene = new Scene(pannello);
	    primaryStage.setTitle("Disco");
	    primaryStage.setScene(scene);
	    primaryStage.show();
	    
	    bAggiungi.setOnAction( e -> eseguiAggiungi ());
	}
	
	private void eseguiAggiungi() {

		x+=20;
		
		gc.setFill(Color.PINK);
		
		gc.fillOval(x, y, 15, 15);
		
		if(x==300) {
			x=0;
			y+=30;
			
		}
		
		
		
		
		
	    	

	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
