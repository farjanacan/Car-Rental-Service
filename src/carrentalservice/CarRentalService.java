package carrentalservice;

import BrowseCar.BrowseCar;
import ExtraScene.ExtraScene;
import HelpScene.HelpScene;
import Information.Information;
import Profile.Profile;
import java.awt.HeadlessException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import profilelist.cersei;
import profilelist.coleslaw;
import profilelist.harry;
import profilelist.ironman;
import profilelist.khan;
import profilelist.mahi;
import profilelist.ron;
import profilelist.ruby;
import profilelist.sansa;
import profilelist.slipknot;
import profilelist.smith;
import profilelist.sparta;
import profilelist.superman;
import profilelist.tyrion;
import profilelist.will;
/*
 Author=Chaity,Farjana Munir
 */
public class CarRentalService extends Application {

        Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
        Button LogoutButton;
        Button ProfileButton;
        Button AdminPanelButton;
        Button HelpButton;
        Label UserIdLabel;
        TextField UserIdTextField;
        Label PasswordLabel;
        PasswordField PasswordTextField;
        Button LoginButton;
        Label SignupLabel;
        Text text1;
        Text text2;
        Text text3;
        Text text4;
        Text text5;
        Text text6;
        Text text7;
        Text text8;
        VBox v1;
        VBox v2;
        VBox v3;
        VBox v4;
        HBox h1;
        HBox h2;
        ImageView view;
        Label AdminIDLabel;
        Label AdminPasswordLabel;
        TextField AdminIDTextField;
        PasswordField AdminPassField;
        Button AdminLoginButton;
        Button AdminLogoutButton;
        Button AdminBackButton;
        Stage window;
        Label jlabel1;
        Label label1;
        Label label2;
        

        public static Connection con;
        public static Statement st;
        ResultSet Rs;
        TextField userTextField;
        PasswordField pwBox;
        public Scene MainScene,BrowseScene,AdminScene,infoscene;

             TextField idInput;
             TextField nameInput;
             TextField genderInput;
             TextField locInput;
             TextField joinDateInput;

             TableView<Information> table;

        @Override
        public void start(Stage primaryStage) {

        window=primaryStage;
        window.resizableProperty().setValue(Boolean.FALSE);
        window.getIcons().add(new Image(this.getClass().getResource("icon.png").toString()));

        //Creating Layout of main scene
        //creating buttons
        AdminPanelButton=new Button("Admin Panel");
        AdminPanelButton.setOnAction(e->window.setScene(AdminScene));

        HelpButton= new Button("Help");
        HelpButton.setOnAction(e->{

			Stage s = new Stage();
			s.setScene(new HelpScene());
			s.show();
		});
        ProfileButton=new Button("My Profile");
        ProfileButton.setVisible(false);

        h1=new HBox(5,AdminPanelButton,HelpButton,ProfileButton);

        ProfileButton.setOnAction(e->{

			if(UserIdTextField.getText().equals("1")){


			Stage s = new Stage();
			s.setScene(new ironman());
			s.show();
        }
                else if(UserIdTextField.getText().equals("2"))
                {
                    Stage s = new Stage();
			s.setScene(new superman());
			s.show();
                }
                else if(UserIdTextField.getText().equals("3"))
                {
                    Stage s = new Stage();
			s.setScene(new coleslaw());
			s.show();
                }
                else if(UserIdTextField.getText().equals("3"))
                {
                    Stage s = new Stage();
			s.setScene(new coleslaw());
			s.show();
                }
                else if(UserIdTextField.getText().equals("4"))
                {
                    Stage s = new Stage();
			s.setScene(new ruby());
			s.show();
                }
                else if(UserIdTextField.getText().equals("5"))
                {
                    Stage s = new Stage();
			s.setScene(new slipknot());
			s.show();
                }
                else if(UserIdTextField.getText().equals("6"))
                {
                    Stage s = new Stage();
			s.setScene(new sparta());
			s.show();
                }
                else if(UserIdTextField.getText().equals("7"))
                {
                    Stage s = new Stage();
			s.setScene(new harry());
			s.show();
                }
                 else if(UserIdTextField.getText().equals("8"))
                {
                    Stage s = new Stage();
			s.setScene(new ron());
			s.show();
                }
                else if(UserIdTextField.getText().equals("9"))
                {
                    Stage s = new Stage();
			s.setScene(new tyrion());
			s.show();
                }
                else if(UserIdTextField.getText().equals("10"))
                {
                    Stage s = new Stage();
			s.setScene(new cersei());
			s.show();
                }
                else if(UserIdTextField.getText().equals("11"))
                {
                    Stage s = new Stage();
			s.setScene(new khan());
			s.show();
                }
                    else if(UserIdTextField.getText().equals("12"))
                {
                    Stage s = new Stage();
			s.setScene(new mahi());
			s.show();
                }
                else if(UserIdTextField.getText().equals("13"))
                {
                    Stage s = new Stage();
			s.setScene(new sansa());
			s.show();
                }
                else if(UserIdTextField.getText().equals("14"))
                {
                    Stage s = new Stage();
			s.setScene(new smith());
			s.show();
                }
                else if(UserIdTextField.getText().equals("15"))
                {
                    Stage s = new Stage();
			s.setScene(new will());
			s.show();
                }
		});
        //create display texts
        text1 = new Text( "Welcome to PickACar.");
        text2 = new Text( "Log in to get a ride anytime,anywhere.");

        text1.setFont(Font.font(null,FontWeight.BOLD,20));
        text2.setFont(Font.font(null,FontWeight.BOLD,20));
        text1.setId("fancytext");
        text2.setId("fancytext");

        v1=new VBox(5);
        v1.getChildren().addAll(text1,text2);

        //create userid label and textfield
        UserIdLabel=new Label("UserID");
        UserIdTextField=new TextField();
        UserIdTextField.setPromptText("Enter ID");
        UserIdTextField.setMinWidth(Region.USE_PREF_SIZE);
        UserIdTextField.setMaxWidth(Region.USE_PREF_SIZE);

        //create password label and passwordfield
        PasswordLabel=new Label("Password");
        PasswordTextField=new PasswordField();
        PasswordTextField.setPromptText("Enter Password");
        PasswordTextField.setMinWidth(Region.USE_PREF_SIZE);
        PasswordTextField.setMaxWidth(Region.USE_PREF_SIZE);

        LoginButton= new Button("Log In");
        LoginButton.setId("font-button");

        LogoutButton=new Button("Log Out");
        LogoutButton.setId("font2-button");

        //Handling action of the LoginButton
          LoginButton.setOnAction(e->  {
             conn=MysqlConnect.Connectdb();
             String Sql="select * from customer where Username=? and Password=?";
             try{

                 pst=conn.prepareStatement(Sql);
                 pst.setString(1, UserIdTextField.getText());
                 pst.setString(2, PasswordTextField.getText());
                 rs=pst.executeQuery();
                 if(rs.next())
                 {
                       /* Stage s = new Stage();
			s.setScene(new BrowseCar());
			s.show(); */
                     window.setScene(BrowseScene);

                 }

                 else{

                     JOptionPane.showMessageDialog(null,"Invalid log in attempt","Access Denied",JOptionPane.ERROR_MESSAGE);

                 }



         } catch(Exception c){

                  JOptionPane.showMessageDialog(null,c);
             }





                });

        //Handling action of logout button.
        LogoutButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

                UserIdTextField.setText("");
                PasswordTextField.setText("");
                ProfileButton.setVisible(false);
            }
            });

        v2=new VBox(10);
        v2.getChildren().addAll(UserIdLabel,UserIdTextField,PasswordLabel,PasswordTextField,LoginButton,LogoutButton);

        text3= new Text("Why you should use PickACar:");
        text4= new Text("   ~You can rent a car from anywhere.");
        text5= new Text("   ~You can save time to rent a car.");
        text6= new Text("   ~You can buy a car from anywhere.");
        text7= new Text("   ~You can decorate your car from anywhere.");
        text8= new Text("   ~you can do all the above tasks anytime!");

        text3.setFill(Color.SLATEBLUE);
        text4.setFill(Color.BLACK);
        text5.setFill(Color.BLACK);
        text6.setFill(Color.BLACK);
        text7.setFill(Color.BLACK);
        text8.setFill(Color.BLACK);

        text3.setFont(Font.font(null,FontWeight.BOLD,18));
        text4.setFont(Font.font(null,FontWeight.NORMAL,14));
        text5.setFont(Font.font(null,FontWeight.NORMAL,14));
        text6.setFont(Font.font(null,FontWeight.NORMAL,14));
        text7.setFont(Font.font(null,FontWeight.NORMAL,14));
        text8.setFont(Font.font(null,FontWeight.NORMAL,14));

        v3=new VBox(5);
        v3.getChildren().addAll(text3,text4,text5,text6,text7,text8);

        v4=new VBox(40);
        v4.setPadding(new Insets(20));
        v4.getChildren().addAll(h1,v1,v2,v3);

        //inserting image on the main scene
        view= new ImageView(new Image(getClass().getResourceAsStream("/image/car-rental-.jpg"),600,600,true,true));

        h2=new HBox(5,v4,view);

        MainScene = new Scene(h2, 1058, 570);
        MainScene.getStylesheets().add("Style.css");

        //Creating layout of browse scene
        Text text9=new Text("You're one step away from getting a car!!!");
        text9.setFill(Color.BLACK);
        text9.setFont(Font.font("arial",FontWeight.BOLD,14));

        Button BrowseCarButton=new Button("Browse Cars");
        BrowseCarButton.setOnAction(e->{
                        Stage s = new Stage();
			s.setScene(new BrowseCar());
			s.show();
             });


        Button ExtrasButton=new Button("Extras");
         ExtrasButton.setOnAction(e->{
                        Stage s = new Stage();
			s.setScene(new ExtraScene());
			s.show();
             });

        Button BackToMainButton=new Button("Go back to home page");
        BackToMainButton.setOnAction(e->window.setScene(MainScene));

        VBox v5=new VBox(10);
        v5.setPadding(new Insets(50));
        v5.getChildren().addAll(text9,BrowseCarButton,ExtrasButton,BackToMainButton);
        v5.setAlignment(Pos.CENTER);

        StackPane BrowseLayout=new StackPane();
        BrowseLayout.getChildren().addAll(v5);

        BrowseScene=new Scene(BrowseLayout,1058, 570);
        BrowseScene.getStylesheets().add("Viper.css");

        //creating layout of admin scene

            AdminIDLabel    =new Label("AdminID");
            AdminIDTextField=new TextField("");
            AdminIDTextField.setPromptText("Enter ID");
            AdminIDTextField.setMinWidth(Region.USE_PREF_SIZE);
            AdminIDTextField.setMaxWidth(Region.USE_PREF_SIZE);

            AdminPasswordLabel=new Label("Password");
            AdminPassField=new PasswordField();
            AdminPassField.setPromptText("Enter Password");
            AdminPassField.setMinWidth(Region.USE_PREF_SIZE);
            AdminPassField.setMaxWidth(Region.USE_PREF_SIZE);

            AdminLoginButton=new Button("Log In");
            AdminLoginButton.setId("font-button");

            //Handling action of the LoginButton


          AdminLoginButton.setOnAction(e->  {
             conn=MysqlConnect.Connectdb();
             String Sql="select * from Admin where AdminName=? and Password=?";
             try{


                 pst=conn.prepareStatement(Sql);
                 pst.setString(1, AdminIDTextField.getText());
                 pst.setString(2, AdminPassField.getText());
                 rs=pst.executeQuery();
                 if(rs.next())
                 {
                      window.setScene(infoscene);


                 }

                 else{

                     JOptionPane.showMessageDialog(null,"Invalid log in attempt","Access Denied",JOptionPane.ERROR_MESSAGE);

                 }



         } catch(Exception c){

                  JOptionPane.showMessageDialog(null,c);
             }





                });
            AdminLogoutButton=new Button("Log Out");
            AdminLogoutButton.setId("font2-button");

             //Handling action of logout button.
            AdminLogoutButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

                AdminIDTextField.setText("");
                AdminPassField.setText("");
            }
            });

            AdminBackButton=new Button("Go Back to Home Page");
            AdminBackButton.setOnAction(e->window.setScene(MainScene));

                VBox okkk=new VBox(10);
                okkk.getChildren().addAll(AdminIDLabel,AdminIDTextField,AdminPasswordLabel,AdminPassField,AdminLoginButton,AdminLogoutButton,AdminBackButton);
                okkk.setAlignment(Pos.CENTER);


            AdminScene=new Scene(okkk,1058, 570);
            AdminScene.getStylesheets().add("admin.css");

        //layout of Table

        TableColumn<Information, String> idColumn = new TableColumn<>("Id");
        idColumn.setMinWidth(200);
        idColumn.setCellValueFactory(new PropertyValueFactory<>("Id"));

        TableColumn<Information, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("Name"));


        TableColumn<Information, String> genderColumn = new TableColumn<>("Gender");
        genderColumn.setMinWidth(200);
        genderColumn.setCellValueFactory(new PropertyValueFactory<>("gender"));

        TableColumn<Information, String> locColumn = new TableColumn<>("Location");
        locColumn.setMinWidth(200);
        locColumn.setCellValueFactory(new PropertyValueFactory<>("loc"));

        TableColumn<Information, String> joinDateColumn = new TableColumn<>("JoinDate");
        joinDateColumn.setMinWidth(200);
        joinDateColumn.setCellValueFactory(new PropertyValueFactory<>("JD"));


        table = new TableView<>();
        table.setItems(getInformation());
        table.getColumns().addAll(idColumn,nameColumn,genderColumn,locColumn,joinDateColumn);


        idInput= new TextField();
        idInput.setPromptText("id");

        nameInput= new TextField();
        nameInput.setPromptText("Name");

        genderInput= new TextField();
        genderInput.setPromptText("gender");

        locInput=new TextField();
        locInput.setPromptText("location");

        joinDateInput=new TextField();
        joinDateInput.setPromptText("JoinDate");

        Button addButton= new Button ("Add");

        addButton.setOnAction(e-> addButtonClicked());

        Button deleteButton= new Button ("delete");

        deleteButton.setOnAction(e-> deleteButtonClicked());

        HBox newhbox= new HBox();
        newhbox.setPadding(new Insets(10,10,10,10));
        newhbox.setSpacing(10);
        newhbox.getChildren().addAll(idInput, nameInput, genderInput,locInput,joinDateInput, addButton,deleteButton);

        Button gobackButton=new Button("Go Back");
        gobackButton.setOnAction(e-> window.setScene(AdminScene));


        VBox newvBox = new VBox();
        newvBox.getChildren().addAll(table,newhbox,gobackButton);

        infoscene = new Scene(newvBox);
        infoscene.getStylesheets().add("admin.css");


        //Setting title of window
        window.setTitle("PickACar");
        window.setScene(MainScene);
        window.show();

     }

     public void addButtonClicked()
    {
         Information information=new Information();
        information.setId(idInput.getText());
       information.setName(nameInput.getText());
        information.setGender(genderInput.getText());
        information.setLoc(locInput.getText());
        information.setJD(joinDateInput.getText());

        table.getItems().add(information);
        idInput.clear();
        nameInput.clear();
        genderInput.clear();
        locInput.clear();
        joinDateInput.clear();

    }
    public void deleteButtonClicked()
    {
        ObservableList<Information> infoselected, allinfo;
        allinfo= table.getItems();
        infoselected=table.getSelectionModel().getSelectedItems();
        infoselected.forEach(allinfo::remove);

    }

    public ObservableList<Information> getInformation(){
        ObservableList<Information> informations = FXCollections.observableArrayList();
        informations.add(new Information("1","Ironman","male","Mirpur","10-Jan-2016" ));
        informations.add(new Information("2","Superman","male","IcodeBari","1-Mar-2016"));
        informations.add(new Information("3","coleslaw","Female","Mirpur","17-Feb-2016"));
        informations.add(new Information("4","ruby","male","MDpur","1-Apr-2016"));
        informations.add(new Information("5","slipknot","male","Gulshan-1","1-Jan-2016"));
        informations.add(new Information("6","sparta","male","Dhanmondi","20-Feb-2016"));
        informations.add(new Information("7","harry","male","Old Town","10-Mar-2016" ));
        informations.add(new Information("8","ron","male","Zigatola","13-feb-2016"));
        informations.add(new Information("9","tyrion","male","Kalabagan","19-Jan-2016"));
        informations.add(new Information("10","cersei","Female","Banani","10-Dec-2015" ));
        informations.add(new Information("11","khan","male","Mohakhali","15-Dec-2015"));
        informations.add(new Information("12","mahi","Female","Uttara","17-Dec-2015"));
        informations.add(new Information("13","sansa","Female","TownHall","31-Nov-2015" ));
        informations.add(new Information("14","smith","male","Mdpur","1-Mar-2016"));
        informations.add(new Information("15","will","male","Gulistan","5-Apr-2016"));

        return  informations;
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}






