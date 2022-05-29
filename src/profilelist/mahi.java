package profilelist;

/**
 *
 * @author user pc
 */


import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;

/**
 *
 * @author user pc
 */
public class mahi extends Scene {
    
    Label MyProfileLabel;
    Label UserIDLabel;
    Label NameLabel;
    Label GenderLabel;
    Label LocationLabel;
    Label JoinDateLabel;
    TextField UserIDTextField;
    TextField NameTextField;
    TextField GenderTextField;
    TextField LocationTextField;
    
    
    
	static VBox root = new VBox(10);
	
	public mahi(){
		super(root,300,300);

            
                UserIDLabel=new Label("Username:12");
                NameLabel=new Label("Name: mahi");
                GenderLabel=new Label("Gender:Female");
                LocationLabel=new Label("Location: Uttara");
                 JoinDateLabel=new Label("Join Date: 17-Dec-2015");

		root.setPadding(new Insets(10));
		root.getChildren().addAll(UserIDLabel,NameLabel,GenderLabel,LocationLabel,JoinDateLabel);
                root.setAlignment(Pos.CENTER);
                root.getStylesheets().add("admin.css");   
                
                
      
	}
}

