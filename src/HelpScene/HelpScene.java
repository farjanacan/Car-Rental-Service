package HelpScene;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
/*
Author: J,Mohameed Parvez
*/
public class HelpScene extends Scene  {
        Text text;
        Text InstructionText1;
        Text InstructionText2;
        Text InstructionText3;
        Text InstructionText4;
        Text InstructionText5;
        Text InstructionText6;
        VBox boxview;
        VBox ban;
        ImageView car_banner;
        
        static VBox root = new VBox(10);

	public HelpScene(){
            
		super(root,750,500);
                root.autosize();
                
                    car_banner= new ImageView(new Image(getClass().getResourceAsStream("/image/home-banner.png")));
                    car_banner.fitWidthProperty().bind(root.widthProperty());
                    car_banner.setSmooth(true);
                    car_banner.setFitHeight(170);        
                
                    text = new Text("If you're unsure how to use PickACar please follow the instructions below:");
                    InstructionText1 = new Text("   1.To continue you have to login first.");
                    InstructionText2 = new Text("   2.After you're logged in, you'll be redirected to browse page."); 
                    InstructionText3 = new Text("   3.From there Choose if you want to browse car or view extra options."); 
                    InstructionText4 = new Text("   4.To choose cars, click on Browse Cars."); 
                    InstructionText5 = new Text("   5.Choose from the available cars to buy/rent!"); 
                    InstructionText6 = new Text("   5.That's how you can get a car. ");

                    text.setFill(Color.BLACK);
                    InstructionText1.setFill(Color.BLACK);
                    InstructionText2.setFill(Color.BLACK);
                    InstructionText3.setFill(Color.BLACK);
                    InstructionText4.setFill(Color.BLACK);
                    InstructionText5.setFill(Color.BLACK);
                    InstructionText6.setFill(Color.BLACK);

                    text.setFont(Font.font("arial",FontWeight.BOLD,20));
                    InstructionText1.setFont(Font.font("arial",FontWeight.NORMAL,15));
                    InstructionText2.setFont(Font.font("arial",FontWeight.NORMAL,15));
                    InstructionText3.setFont(Font.font("arial",FontWeight.NORMAL,15));
                    InstructionText4.setFont(Font.font("arial",FontWeight.NORMAL,15));
                    InstructionText5.setFont(Font.font("arial",FontWeight.NORMAL,15));
                    InstructionText6.setFont(Font.font("arial",FontWeight.NORMAL,15));

                    ban=new VBox(10);
                    ban.setPadding(new Insets(20)); 
                    ban.getChildren().addAll(text,InstructionText1,InstructionText2,InstructionText3,InstructionText4,InstructionText5,InstructionText6);
                    boxview = new VBox(10);
                    boxview.getChildren().addAll(car_banner,ban);
                    

                    //root.setPadding(new Insets(20));
                    root.getChildren().add(boxview);
                    root.setAlignment(Pos.TOP_LEFT);
                    root.getStylesheets().add("admin.css"); 
        
        }
}
