package GUI;

import Engine.Engine;
import Engine.EngineImpl;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;

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
    @FXML
    private Slider slider;

    /**
     *  Constructor controllerImpl
     */
    public ControllerImpl() {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        engine = new EngineImpl();

        playButton.setOnAction((event) -> start());
        stopButton.setOnAction((event) -> stop());
        incButton.setOnAction((event) -> triggerLogger(event.getSource().toString()));
        decButton.setOnAction((event) -> triggerLogger(event.getSource().toString()));
    }

    public void triggerLogger(String name) {
        System.out.println("Button pressed:" + name);
    }


    public void markTime() {
        System.out.println("Marking time");
    }

    public void markMeasure() {
        System.out.println("Marking measure");
    }

    @Override
    public void start() {
        engine.setState(true);
    }

    @Override
    public void stop() {
        engine.setState(false);
    }

    public void userSlider() {
        System.out.println(slider.getValue());
    }
}
