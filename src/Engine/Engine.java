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
     * @return
     */
    int getTempo();

    /**
     *
     * @param measure
     */
    void setBeatPerMeasure(int measure);

    /**
     *
     * @return
     */
    int getBeatPerMeasure();

    /**
     *
     * @param state
     */
    void setState(boolean state);

    /**
     *
     * @return
     */
    boolean getState();

}
