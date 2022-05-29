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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author CHHAITYY
 */
public class RentScene {
     public static void display(String title, String message){
      Stage window=new Stage();
      window.initModality(Modality.APPLICATION_MODAL);
      window.setTitle("Rent");
      window.resizableProperty().setValue(Boolean.FALSE);

        Label label=new Label();
        label.setText(message);
        Label DriverLabel=new Label("Do you want a driver?");
      
        CheckBox YesBox1=new CheckBox("Yes");
        CheckBox NoBox1=new CheckBox("No");
        
        HBox FirstBox=new HBox(5,DriverLabel,YesBox1,NoBox1);
      
        VBox Shift= new VBox(10);
        Shift.setPadding(new Insets(0,0,0,40));
        Shift.getChildren().add(FirstBox); 
        
        Label HourLabel=new Label("Rent for:");
      
        CheckBox YesBox2=new CheckBox("1 hour");
        CheckBox YesBox3=new CheckBox("2 hours");
        CheckBox YesBox4=new CheckBox("3 hours");
        
        HBox SecondBox=new HBox(5,HourLabel,YesBox2,YesBox3,YesBox4);
      
        VBox Shift2= new VBox(10);
        Shift2.setPadding(new Insets(0,0,0,40));
        Shift2.getChildren().add(SecondBox);
        
        Label AddressLabel=new Label("Address");
        Label CityLabel=new Label("City:");
        Label RoadLabel=new Label("Road:");
        Label ZipLabel=new Label("Zip:");
        
        TextField CityTextfield=new TextField("");
                CityTextfield.setMinWidth(Region.USE_PREF_SIZE);
                CityTextfield.setMaxWidth(Region.USE_PREF_SIZE);
        TextField RoadTextfield=new TextField("");
                RoadTextfield.setMinWidth(Region.USE_PREF_SIZE);
                RoadTextfield.setMaxWidth(Region.USE_PREF_SIZE);
        TextField ZipTextfield=new TextField("");
                ZipTextfield.setMinWidth(Region.USE_PREF_SIZE);
                ZipTextfield.setMaxWidth(Region.USE_PREF_SIZE);
       
        
        VBox v1=new VBox(5);
        v1.setPadding(new Insets(0,0,0,40));
        v1.getChildren().addAll(AddressLabel,CityLabel,CityTextfield,RoadLabel,RoadTextfield,ZipLabel,ZipTextfield);
        
        Button PayButton= new Button("Pay");
        
        PayButton.setOnAction(e->
            {     
                Label ConfirmLabel1=new Label("Rent Confirmed.");
                Label ConfirmLabel2=new Label("You've to pay 50% advance when the car reaches your address.");
                ConfirmLabel1.setId("label-custom");
                ConfirmLabel2.setId("label-custom");
                VBox newV=new VBox(5);
                newV.getChildren().addAll(ConfirmLabel1,ConfirmLabel2);
                
                StackPane SP=new StackPane();
                SP.getChildren().addAll(newV);
                Scene scene2 = new Scene(SP,450,300);
                scene2.getStylesheets().add("admin.css");
                window.setScene(scene2);
         });
        
        VBox v=new VBox(10);
        v.setPadding(new Insets(0,0,0,50));
        v.getChildren().addAll(Shift,Shift2,v1,PayButton);
        v.setAlignment(Pos.CENTER);
              
      Scene scene=new Scene(v,400,300);
      scene.getStylesheets().add("admin.css");
      window.setScene(scene);
      window.showAndWait();
    
}
}
