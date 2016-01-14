package Engine;

import GUI.Controller;

/**
 * Created by yoannlt on 02/10/15.
 */
public interface Engine {

    /**
     *
     * @param tempo
     */
    void setTempo(int tempo);

    /**
     *
     * @return tempo
     */
    int getTempo();

    /**
     * Set the number of beat per measure
     * @param measure
     */
    void setBeatPerMeasure(int measure);

    /**
     *
     * @return the number of beat per measure
     */
    int getBeatPerMeasure();

    /**
     * Put the metronome on or off
     * @param state
     */
    void setState(boolean state);

    /**
     *
     * @return state
     */
    boolean getState();

}
