package Command;

import GUI.Controller;
import javafx.application.Platform;

import java.util.TimerTask;

/**
 * This command create an Horloge to manage when we should mark time or measure.
 * Created by hvallee on 02/11/2015.
 */
public class CommandTask extends TimerTask implements Command {

    Controller controller;
    int count = 0;
    int beatPerMeasure = 0;

    public CommandTask(Controller cont, int beat) {
        controller = cont;
        beatPerMeasure = beat;
    }
    @Override
    public void execute() {

        if(count%beatPerMeasure == 0) {
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
