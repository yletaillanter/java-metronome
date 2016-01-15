package test;

import Command.CommandTask;
import GUI.Controller;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import static org.mockito.Mockito.*;

/**
 * Created by hvallee on 15/01/2016.
 */
public class CommandTaskTest {

    Controller controller;
    CommandTask command;

    @Before
    public void setUp() throws Exception {
        controller = Mockito.mock(Controller.class);
        command = new CommandTask(controller, 2);
    }

    @Test
    public void testExecute() throws Exception {
        command.execute();
        verify(controller, atLeastOnce()).markMeasure();
        command.execute();
        verify(controller, atLeastOnce()).markTime();
        command.execute();
        verify(controller, atLeastOnce()).markMeasure();
        command.execute();
    }
}