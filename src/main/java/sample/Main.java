package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

//    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(Main.class.getClassLoader().getResource("views/sample.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root, 480, 480);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        scene.getStylesheets().add(Main.class.getClassLoader().getResource("css/board.css").toExternalForm());
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
