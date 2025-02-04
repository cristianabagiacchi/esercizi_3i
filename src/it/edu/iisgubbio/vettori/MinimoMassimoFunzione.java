package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class MinimoMassimoFunzione extends Application{
	Label lNumero = new Label();

	TextField tNumeri = new TextField();

	Button bMinimo = new Button("Minimo");
	Button bMassimo = new Button("Massimo");

	public void start(Stage finestra) throws Exception {

		GridPane principale = new GridPane(); 

		principale.add(bMinimo, 0,1);
		principale.add(lNumero, 0,2 ,2,1);
		principale.add(tNumeri, 0, 0,2,1);
		principale.add(bMassimo, 1, 1);

		Scene scena = new Scene(principale);

		finestra.setTitle("RL");
		finestra.setScene(scena);
		finestra.show();

		bMinimo.setOnAction(e->eseguiMinimo());
		bMassimo.setOnAction(e->eseguiMassimo());
	}
	
	int[] testoNumeri (String testo) {
		String parti[];
		int vettoreNumeri[];
		parti= testo.split(" ");
		vettoreNumeri= new int[parti.length];
		for(int i=0;i<parti.length;i++) {
			vettoreNumeri[i]= Integer.parseInt(parti[i]);
		}
		return vettoreNumeri;
	}
	private void eseguiMinimo() {
		String x;
		int minimo, vettoreNumeri[];
		
		x = tNumeri.getText();
		vettoreNumeri= testoNumeri(x);
		
		minimo=vettoreNumeri[0];
		
		for(int i=1;i<vettoreNumeri.length;i++) {
			if(vettoreNumeri[i]<minimo) {
				minimo=vettoreNumeri[i];
			}
		}
		lNumero.setText(minimo+"");
	}
	private void eseguiMassimo(){
		String x;
		int massimo, vettoreNumeri[];
		
		x = tNumeri.getText();
		vettoreNumeri= testoNumeri(x);
		
		massimo=vettoreNumeri[0];
		
		for(int i=1;i<vettoreNumeri.length;i++) {
			if(vettoreNumeri[i]>massimo) {
				massimo=vettoreNumeri[i];
			}
		}
		lNumero.setText(massimo+"");
	}
	public static void main(String[] args) {
		launch(args);
	}
}
