package GUI;

/**
 * Interface adapter pour faire la jointure entre le controlleur et l'IHM
 * @author hvallee
 *
 */
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
