package BrowseCar;
import carrentalservice.CarRentalService;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/**
 *
 * @author CHHAITYY
 */
public class BrowseCar extends Scene {
        Menu CarMenu;
        Menu ReviewMenu;
        MenuBar menuBar;
        VBox BannerLayout;
        VBox BuyCarBox;
        VBox SaleCarBox;
        Rectangle CarBox1;
        Rectangle CarBox2;
        Rectangle CarBox3;
        Rectangle CarBox4;
        Rectangle CarBox5;
        Rectangle CarBox6;
        Rectangle CarBox7;
        Rectangle CarBox8;
        Rectangle CarBox9;
        Rectangle CarBox10;
        ImageView tata;
        ImageView honda;
        ImageView toyota;
        ImageView mitshubishi;
        ImageView xuv;
        ImageView ford;
        ImageView maruti;
        ImageView rr;
        ImageView nissan;
        ImageView datsun;
        
        
        
    static VBox root = new VBox(10);

    public BrowseCar()
    {
        super(root,1058, 570);
       
        
        //Creating Menu
            CarMenu=new Menu("Cars");
            ReviewMenu=new Menu("Car Reviews");
            
            MenuItem CarRating=new MenuItem("Car Reviews & Ratings");
            CarRating.setOnAction(e->
            {
                        Stage s = new Stage();
			s.setScene(new ReviewScene());
			s.show();
            });
            
            
            //Menu items
            
            MenuItem CarSale=new MenuItem("Cars For Sale");
            CarSale.setOnAction(e->
            {
                BuyCarBox.setVisible(true);
            });
            CarMenu.getItems().add(CarSale);
            ReviewMenu.getItems().add(CarRating);
            
            MenuItem CarRent=new MenuItem("Cars For Rent");
            CarRent.setOnAction(e->
            {
                SaleCarBox.setVisible(true);
            });
            CarMenu.getItems().add(CarRent);
            
            //Menubar
            menuBar=new MenuBar();
            menuBar.getMenus().addAll(CarMenu,ReviewMenu); 
            menuBar.prefWidthProperty().bind(root.widthProperty());
            
            CarBox1=new Rectangle(175,20,350,150);
            CarBox1.setArcHeight(20);
            CarBox1.setArcWidth(20);
            CarBox1.setFill(Color.TRANSPARENT);
            CarBox1.setStroke(Color.PURPLE);
            
            Text CarId1=new Text("CarID:102");
            Text CarModel1=new Text("Model:TATA NANO");
            Text CarPrice1=new Text("Price:5 Lakh BDT");
            
            Button BuyButton1=new Button("Buy");
            BuyButton1.setOnAction(e->
            {
                BuyScene.display("Buy","Please select payment method.");
            }
            );
            
            VBox v1=new VBox(5);
            v1.setPadding(new Insets(30));
            v1.getChildren().addAll(CarId1,CarModel1,CarPrice1,BuyButton1);
            
            tata= new ImageView(new Image(getClass().getResourceAsStream("/image/tata.jpg"),150,130,true,true));
            
            VBox v2=new VBox(5);
            v2.setPadding(new Insets(5));
            v2.getChildren().add(tata);
            
            HBox h1=new HBox(1,v1,v2);
            
            
            
            StackPane Scar1 = new StackPane();
            Scar1.getChildren().addAll(CarBox1,h1);
            
            CarBox2=new Rectangle(175,20,350,150);
            CarBox2.setArcHeight(20);
            CarBox2.setArcWidth(20);
            CarBox2.setFill(Color.TRANSPARENT);
            CarBox2.setStroke(Color.PURPLE);
            
            Text CarId2=new Text("CarID:76");
            Text CarModel2=new Text("Model:HONDA BRV");
            Text CarPrice2=new Text("Price:20 Lakh BDT");
            
            Button BuyButton2=new Button("Buy");
            BuyButton2.setOnAction(e->
            {
                BuyScene.display("Buy","Please select payment method.");
            }
            );
            
            VBox v3=new VBox(5);
            v3.setPadding(new Insets(31));
            v3.getChildren().addAll(CarId2,CarModel2,CarPrice2,BuyButton2);
            
            honda= new ImageView(new Image(getClass().getResourceAsStream("/image/honda.jpg"),150,130,true,true));
            
            VBox v4=new VBox(5);
            v4.setPadding(new Insets(5));
            v4.getChildren().add(honda);
            
            HBox h2=new HBox(1,v3,v4);
            
            
            
            StackPane Scar2 = new StackPane();
            Scar2.getChildren().addAll(CarBox2,h2);
            
            CarBox3=new Rectangle(175,220,350,150);
            CarBox3.setArcHeight(20);
            CarBox3.setArcWidth(20);
            CarBox3.setFill(Color.TRANSPARENT);
            CarBox3.setStroke(Color.PURPLE);
            
            Text CarId3=new Text("CarID:231");
            Text CarModel3=new Text("Model:MITSHUBISHI L");
            Text CarPrice3=new Text("Price:25 Lakh BDT");
            
            Button BuyButton3=new Button("Buy");
            
            BuyButton3.setOnAction(e->
            {
                BuyScene.display("Buy","Please select payment method.");
            }
            );
            
            VBox v5=new VBox(5);
            v5.setPadding(new Insets(30));
            v5.getChildren().addAll(CarId3,CarModel3,CarPrice3,BuyButton3);
            
            mitshubishi= new ImageView(new Image(getClass().getResourceAsStream("/image/mitshubishi.jpg"),140,120,true,true));
            
            VBox v6=new VBox(5);
            v6.setPadding(new Insets(12));
            v6.getChildren().add(mitshubishi);
            
            HBox h3=new HBox(1,v5,v6);
            
            
            
            StackPane Scar3 = new StackPane();
            Scar3.getChildren().addAll(CarBox3,h3);
            
            CarBox4=new Rectangle(175,220,350,150);
            CarBox4.setArcHeight(20);
            CarBox4.setArcWidth(20);
            CarBox4.setFill(Color.TRANSPARENT);
            CarBox4.setStroke(Color.PURPLE);
            
            Text CarId4=new Text("CarID:76");
            Text CarModel4=new Text("Model:TOYOTA VIOS");
            Text CarPrice4=new Text("Price:18 Lakh BDT");
            
            Button BuyButton4=new Button("Buy");
            
            BuyButton4.setOnAction(e->
            {
                BuyScene.display("Buy","Please select payment method.");
            }
            );
            
            VBox v7=new VBox(5);
            v7.setPadding(new Insets(30));
            v7.getChildren().addAll(CarId4,CarModel4,CarPrice4,BuyButton4);
            
            toyota= new ImageView(new Image(getClass().getResourceAsStream("/image/toyota.jpg"),150,130,true,true));
            
            VBox v8=new VBox(5);
            v8.setPadding(new Insets(10));
            v8.getChildren().add(toyota);
            
            HBox h4=new HBox(1,v7,v8);
            
            
            
            StackPane Scar4 = new StackPane();
            Scar4.getChildren().addAll(CarBox4,h4);
            
            CarBox5=new Rectangle(175,220,350,150);
            CarBox5.setArcHeight(20);
            CarBox5.setArcWidth(20);
            CarBox5.setFill(Color.TRANSPARENT);
            CarBox5.setStroke(Color.PURPLE);
            
            Text CarId5=new Text("CarID:432");
            Text CarModel5=new Text("Model:XUV 500");
            Text CarPrice5=new Text("Price:50 Lakh BDT");
            
            Button BuyButton5=new Button("Buy");
            
            BuyButton5.setOnAction(e->
            {
                BuyScene.display("Buy","Please select payment method.");
            }
            );
            
            VBox v9=new VBox(5);
            v9.setPadding(new Insets(35));
            v9.getChildren().addAll(CarId5,CarModel5,CarPrice5,BuyButton5);
            
            xuv= new ImageView(new Image(getClass().getResourceAsStream("/image/xuv.jpg"),150,130,true,true));
            
            VBox v10=new VBox(5);
            v10.setPadding(new Insets(7));
            v10.getChildren().add(xuv);
            
            HBox h5=new HBox(1,v9,v10);
            
            
            
            StackPane Scar5 = new StackPane();
            Scar5.getChildren().addAll(CarBox5,h5);
            
            BuyCarBox=new VBox(10);
            BuyCarBox.setPadding(new Insets(70,10,10,5));
            BuyCarBox.getChildren().addAll(Scar1,Scar2,Scar3,Scar4,Scar5);
            BuyCarBox.setVisible(false);
            
            CarBox6=new Rectangle(175,20,350,150);
            CarBox6.setArcHeight(20);
            CarBox6.setArcWidth(20);
            CarBox6.setFill(Color.TRANSPARENT);
            CarBox6.setStroke(Color.PURPLE);
            
            Text CarId6=new Text("CarID:52");
            Text CarModel6=new Text("Model:NISSAN PATROL");
            Text CarPrice6=new Text("Rent/hour:2k BDT");
            
            Button BuyButton6=new Button("Rent");
            
            BuyButton6.setOnAction(e->
            {
                RentScene.display("Rent","Please select from below.");
            }
            );
            
            VBox v11=new VBox(5);
            v11.setPadding(new Insets(35));
            v11.getChildren().addAll(CarId6,CarModel6,CarPrice6,BuyButton6);
            
            nissan= new ImageView(new Image(getClass().getResourceAsStream("/image/nissan.jpg"),150,130,true,true));
            
            VBox v12=new VBox(5);
            v12.setPadding(new Insets(7));
            v12.getChildren().add(nissan);
            
            HBox h6=new HBox(1,v11,v12);

            StackPane Scar6 = new StackPane();
            Scar6.getChildren().addAll(CarBox6,h6);
            
            CarBox7=new Rectangle(175,20,350,150);
            CarBox7.setArcHeight(20);
            CarBox7.setArcWidth(20);
            CarBox7.setFill(Color.TRANSPARENT);
            CarBox7.setStroke(Color.PURPLE);
            
            Text CarId7=new Text("CarID:314");
            Text CarModel7=new Text("Model:XUV 500");
            Text CarPrice7=new Text("Rent/hour: 2.5k BDT");
            
            Button BuyButton7=new Button("Rent");
            
            BuyButton7.setOnAction(e->
            {
                RentScene.display("Rent","Please select from below.");
            }
            );
            
            VBox v13=new VBox(5);
            v13.setPadding(new Insets(35));
            v13.getChildren().addAll(CarId7,CarModel7,CarPrice7,BuyButton7);
            
            ford= new ImageView(new Image(getClass().getResourceAsStream("/image/ford.jpg"),150,130,true,true));
            
            VBox v14=new VBox(5);
            v14.setPadding(new Insets(7));
            v14.getChildren().add(ford);
            
            HBox h7=new HBox(1,v13,v14);
            
            StackPane Scar7 = new StackPane();
            Scar7.getChildren().addAll(CarBox7,h7);
            
            CarBox8=new Rectangle(175,20,350,150);
            CarBox8.setArcHeight(20);
            CarBox8.setArcWidth(20);
            CarBox8.setFill(Color.TRANSPARENT);
            CarBox8.setStroke(Color.PURPLE);
            
            Text CarId8=new Text("CarID:112");
            Text CarModel8=new Text("Model:XUV 500");
            Text CarPrice8=new Text("Rent/hour:1.5k BDT");
            
            Button BuyButton8=new Button("Rent");
            
            BuyButton8.setOnAction(e->
            {
                RentScene.display("Rent","Please select from below.");
            }
            );
            
            VBox v15=new VBox(5);
            v15.setPadding(new Insets(35));
            v15.getChildren().addAll(CarId8,CarModel8,CarPrice8,BuyButton8);
            
            datsun= new ImageView(new Image(getClass().getResourceAsStream("/image/datsun.jpg"),150,130,true,true));
            
            VBox v16=new VBox(5);
            v16.setPadding(new Insets(7));
            v16.getChildren().add(datsun);
            
            HBox h8=new HBox(1,v15,v16);

            StackPane Scar8= new StackPane();
            Scar8.getChildren().addAll(CarBox8,h8);
            
            CarBox9=new Rectangle(175,20,350,150);
            CarBox9.setArcHeight(20);
            CarBox9.setArcWidth(20);
            CarBox9.setFill(Color.TRANSPARENT);
            CarBox9.setStroke(Color.PURPLE);
            
            Text CarId9=new Text("CarID:009");
            Text CarModel9=new Text("Model:XUV 500");
            Text CarPrice9=new Text("Rent/hour:1.2k BDT");
            
            Button BuyButton9=new Button("Rent");
            
            BuyButton9.setOnAction(e->
            {
                RentScene.display("Rent","Please select from below.");
            }
            );
            
            VBox v17=new VBox(5);
            v17.setPadding(new Insets(35));
            v17.getChildren().addAll(CarId9,CarModel9,CarPrice9,BuyButton9);
            
            maruti= new ImageView(new Image(getClass().getResourceAsStream("/image/maruti.jpg"),150,130,true,true));
            
            VBox v18=new VBox(5);
            v18.setPadding(new Insets(7));
            v18.getChildren().add(maruti);
            
            HBox h9=new HBox(1,v17,v18);
            
            
            StackPane Scar9= new StackPane();
            Scar9.getChildren().addAll(CarBox9,h9);
            
            CarBox10=new Rectangle(175,20,350,150);
            CarBox10.setArcHeight(20);
            CarBox10.setArcWidth(20);
            CarBox10.setFill(Color.TRANSPARENT);
            CarBox10.setStroke(Color.PURPLE);
            
            Text CarId10=new Text("CarID:65");
            Text CarModel10=new Text("Model:XUV 500");
            Text CarPrice10=new Text("Rent/hour:50k BDT");
            
            Button BuyButton10=new Button("Rent");
            
            BuyButton10.setOnAction(e->
            {
                RentScene.display("Rent","Please select from below.");
            }
            );
            
            VBox v19=new VBox(5);
            v19.setPadding(new Insets(35));
            v19.getChildren().addAll(CarId10,CarModel10,CarPrice10,BuyButton10);
            
            rr= new ImageView(new Image(getClass().getResourceAsStream("/image/rr.jpg"),150,130,true,true));
            
            VBox v20=new VBox(5);
            v20.setPadding(new Insets(7));
            v20.getChildren().add(rr);
            
            HBox h10=new HBox(1,v19,v20);
            
            StackPane Scar10 = new StackPane();
            Scar10.getChildren().addAll(CarBox10,h10);
            
            SaleCarBox=new VBox(5);
            SaleCarBox.setPadding(new Insets(66,2,2,10));
            SaleCarBox.getChildren().addAll(Scar6,Scar7,Scar8,Scar9,Scar10);
            SaleCarBox.setVisible(false);
            
            ImageView view= new ImageView(new Image(getClass().getResourceAsStream("/image/tall.jpg"),250,720,true,true));
            ImageView view2= new ImageView(new Image(getClass().getResourceAsStream("/image/tall.jpg"),250,720,true,true));
            
            VBox tallbox=new VBox(10);
            tallbox.setPadding(new Insets(66,2,2,15));
            tallbox.getChildren().addAll(view,view2);
            
            HBox side=new HBox(5,BuyCarBox,SaleCarBox,tallbox);
            
            VBox okk=new VBox(20);
            okk.getChildren().addAll(menuBar,side);
            okk.prefWidthProperty().bind(root.widthProperty());
            ScrollPane scroll=new ScrollPane();
            scroll.setContent(okk);
		root.getChildren().addAll(scroll);
                root.setAlignment(Pos.CENTER);    
                root.getStylesheets().add("admin.css");
    }
}
