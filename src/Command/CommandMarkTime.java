package Command;

import GUI.ControllerImpl;

/**
 * Created by hvallee on 02/10/2015.
 */
public class CommandMarkTime implements Command {

    private ControllerImpl controller;

    public CommandMarkTime(ControllerImpl controller) {
        this.controller = controller;
    }

    @Override
    public void execute() {
        controller.markTime();
    }
}
