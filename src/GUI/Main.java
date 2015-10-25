package GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import Engine.Engine;

public class Main extends Application {

    private Controller controller;
    private Engine engine;

    private Button play;
    private Button stop;
    private Button inc;
    private Button dec;

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
