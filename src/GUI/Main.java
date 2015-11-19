package GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/GUI/sample.fxml"));
        BorderPane view = loader.load();

        stage.setTitle("Metronome AOC");
        stage.setScene(new Scene(view, 600, 550));
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(Main.class, args);
    }

}
