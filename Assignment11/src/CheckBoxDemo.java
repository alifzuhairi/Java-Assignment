import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class CheckBoxDemo extends Lab11 {
	public double total=0;
	
  

	@Override // Override the getPane() method in the super class
	protected BorderPane getPane() {
		BorderPane pane = super.getPane();
	
	    Font fontBoldItalic = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20);
	    Font fontBold = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 20);
	    Font fontItalic = Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.ITALIC, 20);
	    Font fontNormal = Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 20);
	    
	    VBox paneForCheckBoxes = new VBox(20);
	    paneForCheckBoxes.setPadding(new Insets(5, 5, 5, 5)); 
	    //paneForCheckBoxes.setStyle("-fx-border-color: green");
	    CheckBox clean = new CheckBox("Cleaning\t\t\t\t     35.00");
	    CheckBox cavity = new CheckBox("Cavity Filling\t\t\t     150.00");
	    CheckBox xray = new CheckBox("X-ray\t\t\t\t     85.00");
	    CheckBox flouride = new CheckBox("Flouride\t\t\t\t     50.00");
	    CheckBox root = new CheckBox("Root Canal\t\t\t     255.00");
	    paneForCheckBoxes.getChildren().addAll(clean, cavity, xray, flouride, root);
	    pane.setCenter(paneForCheckBoxes);
	    EventHandler<ActionEvent> handler = e -> { 
	    	if (clean.isSelected() && cavity.isSelected() && xray.isSelected() && flouride.isSelected() && root.isSelected()) {
	    		total=225+50+85+150+35; // Both check boxes checked
	    	}
	    };
      
	    clean.setOnAction(handler);
	    cavity.setOnAction(handler);
	    
	    BorderPane paneForTextField = new BorderPane();
	    paneForTextField.setPadding(new Insets(5, 5, 5, 5)); 
	    paneForTextField.setTop(new Text(20,20, "Dental Payment Entry Form\n "));
	    paneForTextField.setLeft(new Label("Patient Name: "));
	    paneForTextField.setBottom(new Label("\n       Services\t\t\t\tPrices(RM)"));
	    
	    TextField tf = new TextField();
	    tf.setAlignment(Pos.BOTTOM_RIGHT);
	    paneForTextField.setCenter(tf);
	    pane.setTop(paneForTextField);
      
	    return pane; // Return a new pane
    }	
    
	/**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
	public static void main(String[] args) {
		launch(args);
	}
}