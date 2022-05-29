/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BrowseCar;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author CHHAITYY
 */
public class hondaReview {
    public static void display(String title, String message){
      Stage window=new Stage();
      window.initModality(Modality.APPLICATION_MODAL);
      window.setTitle("HONDA BRV Review");
      window.resizableProperty().setValue(Boolean.FALSE);
       
      Label label=new Label();
      label.setText(message);
      label.setId("label-custom");
      Text text=new Text("Not going to try this app again.");
      text.setFont(Font.font("arial",FontWeight.BOLD,11));
      Text text1=new Text("Though it was easy to choose car to buy,but when i");
      text1.setFont(Font.font("arial",FontWeight.BOLD,11));
      Text text2=new Text("called the given number the staffs spoke to me rudely.");
      text2.setFont(Font.font("arial",FontWeight.BOLD,11));
      Text text3=new Text("Rating: *");
      text3.setFont(Font.font("arial",FontWeight.BOLD,11));
      
      
      Button CloseButton= new Button("Close");
      CloseButton.setOnAction(e->window.close());
      
      VBox box=new VBox(10);
      box.getChildren().addAll(label,text,text1,text2,text3,CloseButton);
      box.setAlignment(Pos.CENTER);
      
      Scene scene=new Scene(box,270,200);
      scene.getStylesheets().add("Hype.css");
      window.setScene(scene);
      window.showAndWait();
    
}
}