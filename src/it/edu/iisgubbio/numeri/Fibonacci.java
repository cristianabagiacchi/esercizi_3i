package it.edu.iisgubbio.numeri;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Fibonacci extends Application{
	
	Label lNumeri = new Label ("n:");
	TextField tfNumeri = new TextField ();
	Button bCalcola = new Button("Calcola");
	Label lFin = new Label ("Fib(n)");
	Label lRisultato = new Label ("???");
	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane ();
		principale.add(lNumeri,0,0);
		principale.add(tfNumeri,1,0);
		principale.add(bCalcola,0,1);
		principale.add(lFin,0,2);
		principale.add(lRisultato,1,2);
			
		Scene scena = new Scene(principale);
		finestra.setTitle("Fibonacci");
		finestra.setScene(scena);
		finestra.show(); 
			
		principale.getStyleClass().add("principale");
	
		bCalcola.setOnAction( e -> eseguiCalcolo() );

	}
	int fibonacci(int n) {
		if(n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		} else {
			return fibonacci(n-2)+fibonacci(n-1);
		}
	}
	private void eseguiCalcolo() {
		int numero;
		numero= Integer.parseInt(tfNumeri.getText());
		int f=fibonacci(numero);
		
		lRisultato.setText(""+f);
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
	
