package GUI;

import Engine.Engine;
import Engine.EngineImpl;

/**
 * Metronome's controller class
 * @author hvallee
 *
 */
public class ControllerImpl implements Controller {

    private Engine engine;

    public boolean timeToMark;

    public boolean measureToMark;

    public ControllerImpl() {

        engine = new EngineImpl(this);
        timeToMark = false;
        measureToMark = false;
    }

    /**
     * Set the mark time boolean to true
     */
    public void markTime() {
        timeToMark = true;
    }

    /**
     * Set the mark measure boolean to true
     */
    public void markMeasure() {
        measureToMark = true;
    }

    /**
     * Inc the beat per measure
     */
    @Override
    public void inc() {
        engine.setBeatPerMeasure(1);
    }

    /**
     * Dec the beat per measure
     */
    @Override
    public void dec() {
        engine.setBeatPerMeasure(-1);
    }

    /**
     * Start the engine
     */
    @Override
    public void start() {
        engine.setState(true);
    }

    /**
     * Stop the engine
     */
    @Override
    public void stop() {
        engine.setState(false);
    }

    /**
     * Set the tempo
     * @param value
     */
    public void userSlider(int value) {
        if (engine != null) {
            engine.setTempo(Math.round(value));
        }
    }

    /**
     *
     * @return timeToMark
     */
    @Override
    public boolean getTimeToMark() {
        return timeToMark;
    }

    /**
     *
     * @return measureToMark
     */
    @Override
    public boolean getMeasureToMark() {
        return measureToMark;
    }

    /**
     * Put timeToMark to false
     */
    @Override
    public void setTimeToMark() {
        timeToMark = false;
    }

    /**
     * Put measureToMark to false
     */
    @Override
    public void setMeasureToMark() {
        measureToMark = false;
    }

}
