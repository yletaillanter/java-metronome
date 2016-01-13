package GUI;

import Engine.Engine;
import Engine.EngineImpl;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerImpl implements Controller {

    private Engine engine;

    public boolean timeToMark;

    public boolean measureToMark;

    public ControllerImpl() {

        engine = new EngineImpl(this);
        timeToMark = true;
        measureToMark = true;
    }


    public void markTime() {
        timeToMark = true;
    }

    public void markMeasure() {
        measureToMark = true;
    }

    @Override
    public void inc() {
        engine.setBeatPerMeasure(1);
    }

    @Override
    public void dec() {
        engine.setBeatPerMeasure(-1);
    }

    @Override
    public void start() {
        engine.setState(true);
    }

    @Override
    public void stop() {
        engine.setState(false);
    }

    public void userSlider(int value) {
        if (engine != null) {
            engine.setTempo(Math.round(value));
        }
    }

    @Override
    public boolean getTimeToMark() {
        return timeToMark;
    }

    @Override
    public boolean getMeasureToMark() {
        return measureToMark;
    }

    @Override
    public void setTimeToMark() {
        timeToMark = false;
    }

    @Override
    public void setMeasureToMark() {
        measureToMark = false;
    }

}
