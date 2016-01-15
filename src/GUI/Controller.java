package GUI;

/**
 * Metronome's controller interface
 * @author hvallee
 *
 */
public interface Controller {

    /**
     * Start the engine
     */
    public void start();

    /**
     * Stop the engine
     */
    public void stop();

    /**
     * Set the mark time boolean to true
     */
    public void markTime();

    /**
     * Set the mark measure boolean to true
     */
    public void markMeasure();

    /**
     * Inc the beat per measure
     */
    public void inc();

    /**
     * Dec the beat per measure
     */
    public void dec();

    /**
     * Set the tempo
     * @param value
     */
    public void userSlider(int value);

    /**
     *
     * @return timeToMark
     */
    public boolean getTimeToMark();


    /**
     *
     * @return measureToMark
     */
    public boolean getMeasureToMark();

    /**
     * Put timeToMark to false
     */
    public void setTimeToMark();

    /**
     * Put measureToMark to false
     */
    public void setMeasureToMark();
}
