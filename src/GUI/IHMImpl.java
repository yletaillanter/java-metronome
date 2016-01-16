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

    private ControllerAdapter controllerAdapter;

    @FXML
    private Slider slider;

    @FXML
    private Text sliderLabel;

    @FXML
    private Circle timeLed;

    @FXML
    private Circle measureLed;

    public IHMImpl(){
        controllerAdapter = new ControllerAdapterImpl();
        Timer t = new Timer();
        t.scheduleAtFixedRate(
                new TimerTask()
                {
                    public void run()
                    {
                        if(controllerAdapter.getMeasureToMarkAdapter()) {
                            markMeasureIHM();
                        }
                        else if(controllerAdapter.getTimeToMarkAdapter()) {
                            markTimeIHM();
                        }
                    }
                },
                0,      // run first occurrence immediately
                50); // run every two seconds
    }

    // For test purpose
    public IHMImpl(ControllerAdapter controllerAdapter) {
        this.controllerAdapter = controllerAdapter;
        Timer t = new Timer();
        t.scheduleAtFixedRate(
                new TimerTask()
                {
                    public void run()
                    {
                        if(controllerAdapter.getMeasureToMarkAdapter()) {
                            markMeasureIHM();
                        }
                        else if(controllerAdapter.getTimeToMarkAdapter()) {
                            markTimeIHM();
                        }
                    }
                },
                0,      // run first occurrence immediately
                50); // run every two seconds
    }

    @Override
    public void startIHM() {
        controllerAdapter.startAdapter();
    }

    @Override
    public void stopIHM() {
        controllerAdapter.stopAdapter();
    }

    @Override
    public void markTimeIHM() {
        timeLed.setFill(Color.YELLOW);
        play("src/res/low.wav");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timeLed.setFill(Color.DARKGREY);
        controllerAdapter.setTimeToMarkAdapter();
    }

    @Override
    public void markMeasureIHM() {
        measureLed.setFill(Color.YELLOW);
        timeLed.setFill(Color.YELLOW);
        play("src/res/high.wav");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        measureLed.setFill(Color.DARKGREY);
        timeLed.setFill(Color.DARKGREY);
        controllerAdapter.setMeasureToMarkAdapter();
        controllerAdapter.setTimeToMarkAdapter();
    }

    @Override
    public void incIHM() {
        controllerAdapter.incAdapter();
    }

    @Override
    public void decIHM() {
        controllerAdapter.decAdapter();
    }

    public static void play(String filename)
    {
        Media sound = new Media(new File(filename).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }

    public void userSliderIHM() {
        controllerAdapter.userSliderAdapter((int)slider.getValue());
    }

    public void updateSliderLabel() {
        Platform.runLater(() -> sliderLabel.textProperty().setValue(
                String.valueOf((int) slider.getValue())));
    }
}
