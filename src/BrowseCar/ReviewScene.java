/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BrowseCar;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author CHHAITYY
 */
public class ReviewScene extends Scene {
      static VBox root = new VBox(10);
      
      public ReviewScene()
      {
          super(root,1058, 570);
          
          Label readLabel=new Label("Read Reviews by our valuable customers.");
          readLabel.setId("label-custom");
          
          ImageView tata= new ImageView(new Image(getClass().getResourceAsStream("/image/tata.jpg"),150,130,true,true));
          ImageView honda= new ImageView(new Image(getClass().getResourceAsStream("/image/honda.jpg"),150,130,true,true));
          ImageView datsun= new ImageView(new Image(getClass().getResourceAsStream("/image/datsun.jpg"),150,130,true,true));
          
          Button tataButton= new Button("Review of TATA NANO");
          tataButton.setOnAction(e->
                  {
                      tataReview.display("TATA NANO Review","Monjuara said=> ");
                  });
          
          Button hondaButton= new Button("Review of HONDA BRV");
          hondaButton.setOnAction(e->
                  {
                      hondaReview.display("HONDA BRV Review","John said=> ");
                  });
          
          Button datsunButton= new Button("Review of DATSUN GO PLUS");
          datsunButton.setOnAction(e->
                  {
                      datsunReview.display("DATSUN GO PLUS Review","Arya said=> ");
                  });          
          
          
          HBox tatH=new HBox(5,tata,tataButton);
          HBox honH=new HBox(5,honda,hondaButton);
          HBox datH=new HBox(5,datsun,datsunButton);
          
          VBox BoxLine=new VBox(10);
          BoxLine.setPadding(new Insets(20));
          BoxLine.getChildren().addAll(readLabel,tatH,honH,datH);
          
          root.getChildren().add(BoxLine);
          root.setAlignment(Pos.TOP_LEFT);
          root.getStylesheets().add("admin.css"); 
          
          
      }
    
}
