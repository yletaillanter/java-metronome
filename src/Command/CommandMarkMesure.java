package Command;

/**
 * Created by hvallee on 02/10/2015.
 */
public class CommandMarkMesure implements Command {

    private GUI.Controller controller;

    public CommandMarkMesure(GUI.Controller controller) {
        this.controller = controller;
    }

    @Override
    public void execute() {
        controller.markMesure();
    }
}
