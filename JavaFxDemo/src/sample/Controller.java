package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextField textfield_username;

    @FXML
    private TextField textfield_password;

    @FXML
    private Button button_login;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private void handleLoginClicked(MouseEvent event){

        if(event.getSource()==button_login){
            String username = textfield_username.getText();
            String password = textfield_password.getText();

            if(username.equals("shubham") && password.equals("admin")){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Success");
                alert.setContentText("Login Successful");
                alert.showAndWait();
            }else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText("Error");
                alert.setContentText("Please check credentials");
                alert.showAndWait();
            }
        }

    }

}
