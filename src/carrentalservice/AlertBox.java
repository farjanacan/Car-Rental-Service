package carrentalservice;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Chaity
 */
public class AlertBox {
    public static void display(String title, String message){
      Stage window=new Stage();
      window.initModality(Modality.APPLICATION_MODAL);
      window.setTitle("Alert");
       
      Label label=new Label();
      label.setText(message);
      label.setId("label-custom");
      Button CloseButton= new Button("Close the window");
      CloseButton.setOnAction(e->window.close());
      
      VBox box=new VBox(10);
      box.getChildren().addAll(label,CloseButton);
      box.setAlignment(Pos.CENTER);
      
      Scene scene=new Scene(box,200,100);
      scene.getStylesheets().add("Hype.css");
      window.setScene(scene);
      window.showAndWait();
    }
    
}
