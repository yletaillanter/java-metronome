package GUI;

import Engine.Engine;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerImpl implements Controller {

    @FXML
    private Button myButton;

    public ControllerImpl() {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // TODO le reste du metronome
        //myButton.setOnAction(event -> setLogger());
    }

    public void setLogger() {
        System.out.println("TEST");
    }

    private Engine engine;

    public ControllerImpl(Engine engine) {
        this.engine = engine;
    }
    public void markTime() {
    }

    public void markMeasure() {
    }

    @Override
    public void start() {
        engine.setState(true);
    }

    @Override
    public void stop() {
        engine.setState(false);
    }
}
