package it.edu.iisgubbio.rombo;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Rombo extends Application{

	TextField cDiagonaleMaggiore = new TextField ();
	TextField cDiagonaleMinore= new TextField ();
	Button pArea = new Button("Area");
	Button pPerimetro = new Button("Perimetro");
	Label eDiagonaleMaggiore = new Label ("Diagonale Maggiore");
	Label eDiagonaleMinore = new Label ("Diagonale Minore");
	Label eRisultatoArea = new Label ();
	Label eRisultatoPerimetro = new Label ();
	
	

	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(eDiagonaleMaggiore, 0, 0);
		principale.add(cDiagonaleMaggiore, 1, 0);
		
		principale.add(eDiagonaleMinore, 0, 1);
		principale.add(cDiagonaleMinore, 1, 1);
	
		principale.add(pArea, 0, 2);
		principale.add(pPerimetro, 0, 3);
		
		principale.add(eRisultatoArea, 1, 2);
		principale.add(eRisultatoPerimetro, 1, 3);
		
		Scene scena = new Scene(principale);
		finestra.setTitle("Rombo");
		finestra.setScene(scena);
		finestra.show();
	
		pArea.setOnAction( e -> eseguiArea ());
		pPerimetro.setOnAction( e -> eseguiPerimetro ());
	}


	private Object eseguiPerimetro() {
		// TODO Auto-generated method stub
		return null;
	}


	private void eseguiArea() {
		String  testoArea, testoPerimetro;
		int diagonaleMaggiore,diagonaleMinore,area;
		double perimetro;
	
	
		diagonaleMaggiore = Integer.parseInt(cDiagonaleMaggiore.getText());
		diagonaleMinore = Integer.parseInt(cDiagonaleMinore.getText());
		area = diagonaleMaggiore * diagonaleMinore / 2;
		testoArea = "" + area;
		eRisultatoArea.setText(testoArea);
		perimetro = Math.sqrt ((diagonaleMaggiore /2)^2 + (diagonaleMinore /2)^2);
		testoPerimetro = "" + perimetro;
		eRisultatoPerimetro.setText(testoPerimetro);
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
