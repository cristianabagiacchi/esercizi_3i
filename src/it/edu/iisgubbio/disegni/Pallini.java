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


public class Pallini extends Application{
	

	Button bVai= new Button("Vai");
	Label lNumero= new Label("Numero");
	TextField tfNumero = new TextField ();
	
	Canvas tela = new Canvas(400, 400);
	GraphicsContext gc = tela.getGraphicsContext2D();

	public void start(Stage primaryStage) {
		
		GridPane pannello = new GridPane();

	    pannello.add(lNumero, 0, 0);
	    pannello.add(tfNumero, 1, 0);
	    pannello.add(bVai, 2, 0);
	    
	    pannello.add(tela, 0, 1, 4, 1);

	    Scene scene = new Scene(pannello);
	    primaryStage.setTitle("Serie di Pallini");
	    primaryStage.setScene(scene);
	    primaryStage.show();
	    
	    bVai.setOnAction( e -> eseguiVai ());
	}
	
	private void eseguiVai() {
		int numero;
		
		numero= Integer.parseInt(tfNumero.getText());
		gc.setFill(Color.PINK);
		int riga=1;
	    for(int y=numero;y>=0;y++){
	    	
	    	for(int x=0;x<numero; x++ ) {
				
	    		gc.fillOval(x*20, riga*20, 15, 15);
				
	    	}
	    	riga++;
	    	numero--;
	    }
	}
	
	public static void main(String[] args) {
		launch(args);
	}


}
