
package advancedlevel;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TabPane;
import javafx.scene.input.MouseEvent;


public class DashboardController implements Initializable {

    @FXML
    private Button profile5;
    @FXML
    private Button profile6;
    
    @FXML
    private Button LinkForm5;
    @FXML
    private Button linkForm6;
    @FXML
    private TabPane mainTab;
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void combiDetail(MouseEvent event) {
        mainTab.getSelectionModel().select(8);
    }

   
    @FXML
    private void AddStaff(MouseEvent event) {
        mainTab.getSelectionModel().select(7);

    }

    @FXML
    private void formFiveProfile(MouseEvent event) {
        mainTab.getSelectionModel().select(4);

    }

    @FXML
    private void AddStudent(MouseEvent event) {
        mainTab.getSelectionModel().select(6);

    }

    @FXML
    private void formSixProfile(MouseEvent event) {
    }

    

    @FXML
    private void viewForm5(MouseEvent event) {
    }

    @FXML
    private void viewForm6(MouseEvent event) {
    }

    @FXML
    private void godashboard(MouseEvent event) {
    mainTab.getSelectionModel().select(0);

    }

    @FXML
    private void goForm5(MouseEvent event) {
     mainTab.getSelectionModel().select(1);

    }

    @FXML
    private void goForm6(MouseEvent event) {
    mainTab.getSelectionModel().select(2);

    }

    @FXML
    private void goTeachers(MouseEvent event) {
     mainTab.getSelectionModel().select(3);

    }
    
}
