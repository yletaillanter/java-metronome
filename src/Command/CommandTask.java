package Command;

import java.util.TimerTask;

/**
 * Created by hvallee on 02/11/2015.
 */
public class CommandTask extends TimerTask implements Command {

    int count = 0;

    @Override
    public void execute() {

        if(count%4 == 0) {
            System.out.println("Mark time");
            System.out.println("Mark measure");
        }
        else {
            System.out.println("Mark time");
        }
        count++;
    }

    @Override
    public void run() {
        execute();
    }
}
