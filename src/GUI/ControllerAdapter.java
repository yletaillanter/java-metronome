package GUI;

/**
 * Interface adapter pour faire la jointure entre le controlleur et l'IHM
 * @author hvallee
 *
 */
public interface ControllerAdapter {

    /**
     * Adapter for start button
     */
    public void startAdapter();

    /**
     * Adapter for stop button
     */
    public void stopAdapter();

    /**
     * Adapter for marking time
     */
    public void markTimeAdapter();

    /**
     * Adapter for marking measure
     */
    public void markMeasureAdapter();

    /**
     * Adapter for inc button
     */
    public void incAdapter();

    /**
     * Adapter for dec button
     */
    public void decAdapter();

    /**
     * Adapter for tempo slider
     * @param value
     */
    public void userSliderAdapter(int value);

    /**
     *
     * @return timeToMark boolean
     */
    public boolean getTimeToMarkAdapter();

    /**
     *
     * @return measureToMark boolean
     */
    public boolean getMeasureToMarkAdapter();

    /**
     * Set timeToMark
     */
    public void setTimeToMarkAdapter();

    /**
     * Set measureToMark
     */
    public void setMeasureToMarkAdapter();
}
