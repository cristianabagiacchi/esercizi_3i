package it.edu.iisgubbio.pong.pong;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Racchette extends Application{
	
	static final int DIMENSIONE_X =400;
	static final int DIMENSIONE_Y =400;
	
	static final int DIMENSIONE_X_RACCHETTA =20;
	static final int DIMENSIONE_Y_RACCHETTA =100;
	
	Rectangle RacchettaSinistra = new Rectangle(DIMENSIONE_X_RACCHETTA,DIMENSIONE_Y_RACCHETTA);
	int ySinistra=40;
	Rectangle RacchettaDestra = new Rectangle(20,100);
	int yDestra =40;
	int xDestra =380;
	
	public void start(Stage primaryStage) throws Exception {  
		    
	Pane areaDiGioco = new Pane();
	
	areaDiGioco.setPrefSize(DIMENSIONE_X, DIMENSIONE_Y);
	areaDiGioco.getChildren().add(RacchettaDestra);
	RacchettaDestra.setY(yDestra);
	RacchettaDestra.setX(xDestra);
	areaDiGioco.getChildren().add(RacchettaSinistra);
	RacchettaSinistra.setY(ySinistra);
	
	Scene scene = new Scene(areaDiGioco,DIMENSIONE_X, DIMENSIONE_Y);
	primaryStage.setTitle("Tela Pallina"); 
	primaryStage.setScene(scene);
	primaryStage.show();
	
	scene.setOnKeyPressed(e -> tastoPremuto(e));
	
	}
	
	private void tastoPremuto(KeyEvent tasto){
		System.out.println(tasto.getText());
		
		if(tasto.getText().equals("s")) {
			ySinistra=ySinistra+5;
		}
		
		if(tasto.getText().equals("w")) {
			ySinistra=ySinistra-5;
		}
		
		if(ySinistra > DIMENSIONE_Y - DIMENSIONE_Y_RACCHETTA) {
			ySinistra=DIMENSIONE_Y - DIMENSIONE_Y_RACCHETTA;
		}
		
		if(ySinistra<0) {
			ySinistra=0;
		}
		
		RacchettaSinistra.setY(ySinistra);
		
		if(tasto.getCode()==KeyCode.DOWN) {
			yDestra=yDestra+5;
		}
		
		if(tasto.getCode()==KeyCode.UP) {
			yDestra=yDestra-5;
		}
		
		if(yDestra > DIMENSIONE_Y - DIMENSIONE_Y_RACCHETTA) {
			yDestra=DIMENSIONE_Y - DIMENSIONE_Y_RACCHETTA;
		}
		
		if(yDestra<0) {
			yDestra=0;
		}
		RacchettaDestra.setY(yDestra);
		
	}
	public static void main(String args[]){
		launch();
	}
}
