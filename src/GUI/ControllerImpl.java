package GUI;

import Engine.Engine;
import Engine.EngineImpl;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerImpl implements Controller {

    private Engine engine;

    @FXML
    private Button playButton;
    @FXML
    private Button stopButton;
    @FXML
    private Button incButton;
    @FXML
    private Button decButton;

    public ControllerImpl() {
    }

    public ControllerImpl(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        engine = new EngineImpl();

        playButton.setOnAction(
                (event) -> triggerLogger(event.getSource().toString())

        );
        stopButton.setOnAction((event) -> triggerLogger(event.getSource().toString()));
        incButton.setOnAction((event) -> triggerLogger(event.getSource().toString()));
        decButton.setOnAction((event) -> triggerLogger(event.getSource().toString()));
    }

    public void triggerLogger(String name) {
        System.out.println("Button pressed:" + name);
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
