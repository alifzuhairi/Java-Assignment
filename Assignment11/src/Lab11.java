import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class Lab11 extends Application {
	protected BorderPane getPane() {
		HBox paneForButtons = new HBox(20);
		Button btcalc = new Button("CALCULATE");
		paneForButtons.getChildren().addAll(btcalc);
		paneForButtons.setAlignment(Pos.CENTER);
		paneForButtons.setStyle("-fx-border-color: green");
	
		BorderPane pane = new BorderPane();
		pane.setBottom(paneForButtons);
	    
	    Pane paneForText = new Pane();
	    pane.setCenter(paneForText);
	    
	    return pane;
	}
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a scene and place it in the stage
	    Scene scene = new Scene(getPane(), 450, 400);
	    primaryStage.setTitle("Dental Payment Application"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
	}

	/**
	* The main method is only needed for the IDE with limited
	* JavaFX support. Not needed for running from the command line.
	*/
	public static void main(String[] args) {
		launch(args);
	}
}