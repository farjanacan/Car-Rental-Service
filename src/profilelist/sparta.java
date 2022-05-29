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
public class sparta extends Scene {
    
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
	
	public sparta(){
		super(root,300,300);

            
                UserIDLabel=new Label("User ID:6");
                NameLabel=new Label("Name: sparta");
                GenderLabel=new Label("Gender:male");
                LocationLabel=new Label("Location: Dhanmondi");
                JoinDateLabel=new Label("Join Date: 20-Feb-2016");
                

		root.setPadding(new Insets(10));
		root.getChildren().addAll(UserIDLabel,NameLabel,GenderLabel,LocationLabel, JoinDateLabel);
                root.setAlignment(Pos.CENTER);
                root.getStylesheets().add("admin.css");   
                
                
      
	}
}

