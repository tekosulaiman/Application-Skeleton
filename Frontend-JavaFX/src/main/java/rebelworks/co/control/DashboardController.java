package rebelworks.co.control;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
    @FXML
    private VBox left_menu_parent_vbox;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println(left_menu_parent_vbox);
    }
}
