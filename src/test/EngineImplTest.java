package test;

import Command.CommandTask;
import Engine.Clock;
import Engine.EngineImpl;
import GUI.Controller;
import GUI.ControllerImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

/**
 * Created by Yoann on 15/01/2016.
 */
public class EngineImplTest {

    EngineImpl engineImpl;
    Controller controller;

    @Before
    public void setUp() throws Exception {
        controller = Mockito.mock(ControllerImpl.class);
        //new ControllerImpl();
        engineImpl = new EngineImpl(controller);
    }

    @Test
    public void testSetTempo() throws Exception {
        int[] myTempos = {50, 150, 35, 58};
        // Print all the array elements
        for (int i = 0; i < myTempos.length; i++) {
            engineImpl.setTempo(myTempos[i]);
            Assert.assertEquals(myTempos[i], engineImpl.getTempo());
        }
    }

    @Test
    public void testSetBeatPerMeasure() throws Exception {
        //4 at first
        Assert.assertEquals(4, engineImpl.getBeatPerMeasure());

        // Test still 4 if wrong value
        engineImpl.setBeatPerMeasure(42);
        Assert.assertEquals(4, engineImpl.getBeatPerMeasure());
        engineImpl.setBeatPerMeasure(-2);
        Assert.assertEquals(4, engineImpl.getBeatPerMeasure());

        // Test -1
        engineImpl.setBeatPerMeasure(-1);
        Assert.assertEquals(3, engineImpl.getBeatPerMeasure());

        // Test +1
        engineImpl.setBeatPerMeasure(1);
        Assert.assertEquals(4, engineImpl.getBeatPerMeasure());

        // Test minimum limit
        for (int i = 1; i < 10; i++) {
            engineImpl.setBeatPerMeasure(-1);
        }
        Assert.assertEquals(2, engineImpl.getBeatPerMeasure());

        // Test maximum limit
        for (int i = 1; i < 10; i++) {
            engineImpl.setBeatPerMeasure(1);
        }
        Assert.assertEquals(7, engineImpl.getBeatPerMeasure());
    }


    @Test
    public void testSetState() throws Exception {
        engineImpl.setState(true);
        Assert.assertTrue(engineImpl.getState()==true);

        engineImpl.setState(false);
        Assert.assertTrue(engineImpl.getState()==false);

    }

    @Test
    public void testStartClock() throws Exception {
        engineImpl.startClock();

        // On laisse le temps de marquer la mesure...
        Thread.sleep(2000);

        // Assert controller was called by commmand
        verify(controller, atLeastOnce()).markMeasure();
        verify(controller, atLeastOnce()).markTime();
    }
}