package GUI;

import Engine.Engine;

public class ControllerImpl implements Controller{

    private Engine engine;

    public ControllerImpl(Engine engine) {
        this.engine = engine;
    }

    public void markTime() {
    }

    public void markMeasure() {
    }

    @Override
    public void start() {
        engine.setState(true);
    }

    @Override
    public void stop() {
        engine.setState(false);
    }
}
