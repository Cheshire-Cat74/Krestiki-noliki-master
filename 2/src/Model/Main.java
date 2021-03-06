package Model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public Main() {
    }

    public void start(Stage primaryStage) throws Exception {
        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("/View/sample.fxml"));
        primaryStage.setTitle("My XO GUI");
        primaryStage.setScene(new Scene(root, 635.0D, 435.0D));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
