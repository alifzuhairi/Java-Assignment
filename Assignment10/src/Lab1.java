
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.layout.*; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler; 
import javafx.scene.control.Label; 
import javafx.stage.Stage; 



public class Lab1 extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
	  
 
    
    // create a button 
    Button b = new Button("Flower"); 
    Button b1 = new Button("Apple"); 
    Button b2 = new Button("Bee"); 
    Button b3 = new Button("Tree"); 
    
    // create a stack pane 
    TilePane r = new TilePane(); 

    // when button is pressed 
    b.setOnAction(event); 
    b1.setOnAction(event1);
    b2.setOnAction(event2); 
    b3.setOnAction(event3); 

    // add button 
    r.getChildren().add(b); 
    r.getChildren().add(b1); 
    r.getChildren().add(b2); 
    r.getChildren().add(b3); 
    r.getChildren().add(l); 
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(r, 230, 250); 
    primaryStage.setTitle("Assignment10"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    
   

  


    
  }

 
  public static void main(String[] args) {
    launch(args);
    
  }
  // create a label 
  Label l = new Label("  Push The Button    "); 

EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() { 
    public void handle(ActionEvent e) 
    { 
        l.setText("  FLOWER BUTTON IS SELECTED    "); 
    } 
}; 
EventHandler<ActionEvent> event1 = new EventHandler<ActionEvent>() { 
    public void handle(ActionEvent e) 
    { 
        l.setText("  APPLE BUTTON IS SELECTED    "); 
    } 
}; 
EventHandler<ActionEvent> event2 = new EventHandler<ActionEvent>() { 
    public void handle(ActionEvent e) 
    { 
        l.setText("  BEE BUTTON IS SELECTED    "); 
    } 
}; 
EventHandler<ActionEvent> event3 = new EventHandler<ActionEvent>() { 
    public void handle(ActionEvent e) 
    { 
        l.setText("  TREE BUTTON IS SELECTED    "); 
    } 
}; 

}


