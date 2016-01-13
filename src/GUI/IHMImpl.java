package GUI;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by hugov on 13/01/2016.
 */
public class IHMImpl implements IHM{

    private ControllerImpl controller;

    @FXML
    private Slider slider;

    @FXML
    private Text sliderLabel;

    @FXML
    private Circle timeLed;

    @FXML
    private Circle measureLed;

    public IHMImpl(){
        controller = new ControllerImpl();
        Timer t = new Timer();
        t.scheduleAtFixedRate(
                new TimerTask()
                {
                    public void run()
                    {
                        if(controller.getMeasureToMark()) {
                            markMeasureIHM();
                        }
                        else if(controller.getTimeToMark()) {
                            markTimeIHM();
                        }
                    }
                },
                0,      // run first occurrence immediatetly
                100); // run every two seconds
    }

    @Override
    public void startIHM() {
        controller.start();
    }

    @Override
    public void stopIHM() {
        controller.stop();
    }

    @Override
    public void markTimeIHM() {
        Platform.runLater(() -> timeLed.setFill(Color.YELLOW));
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Platform.runLater(() -> timeLed.setFill(Color.DARKGREY));
        play("src/res/low.wav");
        controller.setTimeToMark();
    }

    @Override
    public void markMeasureIHM() {
        System.out.println("Marking measure");
        Platform.runLater(() -> measureLed.setFill(Color.YELLOW));
        Platform.runLater(() -> timeLed.setFill(Color.YELLOW));
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Platform.runLater(() -> measureLed.setFill(Color.DARKGREY));
        Platform.runLater(() -> timeLed.setFill(Color.DARKGREY));
        play("src/res/high.wav");
        controller.setMeasureToMark();
        controller.setTimeToMark();
    }

    @Override
    public void incIHM() {
        controller.inc();
    }

    @Override
    public void decIHM() {
        controller.dec();
    }

    public static void play(String filename)
    {
        Media sound = new Media(new File(filename).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }

    public void userSliderIHM() {
       controller.userSlider((int)slider.getValue());
    }

    public void updateSliderLabel() {
        Platform.runLater(() -> sliderLabel.textProperty().setValue(
                String.valueOf((int) slider.getValue())));
    }
}
