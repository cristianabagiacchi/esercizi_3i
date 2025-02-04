package it.edu.iisgubbio.pong.pong;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Pong extends Application{
	
	Text puntiTesto1 =new Text ("Punti Giocatore 1");
	Text puntiTesto2 =new Text ("Punti Giocatore 2");

	int punti1 =0;
	int punti2 =0;
	
	static final int DIMENSIONE_X =400;
	static final int DIMENSIONE_Y =400;

	static final int DIMENSIONE_X_RACCHETTA =20;
	static final int DIMENSIONE_Y_RACCHETTA =100;

	double x = 50;
	double y = 20;
	double incrementox =4;
	double incrementoy =4;

	Rectangle RacchettaSinistra = new Rectangle(DIMENSIONE_X_RACCHETTA,DIMENSIONE_Y_RACCHETTA);
	int ySinistra=40;
	Rectangle RacchettaDestra = new Rectangle(20,100);
	int yDestra =40;
	int xDestra =380;

	Circle cerchio = new Circle(20);

	public void start(Stage primaryStage) throws Exception {  

		Pane areaDiGioco = new Pane();

		areaDiGioco.setPrefSize(DIMENSIONE_X, DIMENSIONE_Y);
		areaDiGioco.getChildren().add(RacchettaDestra);
		RacchettaDestra.setY(yDestra);
		RacchettaDestra.setX(xDestra);
		RacchettaDestra.setFill(Color.PINK);
		areaDiGioco.getChildren().add(RacchettaSinistra);
		RacchettaSinistra.setY(ySinistra);
		RacchettaSinistra.setFill(Color.PINK);
		
		areaDiGioco.getChildren().add(puntiTesto1);
		puntiTesto1.setY(20);
		puntiTesto1.setX(80);
		areaDiGioco.getChildren().add(puntiTesto2);
		puntiTesto2.setY(20);
		puntiTesto2.setX(220);
		
		
		
		Scene scene = new Scene(areaDiGioco,DIMENSIONE_X, DIMENSIONE_Y);
		scene.getStylesheets().add("it/edu/iisgubbio/pong/pong/stile.css");
		primaryStage.setTitle("Tela Pallina"); 
		primaryStage.setScene(scene);
		primaryStage.show();
		

		Timeline timeline = new Timeline(new KeyFrame(
				Duration.seconds(0.04),
				x -> aggiornaTimer()));

		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play();

		cerchio.setFill(Color.PINK);
		cerchio.setCenterX(20);
		cerchio.setCenterY(40);
		areaDiGioco.getChildren().add(cerchio);


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

	boolean avanti=true;
	private void aggiornaTimer(){
		

		x = x + incrementox;
		y = y + incrementoy;
		if (x >= DIMENSIONE_X-20) {
			incrementox = -4;
			System.out.println("x d");
			
		}

		if (x <= 20) {
			incrementox = 4;
			System.out.println("x s");
		}
		if (y >= DIMENSIONE_Y-20) {
			incrementoy =- incrementoy;
			System.out.println("y sot");
		}

		if (y <= 20) {
			incrementoy =- incrementoy;
			System.out.println("y sop");
		}
		cerchio.setCenterX(x+incrementox);
		cerchio.setCenterY(y+incrementoy);

		Bounds marginiPallina = cerchio.getBoundsInParent();
		Bounds marginiDestra = RacchettaDestra.getBoundsInParent();
		Bounds marginiSinistra = RacchettaSinistra.getBoundsInParent();


		if(marginiPallina.intersects(marginiDestra)) {
			incrementox = -incrementox;
			System.out.println("collisione");
			
			punti1++;
			puntiTesto1.setText(""+punti1);
			
		}

		if(marginiPallina.intersects(marginiSinistra)) {
			incrementox = -incrementox;
			System.out.println("collisione");
			
			punti2++;
			puntiTesto2.setText(""+punti2);
		}


	}
	public static void main(String args[]){
		launch();
	}
}
