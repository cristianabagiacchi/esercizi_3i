package it.edu.iisgubbio.animazioni;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;



public class TelaPallina extends Application {
	
	Canvas tela = new Canvas(200, 200);
	GraphicsContext gc = tela.getGraphicsContext2D();
	
	int x = 0;


	  public void start(Stage primaryStage) throws Exception {
		  
	    
		GridPane griglia = new GridPane();
		griglia.add(tela, 1,4,1,1);
		
		Scene scene = new Scene(griglia,200,100);
		primaryStage.setTitle("Tela Pallina"); 
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Timeline timeline = new Timeline(new KeyFrame(
			Duration.seconds(0.02), // ogni quanto va chiamata la funzione
			x -> aggiornaTimer()));
		
		timeline.setCycleCount(100);
		timeline.play();
	  }

	  private void aggiornaTimer(){
			
;
			
			gc.setFill(Color.WHITE);
			gc.fillOval(x-1, 0-1, 12,12);
			
			x=x+5;
			
			gc.setFill(Color.PINK);
			gc.fillOval(x, 0, 10, 10);
			
			
			

	  }
	    
	  public static void main(String args[]){
	    launch();
	  }
	}
	


