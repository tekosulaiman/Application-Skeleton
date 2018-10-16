package rebelworks.co;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        BorderPane root = FXMLLoader.load(getClass().getResource("/index.fxml"));

        primaryStage.setTitle("Dashboard");
        primaryStage.setMaximized(true);
        /*primaryStage.setWidth(450);
        primaryStage.setHeight(350);*/

        Scene scene = new Scene(root);
        scene.getStylesheets().add(this.getClass().getResource("/assets/css/dashboard.css").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
