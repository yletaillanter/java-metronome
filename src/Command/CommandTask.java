package Command;

import GUI.Controller;

import java.util.TimerTask;

/**
 * Created by hvallee on 02/11/2015.
 */
public class CommandTask extends TimerTask implements Command {

    Controller controller;
    int count = 0;

    public CommandTask(Controller cont) {
        controller = cont;
    }
    @Override
    public void execute() {

        if(count%4 == 0) {
            controller.markMeasure();
        }
        else {
            controller.markTime();
        }
        count++;
    }

    @Override
    public void run() {
        execute();
    }
}
