package GUI;

/**
 * Created by hugov on 13/01/2016.
 */
public class ControllerAdapterImpl implements ControllerAdapter{

    private ControllerImpl controller;

    public ControllerAdapterImpl() {
        controller = new ControllerImpl();
    }

    @Override
    public void startAdapter() {
        controller.start();
    }

    @Override
    public void stopAdapter() {
        controller.stop();
    }

    @Override
    public void markTimeAdapter() {
        controller.markTime();
    }

    @Override
    public void markMeasureAdapter() {
        controller.markMeasure();
    }

    @Override
    public void incAdapter() {
        controller.inc();
    }

    @Override
    public void decAdapter() {
        controller.dec();
    }

    @Override
    public void userSliderAdapter(int value) {
        controller.userSlider(value);
    }

    @Override
    public boolean getTimeToMarkAdapter() {
        return controller.getTimeToMark();
    }

    @Override
    public boolean getMeasureToMarkAdapter() {
        return controller.getMeasureToMark();
    }

    @Override
    public void setTimeToMarkAdapter() {
        controller.setTimeToMark();
    }

    @Override
    public void setMeasureToMarkAdapter() {
        controller.setMeasureToMark();
    }
}
