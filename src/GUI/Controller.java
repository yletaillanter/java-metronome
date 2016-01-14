package GUI;

/**
 * Metronome's controller interface
 * @author hvallee
 *
 */
public interface Controller {


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
