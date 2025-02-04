package it.edu.iisgubbio.pong.pong;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Rimbalzo extends Application{
		
	double x = 20;
	double y = 20;
	double incrementox = Math.random();
	double incrementoy = Math.random();
	static final int DIMENSIONE_X =400;
	static final int DIMENSIONE_Y =400;

	Circle cerchio = new Circle(20);
	public void start(Stage primaryStage) throws Exception {  
		    
	Pane areaDiGioco = new Pane();
	
	areaDiGioco.setPrefSize(DIMENSIONE_X, DIMENSIONE_Y);
	
	Scene scene = new Scene(areaDiGioco,DIMENSIONE_X, DIMENSIONE_Y);
	primaryStage.setTitle("Tela Pallina"); 
	primaryStage.setScene(scene);
	primaryStage.show();
			
	Timeline timeline = new Timeline(new KeyFrame(
		Duration.seconds(0.001), // ogni quanto va chiamata la funzione
		x -> aggiornaTimer()));
			
	timeline.setCycleCount(Timeline.INDEFINITE);
	timeline.play();
	        
	cerchio.setFill(Color.PINK);
	cerchio.setCenterX(20);
	cerchio.setCenterY(40);
	areaDiGioco.getChildren().add(cerchio);

	}
	boolean avanti=true;
	private void aggiornaTimer(){
			
	x = x + incrementox;
	y = y + incrementoy;
	if (x >= DIMENSIONE_X-20) {
	   incrementox = -Math.random();
	}
	        
	 if (x <= 20) {
	   incrementox = Math.random();

	 }
	if (y >= DIMENSIONE_Y-20) {
		incrementoy = -Math.random();
	 }
			        
	if (y <= 20) {
		incrementoy = Math.random();
		}
	 
	 cerchio.setCenterX(cerchio.getCenterX()+incrementox);
	 cerchio.setCenterY(cerchio.getCenterY()+incrementoy);
		  
	}
		    
	public static void main(String args[]){
		launch();
	}
}

