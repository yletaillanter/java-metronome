package GUI;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import Engine.Engine;
import Engine.EngineImpl;

public class Main extends Application {

    private Controller controller;
    private Engine engine;

    private Button play;
    private Button stop;
    private Button inc;
    private Button dec;

    @Override
    public void start(Stage stage) throws Exception {

        GridPane root = (GridPane) FXMLLoader.load(getClass().getResource("/GUI/sample.fxml"));

        stage.setTitle("FXML Welcome");
        stage.setScene(new Scene(root, 300, 275));
        stage.show();

        //engine = new EngineImpl();
        //controller = new ControllerImpl(engine);

        //play.setOnAction((ActionEvent event) -> { controller.start(); });
        //stop.setOnAction((ActionEvent event) -> { controller.stop(); });

        /*
        play.setOnAction((ActionEvent event) -> { System.out.println("Play"); });
        stop.setOnAction((ActionEvent event) -> { System.out.println("Stop"); });
        inc.setOnAction((ActionEvent event) -> {
        });
        dec.setOnAction((ActionEvent event) -> {
            System.out.println("Dec");
        });
        */
    }

    public static void main(String[] args) {
        Application.launch(Main.class, args);
    }


}
