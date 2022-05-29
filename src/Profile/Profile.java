package Profile;

import carrentalservice.CarRentalService;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

/**
 *
 * @author CHHAITYY
 */
public class Profile extends Scene {
    
    Label MyProfileLabel;
    Label UserIDLabel;
    Label NameLabel;
    Label GenderLabel;
    Label LocationLabel;
    TextField UserIDTextField;
    TextField NameTextField;
    TextField GenderTextField;
    TextField LocationTextField;
    
    
    
	static VBox root = new VBox(10);
	
	public Profile(){
		super(root,500,350);

                MyProfileLabel=new Label("My Profile");
                MyProfileLabel.setId("label-custom");
                UserIDLabel=new Label("ID");
                NameLabel=new Label("Name");
                GenderLabel=new Label("Gender");
                LocationLabel=new Label("Location");

                UserIDTextField=new TextField();
                UserIDTextField.setMinWidth(Region.USE_PREF_SIZE);
                UserIDTextField.setMaxWidth(Region.USE_PREF_SIZE);
                
                NameTextField=new TextField();
                NameTextField.setMinWidth(Region.USE_PREF_SIZE);
                NameTextField.setMaxWidth(Region.USE_PREF_SIZE);
                
                GenderTextField=new TextField();
                GenderTextField.setMinWidth(Region.USE_PREF_SIZE);
                GenderTextField.setMaxWidth(Region.USE_PREF_SIZE);
                
                LocationTextField=new TextField();
                LocationTextField.setMinWidth(Region.USE_PREF_SIZE);
                LocationTextField.setMaxWidth(Region.USE_PREF_SIZE);
                
		root.setPadding(new Insets(10));
		root.getChildren().addAll(MyProfileLabel,UserIDLabel,UserIDTextField,NameLabel,NameTextField,GenderLabel,GenderTextField,LocationLabel,LocationTextField);
                root.setAlignment(Pos.CENTER);
                root.getStylesheets().add("ProViper.css");   
	}
}
