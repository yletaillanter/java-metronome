package GUI;

import Engine.Engine;
import Engine.EngineImpl;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.paint.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

import java.awt.*;
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
    @FXML
    private Text sliderLabel;
    @FXML
    private Circle timeLed;
    @FXML
    private Circle measureLed;

    /**
     *  Constructor controllerImpl
     */
    public ControllerImpl() {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        engine = new EngineImpl(this);

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
        timeLed.setFill(Color.YELLOW);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timeLed.setFill(Color.DARKGREY);
    }

    public void markMeasure() {
        System.out.println("Marking measure");
        measureLed.setFill(Color.YELLOW);
        timeLed.setFill(Color.YELLOW);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        measureLed.setFill(Color.DARKGREY);
        timeLed.setFill(Color.DARKGREY);
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
        engine.setTempo((int)Math.round(slider.getValue()));
    }

    public void updateSliderLabel() {
        sliderLabel.textProperty().setValue(
                String.valueOf((int) slider.getValue()));
    }
}
