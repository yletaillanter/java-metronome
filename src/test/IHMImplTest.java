package test;

import GUI.ControllerAdapter;
import GUI.ControllerAdapterImpl;
import GUI.IHMImpl;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;

/**
 * Created by hvallee on 15/01/2016.
 */
public class IHMImplTest {

    @FXML
    private Circle timeLed;

    IHMImpl ihmImpl;
    ControllerAdapterImpl controller;

    @Before
    public void setUp() throws Exception {
        controller = Mockito.mock(ControllerAdapterImpl.class);
        ihmImpl = new IHMImpl(controller);
    }

    @Test
    public void testStartIHM() throws Exception {
        ihmImpl.startIHM();
        verify(controller, atLeastOnce()).startAdapter();
    }

    @Test
    public void testStopIHM() throws Exception {
        ihmImpl.stopIHM();
        verify(controller, atLeastOnce()).stopAdapter();
    }

    @Test
    public void testMarkTimeIHM() throws Exception {
        //ihmImpl.markTimeIHM();
        //verify(controller, atLeastOnce()).setTimeToMarkAdapter();
    }

    @Test
    public void testMarkMeasureIHM() throws Exception {
        //ihmImpl.markMeasureIHM();
        //verify(controller, atLeastOnce()).setMeasureToMarkAdapter();
    }

    @Test
    public void testIncIHM() throws Exception {
        ihmImpl.incIHM();
        verify(controller, atLeastOnce()).incAdapter();
    }

    @Test
    public void testDecIHM() throws Exception {
        ihmImpl.decIHM();
        verify(controller, atLeastOnce()).decAdapter();
    }
}