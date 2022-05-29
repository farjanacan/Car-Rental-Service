


package profilelist;
 
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
public class coleslaw extends Scene {
    
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
	
	public coleslaw(){
		super(root,300,300);

            
                UserIDLabel=new Label("User ID:3");
                NameLabel=new Label("Name: colselaw");
                GenderLabel=new Label("Gender:Female");
                LocationLabel=new Label("Location: Mirpur");
                JoinDateLabel=new Label("Join Date: 17-Feb-2016");
                

		root.setPadding(new Insets(10));
		root.getChildren().addAll(UserIDLabel,NameLabel,GenderLabel,LocationLabel, JoinDateLabel);
                root.setAlignment(Pos.CENTER);
                root.getStylesheets().add("admin.css");   
                
                
      
	}
}

