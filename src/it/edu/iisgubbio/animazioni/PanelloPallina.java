package it.edu.iisgubbio.animazioni;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PanelloPallina extends Application {
	
	TextField dimensione = new TextField ();
	int x = 30;

	
	Circle cerchio = new Circle(20); // 20 è il raggio

	  public void start(Stage primaryStage) throws Exception {
		  
	    
	    Pane areaDiGioco = new Pane();
	    ((GridPane) areaDiGioco).add(dimensione, 0, 0); 
	    areaDiGioco.setPrefSize(300, 300);
	    
		
		Scene scene = new Scene(areaDiGioco,200,100);
		primaryStage.setTitle("Tela Pallina"); 
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Timeline timeline = new Timeline(new KeyFrame(
			Duration.seconds(0.01), // ogni quanto va chiamata la funzione
			x -> aggiornaTimer()));
		
		timeline.setCycleCount(100000);
		timeline.play();
        
        cerchio.setCenterX(30);
        cerchio.setCenterY(30);
        cerchio.setFill( Color.PINK );
        areaDiGioco.getChildren().add(cerchio);

	  }

	  private void aggiornaTimer(){

		cerchio.setCenterX(x);
		x++;
		cerchio.resize(x, x);
		  
	  }
	    
	  public static void main(String args[]){
	    launch();
	  }
	}
	
