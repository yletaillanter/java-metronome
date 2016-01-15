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

    public void markTime() {
        timeToMark = true;
    }

    public void markMeasure() {
        measureToMark = true;
    }

    @Override
    public void inc() {
        engine.setBeatPerMeasure(1);
    }

    @Override
    public void dec() {
        engine.setBeatPerMeasure(-1);
    }

    @Override
    public void start() {
        engine.setState(true);
    }

    @Override
    public void stop() {
        engine.setState(false);
    }

    public void userSlider(int value) {
        if (engine != null) {
            engine.setTempo(Math.round(value));
        }
    }

    @Override
    public boolean getTimeToMark() {
        return timeToMark;
    }

    @Override
    public boolean getMeasureToMark() {
        return measureToMark;
    }

    @Override
    public void setTimeToMark() {
        timeToMark = false;
    }

    @Override
    public void setMeasureToMark() {
        measureToMark = false;
    }

}
