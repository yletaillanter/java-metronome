package Engine;
import Command.CommandTask;

import java.util.Timer;

/**
 * Created by hvallee on 02/11/2015.
 */
public class Clock {

    Timer timer;

    public Clock(CommandTask cmd, long time){
        timer = new Timer();
        timer.schedule(cmd, 0, time);
    };

    public void stop() {
        timer.cancel();
        timer.purge();
    }
}
