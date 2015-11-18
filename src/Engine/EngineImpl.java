package Engine;

import Command.CommandTask;
import GUI.Main;

/**
 * Created by hvallee on 02/10/2015.
 */
public class EngineImpl implements Engine{

    private int tempo;
    private int beatPerMeasure;
    private boolean state;
    Clock clock;

    public EngineImpl() {
        tempo = 30;
        state = false;
        beatPerMeasure = 0; //Todo: Calculate value
    }

    @Override
    public void setTempo(int tempo) {
        this.tempo = tempo;
        clock.stop();
        startClock();
    }

    @Override
    public int getTempo() {
        return this.tempo;
    }

    @Override
    public void setBeatPerMeasure(int measure) {
        this.beatPerMeasure = measure;
    }

    @Override
    public int getBeatPerMeasure() {
        return this.beatPerMeasure;
    }

    @Override
    public void setState(boolean state) {
        this.state = state;
        System.out.println("Engine mode:" + getState());
        if(state) {
            startClock();
        }
        else {
            clock.stop();
        }

    }

    @Override
    public boolean getState() {
        return this.state;
    }

    public void startClock() {
        long markPerMinute = Math.round((60 / (float) tempo) * 1000);
        System.out.println(markPerMinute);
        CommandTask com = new CommandTask();
        clock = new Clock(com, markPerMinute);
    }
}
