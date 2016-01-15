package test;

import Engine.EngineImpl;
import GUI.Controller;
import GUI.ControllerImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by hvallee on 15/01/2016.
 */
public class ControllerImplTest {

    Controller controller;
    EngineImpl engine;

    @Before
    public void setUp() throws Exception {
        engine = Mockito.mock(EngineImpl.class);
        controller = new ControllerImpl(engine);
    }

    @Test
    public void testMarkTime() throws Exception {
        controller.markTime();
        Assert.assertTrue(controller.getTimeToMark());
    }

    @Test
    public void testMarkMeasure() throws Exception {
        controller.markMeasure();
        Assert.assertTrue(controller.getMeasureToMark());
    }

    @Test
    public void testInc() throws Exception {
        controller.inc();
        verify(engine, atLeastOnce()).setBeatPerMeasure(1);
    }

    @Test
    public void testDec() throws Exception {
        controller.dec();
        verify(engine, atLeastOnce()).setBeatPerMeasure(-1);
    }

    @Test
    public void testStart() throws Exception {
        controller.start();
        verify(engine, atLeastOnce()).setState(true);

        // Create a spy with a real object to test the internal state
        EngineImpl engineSpy = new EngineImpl(controller);
        EngineImpl spy = spy(engineSpy);

        when(spy.getState()).thenReturn(true);
    }

    @Test
    public void testStop() throws Exception {
        controller.stop();
        verify(engine, atLeastOnce()).setState(false);

        // Create a spy with a real object to test the internal state
        EngineImpl engineSpy = new EngineImpl(controller);
        EngineImpl spy = spy(engineSpy);

        when(spy.getState()).thenReturn(true);
    }

    @Test
    public void testUserSlider() throws Exception {
        controller.userSlider(100);
        verify(engine, atLeastOnce()).setTempo(100);

        // Create a spy with a real object to test the internal state
        EngineImpl engineSpy = new EngineImpl(controller);
        EngineImpl spy = spy(engineSpy);

        when(spy.getTempo()).thenReturn(100);
    }

    @Test
    public void testSetTimeToMark() throws Exception {
        controller.setTimeToMark();
        Assert.assertFalse(controller.getTimeToMark());
    }

    @Test
    public void testSetMeasureToMark() throws Exception {
        controller.setMeasureToMark();
        Assert.assertFalse(controller.getMeasureToMark());
    }
}