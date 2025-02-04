package it.edu.iisgubbio.geometria;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TriangoloRettangolo extends Application {

	Label eCateto1 = new Label ("Cateto 1");
	Label eCateto2 = new Label ("Cateto 2");
	Label eIpotenusa = new Label ("Ipotenusa");
	TextField cCateto1 = new TextField ();
	TextField cCateto2 = new TextField ();
	TextField cIpotenusa = new TextField ();
	Button pCalcolaCateto1 = new Button("Clcola Cateto 1"); 
	Button pCalcolaCateto2 = new Button("Calcola Cateto 2");
	Button pCalcolaIpotenusa = new Button("Calcola Ipotenusa");
	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane();
		principale.add(eCateto1, 0, 0); 
		principale.add(eCateto2, 0, 1); 
		principale.add(eIpotenusa, 0, 2);
		
		principale.add(cCateto1, 1, 0);
		principale.add(cCateto2, 1, 1); 
		principale.add(cIpotenusa, 1, 2); 
		
		principale.add(pCalcolaCateto1, 2, 0); 
		principale.add(pCalcolaCateto2, 2, 1); 
		principale.add(pCalcolaIpotenusa, 2, 2); 
		
		Scene scena = new Scene(principale);
		finestra.setTitle("Triangolo Rettangolo");
		finestra.setScene(scena);
		finestra.show();
	
		pCalcolaIpotenusa.setOnAction( e -> eseguiCateto1 ());
		pCalcolaCateto1.setOnAction( e -> eseguiCateto2 ());
		pCalcolaCateto2.setOnAction( e -> eseguiIpotenusa ());
		
	}

	private void eseguiCateto1() {
		String Cateto1, Cateto2, Ipotenusa;
		double vCateto1 , vCateto2, vIpotenusa;

		
		Cateto2=cCateto2.getText();
		Ipotenusa=cIpotenusa.getText();
		vIpotenusa=Double.parseDouble(Ipotenusa);
		vCateto2=Double.parseDouble(Cateto2);
		vIpotenusa=Double.parseDouble(Cateto2);
		vCateto1=Math.sqrt(vIpotenusa*vIpotenusa-vCateto2*vCateto2);
		Ipotenusa="" + Ipotenusa;
		cCateto1.setText(Cateto2);
		
	}
				
	private void eseguiCateto2() {
	
		String Cateto1, Cateto2, Ipotenusa;
		double vCateto1 , vCateto2, vIpotenusa;
	
		Cateto1=cCateto1.getText();
		Ipotenusa=cIpotenusa.getText();
		vIpotenusa=Double.parseDouble(Ipotenusa);
		vCateto1=Double.parseDouble(Cateto1);
		vIpotenusa=Double.parseDouble(Cateto1);
		vCateto2=Math.sqrt(vIpotenusa*vIpotenusa-vCateto1*vCateto1);
		Ipotenusa="" + Ipotenusa;
		cCateto2.setText(Cateto1);
	
	}
	private void eseguiIpotenusa() {
	
		String Cateto1, Cateto2, Ipotenusa;
		double vCateto1 , vCateto2, vIpotenusa;
	
		Cateto2=cCateto2.getText();
		Ipotenusa=cIpotenusa.getText();
		vCateto1=Double.parseDouble(Cateto1);
		vCateto2=Double.parseDouble(Cateto2); 
		vIpotenusa=Double.parseDouble(Cateto2);
		vCateto1=Math.sqrt(vIpotenusa*vIpotenusa-vCateto2*vCateto2);
		Ipotenusa="" + Ipotenusa;
		cCateto1.setText(Cateto2);
	
	}
	
	
}
