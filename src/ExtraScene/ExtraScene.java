package ExtraScene;

import BrowseCar.BuyScene;
import com.sun.javaws.Main;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
/*
Author: J,Mohameed Parvez
*/

public class ExtraScene extends Scene  {

        Text text;
        Text InstructionText1;
        Text InstructionText2;
        Text InstructionText3;
        Text InstructionText4;
        Text InstructionText5;
        Text InstructionText6;
        ImageView car1;
        ImageView car2;
        ImageView car3;
        ImageView car4;
        ImageView car5;
        ImageView car6;
        ImageView car7;
        ImageView car8;
        ImageView tata;
        VBox v1;
        VBox v2;
        VBox v3;
        VBox v4;
        VBox v5;
        VBox v6;
        
        Button checkbox1;
        Button checkbox2;
        Button checkBox3;
        Button checkbox4;
        
        VBox boxview;
                
       static VBox root = new VBox(10);

	public ExtraScene(){
            
       super(root,1058, 570);
                
        text = new Text("Our Extra Services Include:");
        InstructionText1 = new Text(" Car can be booked for Wedding. Decorations are included with extra charge. Here are our sample decorated cars");
        InstructionText2 = new Text(" You can also visit our office to see more decorations."); 
        InstructionText3 = new Text(" To decorate your own ways please contact 01750555555"); 
    
         
        text.setFill(Color.BLACK);
        InstructionText1.setFill(Color.BLACK);
        InstructionText2.setFill(Color.BLACK);
        InstructionText3.setFill(Color.BLACK);

        text.setFont(Font.font("arial",FontWeight.BOLD,20));
        InstructionText1.setFont(Font.font("arial",FontWeight.NORMAL,15));
        InstructionText2.setFont(Font.font("arial",FontWeight.NORMAL,15));
        InstructionText3.setFont(Font.font("arial",FontWeight.NORMAL,15));
      
        boxview = new VBox(10);
        boxview.setPadding(new Insets(10)); 
        boxview.getChildren().addAll(text,InstructionText1,InstructionText2,InstructionText3);
             
            Text CarId1=new Text("Decoration Type:1");
            
           checkbox1=new Button("Choose");
           checkbox1.setOnAction(e->
            {
                ChoiceScene.display("Decoration Selection","Proceed");
            }
            );
            
            v1=new VBox(10);
            v1.setPadding(new Insets(20));
            v1.getChildren().addAll(CarId1,checkbox1);
            
            car1= new ImageView(new Image(getClass().getResourceAsStream("/image/hello.jpg"),200,100,true,true));
            
            v2=new VBox(10);
            v2.setPadding(new Insets(20));
            v2.getChildren().add(car1);
            
            HBox h1=new HBox(1,v1,v2);
                     
            Text CarId2=new Text("Decoration Type:2");

            Button checkbox2=new Button("Choose");
            checkbox2.setOnAction(e->
            {
                   ChoiceScene.display("Decoration Selection","Proceed");
            }
            );
            
            VBox v3=new VBox(10);
            v3.setPadding(new Insets(20));
            v3.getChildren().addAll(CarId2,checkbox2);
            
            car2= new ImageView(new Image(getClass().getResourceAsStream("/image/Hona.jpg"),200,100,true,true));
            
            VBox v4=new VBox(10);
            v4.setPadding(new Insets(20));
            v4.getChildren().add(car2);
            
            HBox h2=new HBox(1,v3,v4);
            
            Text CarId3=new Text("Decoration Type:3");
       
            
            Button checkbox3=new Button("Choose");
            
            checkbox3.setOnAction(e->
            {
                  ChoiceScene.display("Decoration Selection","Proceed");
            }
            );
            
            v5=new VBox(10);
            v5.setPadding(new Insets(20));
            v5.getChildren().addAll(CarId3,checkbox3);
            
            car3= new ImageView(new Image(getClass().getResourceAsStream("/image/prado.jpg"),200,100,true,true));
            
            v6=new VBox(10);
            v6.setPadding(new Insets(20));
            v6.getChildren().add(car3);
            
            HBox h3=new HBox(1,v5,v6);
            
            Text CarId4=new Text("Decoration Type:4");
      
            Button checkbox4=new Button("Choose");
            
            checkbox4.setOnAction(e->
            {
                   ChoiceScene.display("Decoration Selection","Proceed");
            }
            );
            
            VBox v7=new VBox(5);
            v7.setPadding(new Insets(30));
            v7.getChildren().addAll(CarId4,checkbox4);
            
            car4= new ImageView(new Image(getClass().getResourceAsStream("/image/camry.jpg"),200,100,true,true));
            
            VBox v8=new VBox(5);
            v8.setPadding(new Insets(10));
            v8.getChildren().add(car4);
            
            HBox h4=new HBox(1,v7,v8);
            
            VBox idiveg=new VBox(10);
            idiveg.setPadding(new Insets(10));
            idiveg.getChildren().addAll(boxview,h1,h2,h3,h4);
            
            ScrollPane sas=new ScrollPane();
            sas.setContent(idiveg);
            
           root.getChildren().addAll(sas);
           root.setPadding(new Insets(20));
           root.setAlignment(Pos.TOP_LEFT);
           root.getStylesheets().add("ProViper.css"); 
        
        
        
        
        
        }
}
