package Engine;

import Command.CommandTask;
import GUI.Controller;

/**
 * Created by hvallee on 02/10/2015.
 */
public class EngineImpl implements Engine{

    private int tempo;
    private int beatPerMeasure;
    private boolean state;
    Clock clock;
    Controller controller;

    public EngineImpl(Controller cont) {
        tempo = 30;
        state = false;
        beatPerMeasure = 4; //Todo: Calculate value
        controller = cont;
    }

    @Override
    public void setTempo(int tempo) {
        this.tempo = tempo;
        if(clock != null){
            clock.stop();
            startClock();
        }
    }

    @Override
    public int getTempo() {
        return this.tempo;
    }

    @Override
    public void setBeatPerMeasure(int measure) {
        switch (measure) {
            case -1:
               if(this.beatPerMeasure > 2) {
                   this.beatPerMeasure --;
               }
                break;
            case 1:
                if(this.beatPerMeasure < 7) {
                    this.beatPerMeasure ++;
                }
                break;
            default:
                break;
        }
        if(clock != null){
            clock.stop();
            startClock();
        }
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
            if (clock != null) {
                clock.stop();
            }
        }
    }

    @Override
    public boolean getState() {
        return this.state;
    }

    public void startClock() {
        long markPerMinute = Math.round((60 / (float) tempo) * 1000);
        System.out.println(markPerMinute);
        CommandTask com = new CommandTask(controller, beatPerMeasure);
        clock = new Clock(com, markPerMinute);
    }

    //For test purpose
    public void testStartClock(Clock clock, CommandTask command) {
        long markPerMinute = Math.round((60 / (float) tempo) * 1000);
        System.out.println(markPerMinute);
        CommandTask com = command;
        this.clock = clock;
    }
}
