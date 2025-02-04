package it.edu.iisgubbio.animazioni;

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

public class Rimbalzo extends Application  {
	
	double x = 20;
	double incremento = 4;
	static final int DIMENSIONE_X =800;

	Circle cerchio = new Circle(20);

	  public void start(Stage primaryStage) throws Exception {  
	    
	    Pane areaDiGioco = new Pane();
	    areaDiGioco.setPrefSize(DIMENSIONE_X, 200);
		
		Scene scene = new Scene(areaDiGioco,DIMENSIONE_X,200);
		primaryStage.setTitle("Tela Pallina"); 
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Timeline timeline = new Timeline(new KeyFrame(
			Duration.seconds(0.01), // ogni quanto va chiamata la funzione
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
		
		x = x + incremento;
        if (x >= DIMENSIONE_X-20) {
            incremento = -4;
        }
        
        if (x <= 20) {
            incremento = 4;
        }
        
        cerchio.setCenterX(cerchio.getCenterX()+incremento);
		  
	  }
	    
	  public static void main(String args[]){
	    launch();
	  }
	}
	


