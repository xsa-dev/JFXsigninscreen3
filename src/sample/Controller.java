package sample;

import javafx.animation.RotateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML
    private ImageView image;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        RotateTransition rt = new RotateTransition(Duration.seconds(35), image);
        rt.setByAngle(9*360);
        rt.play();
    }
}
