package test;

import GUI.Controller;
import GUI.ControllerAdapter;
import GUI.ControllerAdapterImpl;
import GUI.ControllerImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;

/**
 * Created by hvallee on 15/01/2016.
 */
public class ControllerAdapterImplTest {

    ControllerImpl controllerMock;
    ControllerAdapter controllerAdapter;

    @Before
    public void setUp() throws Exception {
        controllerMock = Mockito.mock(ControllerImpl.class);
        controllerAdapter = new ControllerAdapterImpl(controllerMock);
    }

    @Test
    public void testStartAdapter() throws Exception {
        controllerAdapter.startAdapter();
        verify(controllerMock, atLeastOnce()).start();
    }

    @Test
    public void testStopAdapter() throws Exception {
        controllerAdapter.stopAdapter();
        verify(controllerMock, atLeastOnce()).stop();
    }

    @Test
    public void testMarkTimeAdapter() throws Exception {
        controllerAdapter.markTimeAdapter();
        verify(controllerMock, atLeastOnce()).markTime();
    }

    @Test
    public void testMarkMeasureAdapter() throws Exception {
        controllerAdapter.markMeasureAdapter();
        verify(controllerMock, atLeastOnce()).markMeasure();
    }

    @Test
    public void testIncAdapter() throws Exception {
        controllerAdapter.incAdapter();
        verify(controllerMock, atLeastOnce()).inc();
    }

    @Test
    public void testDecAdapter() throws Exception {
        controllerAdapter.decAdapter();
        verify(controllerMock, atLeastOnce()).dec();
    }

    @Test
    public void testUserSliderAdapter() throws Exception {
        controllerAdapter.userSliderAdapter(100);
        verify(controllerMock, atLeastOnce()).userSlider(100);
    }

    @Test
    public void testSetTimeToMarkAdapter() throws Exception {
        controllerAdapter.setTimeToMarkAdapter();
        verify(controllerMock, atLeastOnce()).setTimeToMark();
    }

    @Test
    public void testSetMeasureToMarkAdapter() throws Exception {
        controllerAdapter.setMeasureToMarkAdapter();
        verify(controllerMock, atLeastOnce()).setMeasureToMark();
    }
}