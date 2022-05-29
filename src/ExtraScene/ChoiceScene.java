
package ExtraScene;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Parvez
 */
public class ChoiceScene {
        public static void display(String title, String message){
        Stage window=new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Decoration selection");
        window.resizableProperty().setValue(Boolean.FALSE);
        
        Label label=new Label();
        label.setText(message);
        
        Label HourLabel=new Label("Rent for:");
      
        CheckBox YesBox2=new CheckBox("3 hour");
        CheckBox YesBox3=new CheckBox("5 hours");
        CheckBox YesBox4=new CheckBox("7 hours");
        
        HBox SecondBox=new HBox(5,HourLabel,YesBox2,YesBox3,YesBox4);
        
        VBox Shift2= new VBox(10);
        Shift2.setPadding(new Insets(0,0,0,30));
        Shift2.getChildren().add(SecondBox);
        
        Button PayButton= new Button("Confirm Selection");
        
        PayButton.setOnAction(e->
            {     
                Label ConfirmLabel1=new Label("Decoration Confirmed.");
                ConfirmLabel1.setId("label-custom");
                VBox newV=new VBox(5);
                newV.getChildren().addAll(ConfirmLabel1);
                
                StackPane SP=new StackPane();
                SP.getChildren().addAll(newV);
                Scene scene2 = new Scene(SP,450,300);
                scene2.getStylesheets().add("admin.css");
                window.setScene(scene2);
         });
        
         VBox v=new VBox(10);
         v.setPadding(new Insets(0,0,0,40));
         v.getChildren().addAll(label,SecondBox,PayButton);
         v.setAlignment(Pos.CENTER);
        
         Scene scene=new Scene(v,350,300);
         scene.getStylesheets().add("Hype.css");
         window.setScene(scene);
         window.showAndWait();
    
}
}
