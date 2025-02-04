package it.edu.iisgubbio.disegni;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Disegno extends Application{
	
	Button bClik= new Button("Clik");
	Canvas tela = new Canvas(400, 300);
	GraphicsContext gc = tela.getGraphicsContext2D();
	
	
	public void start(Stage primaryStage) {

	    gc.setFill(Color.RED);
	    gc.setLineWidth(1);
	    gc.fillOval(0, 0, 150, 150);
	   
	    gc.setFill(Color.BLUE);
	    gc.setLineWidth(1);
	    gc.fillOval(300, 200, 100, 100);
	    
	    gc.setStroke(Color.GREEN);
	    gc.setLineWidth(20);
	    gc.strokeLine(400, 0, 0, 300);
	    
	    gc.setStroke(Color.ORANGE);
	    gc.setLineWidth(1);
	    gc.strokeOval(200, 0, 200, 50);
	    
	    

	    
	    GridPane pannello = new GridPane();
	    pannello.add(tela, 0, 0);
	    pannello.add(bClik, 0, 0);

	    Scene scene = new Scene(pannello);
	    primaryStage.setTitle("Hello Canvas!");
	    primaryStage.setScene(scene);
	    primaryStage.show();
	    
	    bClik.setOnAction( e -> esegui ());
	  }
	private void esegui() {
		gc.setFill(Color.BLACK);
		gc.fillOval(25, 25, 100, 100);
	
	}
	
	  public static void main(String[] args) {
			launch(args);
		}
	
	
}
