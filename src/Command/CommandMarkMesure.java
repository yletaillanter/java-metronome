package Command;

import GUI.ControllerImpl;

/**
 * Created by hvallee on 02/10/2015.
 */
public class CommandMarkMesure implements Command {

    private ControllerImpl controller;

    public CommandMarkMesure(ControllerImpl controller) {
        this.controller = controller;
    }

    @Override
    public void execute() {
        controller.markMesure();
    }
}
