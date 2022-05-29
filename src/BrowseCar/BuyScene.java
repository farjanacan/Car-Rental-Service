/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BrowseCar;
import java.util.Optional;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
/**
 *
 * @author CHHAITYY
 */

public class BuyScene {
    public static void display(String title, String message){
      Stage window=new Stage();
      window.initModality(Modality.APPLICATION_MODAL);
      window.setTitle("Buy");
      window.resizableProperty().setValue(Boolean.FALSE);
      
      Label label=new Label();
      label.setText(message);
      Button PaynowButton= new Button("Pay Now");
      
      
      PaynowButton.setOnAction(e->
              
      {     
          Label successLabel=new Label("Payment Done");
           successLabel.setId("label-custom");
           StackPane SP=new StackPane();
           SP.getChildren().addAll(successLabel);
           Scene scene2 = new Scene(SP,300,200);
            scene2.getStylesheets().add("admin.css");
            window.setScene(scene2);
            
             
    });
              
      Button VisaButton=new Button("Visa Card");
      Button PaypalButton=new Button("PayPal");
      HBox h=new HBox(5,VisaButton,PaypalButton);
      VBox VisaBox=new VBox(10);
      VisaBox.setPadding(new Insets(0,0,0,90));
      VisaBox.getChildren().add(h);
      VisaBox.setAlignment(Pos.CENTER);
      
      Label VisaLabel=new Label("Visa Account no:   ");
      TextField VisaTextField=new TextField("");
      Label PaypalLabel=new Label("PayPal Account no:");
      TextField PaypalTextField=new TextField("");
      
      HBox h1=new HBox(5,VisaLabel,VisaTextField);
      h1.setVisible(false);
      
      HBox h2=new HBox(2,PaypalLabel,PaypalTextField);
      h2.setVisible(false);
      
      VBox v=new VBox(10);
      v.setPadding(new Insets(20));
      v.getChildren().addAll(h1,h2);
      v.setAlignment(Pos.CENTER);
      
      VBox box=new VBox(10);
      box.getChildren().addAll(label,VisaBox,v,PaynowButton);
      box.setAlignment(Pos.CENTER);
      
      VisaButton.setOnAction(e->
      {
          h1.setVisible(true);
      }
      );
      PaypalButton.setOnAction(e->
      {
          h2.setVisible(true);
      }
      );
      
      Scene scene=new Scene(box,300,300);
      scene.getStylesheets().add("admin.css");
      window.setScene(scene);
      window.showAndWait();
    }
    
    
}
