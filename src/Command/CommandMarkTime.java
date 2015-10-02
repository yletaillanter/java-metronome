package Command;

/**
 * Created by hvallee on 02/10/2015.
 */
public class CommandMarkTime implements Command {

    private GUI.Controller controller;

    public CommandMarkTime(GUI.Controller controller) {
        this.controller = controller;
    }

    @Override
    public void execute() {
        controller.markTime();
    }
}
