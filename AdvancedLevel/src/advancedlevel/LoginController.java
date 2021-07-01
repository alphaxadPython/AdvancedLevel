
package advancedlevel;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class LoginController implements Initializable {

    @FXML
    private Button login;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loginUser(MouseEvent event) {
          try {
            Parent loader = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
            Stage stage = (Stage) login.getScene().getWindow();

            Scene scene = new Scene(loader);
            stage.setScene(scene);
        
//            setting stage on center
             javafx.geometry.Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
            stage.setX((primScreenBounds.getWidth() - stage.getWidth()) / 2);
            stage.setY((primScreenBounds.getHeight() - stage.getHeight()) / 2);
            
        }catch (IOException io){
            io.printStackTrace();
        }
    }
    
    
}
