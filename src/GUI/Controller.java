package GUI;

import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public interface Controller extends Initializable {


    @Override
    default void initialize(URL location, ResourceBundle resources) {

    }

    public void start();

    public void stop();

    public void markTime();

    public void markMeasure();

    public void inc();

    public void dec();

    public void userSlider(int value);

    public boolean getTimeToMark();

    public boolean getMeasureToMark();

    public void setTimeToMark();

    public void setMeasureToMark();
}
