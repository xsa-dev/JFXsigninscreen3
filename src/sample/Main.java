package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    Stage stage;


    @Override
    public void start(Stage primaryStage) throws Exception{
            this.stage = primaryStage;
            mainWindow();

    }

    private void mainWindow() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("sample.fxml"));
            AnchorPane pane = loader.load();
            Scene scene = new Scene(pane);
            scene.getStylesheets().addAll(Main.class.getResource("stylesheet.css").toExternalForm());
            stage.setScene(scene);
            stage.setTitle("Portrait login");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
