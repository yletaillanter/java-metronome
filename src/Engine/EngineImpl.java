package Engine;

/**
 * Created by hvallee on 02/10/2015.
 */
public class EngineImpl implements Engine{

    private int tempo;
    private int beatPerMeasure;
    private boolean state;


    public EngineImpl() {
        tempo = 90;
        state = false;
        beatPerMeasure = 0; //Todo: Calculate value
    }

    @Override
    public void setTempo(int tempo) {
        this.tempo = tempo;
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
    }

    @Override
    public boolean getState() {
        return this.state;
    }
}
