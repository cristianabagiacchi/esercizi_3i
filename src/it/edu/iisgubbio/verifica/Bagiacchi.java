package it.edu.iisgubbio.verifica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Bagiacchi extends Application {
	
	TextField tfNumeri = new TextField ();
	TextField tfElimina = new TextField ();
	Label lElimina = new Label ("Elimina Numero");
	Button bElimina = new Button("Elimina");
	Button bInverti = new Button("Inverti Numeri");
	Button bVisualizza = new Button("Visualizza");
	Label lRisposta = new Label ("???");
	
	public void start(Stage finestra) throws Exception {
		GridPane principale = new GridPane ();
		principale.add(tfNumeri,0,0, 2, 1);
		tfNumeri.setMaxWidth(Integer.MAX_VALUE);
		principale.add(tfElimina,1,1,1,1);
		tfElimina.setMaxWidth(Integer.MAX_VALUE);
		principale.add(bElimina,1,2, 1, 1);
		bElimina.setMaxWidth(Integer.MAX_VALUE);
		principale.add(bInverti,0,2,1,1);
		bInverti.setMaxWidth(Integer.MAX_VALUE);
		principale.add(bVisualizza,1,3,1,1);
		bVisualizza.setMaxWidth(Integer.MAX_VALUE);
		principale.add(lRisposta,0,3,2,1);
		lRisposta.setMaxWidth(Integer.MAX_VALUE);
		principale.add(lElimina,0,1,1,1);
		lElimina.setMaxWidth(Integer.MAX_VALUE);
			
		Scene scena = new Scene(principale);
		finestra.setTitle("Elimina Duplicati");
		finestra.setScene(scena);
		finestra.show(); 
			
		principale.getStyleClass().add("principale");

		bElimina.setOnAction( e -> eseguiElimina() );
		bInverti.setOnAction( e -> eseguiInverti() );
		bVisualizza.setOnAction( e -> eseguiVisualizza() );

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
	
	
	private void eseguiElimina() {		
		int posFinale=0;
		int c=0;
		String sequenza="";
		boolean numeriEliminati=false;
		String testo;
		testo=tfNumeri.getText();
		int numeri[]= testoNumeri(testo); 
		int elimina[]= new int [numeri.length];
	
		elimina[0]=numeri[0];
		posFinale++;
		for(int i=1; i<numeri.length;i++) 
			c=numeri[i];
			
			for(int k=1; k<elimina.length;k++) {
				if(elimina[k]==c) {
					numeriEliminati=true;
				}
			}
			if(numeriEliminati==false) {
				lRisposta.setText("Non è presente il numero");
			}
		}
		for(int i=0; i<posFinale;i++) {
			sequenza+= elimina[i] + ",";
		}
		lRisposta.setText(sequenza);

	}

				
		
	private void eseguiInverti() {	
		int posfin=0;
		String testo,parti[];
		testo=tfNumeri.getText();
		parti=testo.split(" ");
		int numeri[]=new int[parti.length];
		for(int i=0;i<parti.length;i++) {
			numeri[i]=Integer.parseInt(parti[i]);
		}
		posfin=parti.length;
		for(int i=0; i<posFinale;i++) {
			sequenza+= elimina[i] + ",";
		}
		lRisposta.setText(sequenza);
		}
	}
	
	private void eseguiVisualizza() {	
		int posfin=0;
		String testo,parti[];
		testo=tfNumeri.getText();
		parti=testo.split(" ");
		int numeri[]=new int[parti.length];
		for(int i=0;i<parti.length;i++) {
			numeri[i]=Integer.parseInt(parti[i]);
		}

	public static void main(String[] args) {
		launch(args);
	}
}
