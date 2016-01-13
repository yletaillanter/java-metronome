package GUI;

import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public interface ControllerAdapter {

    public void startAdapter();

    public void stopAdapter();

    public void markTimeAdapter();

    public void markMeasureAdapter();

    public void incAdapter();

    public void decAdapter();

    public void userSliderAdapter(int value);

    public boolean getTimeToMarkAdapter();

    public boolean getMeasureToMarkAdapter();

    public void setTimeToMarkAdapter();

    public void setMeasureToMarkAdapter();
}
