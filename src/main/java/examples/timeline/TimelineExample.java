package examples.timeline;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;
import examples.timeline.application.TimelineApplication;


public class TimelineExample extends Etyl {

    private static final long serialVersionUID = 1L;

    public TimelineExample() {
        super(640, 480);
    }

    public static void main(String[] args) {
        TimelineExample app = new TimelineExample();
        app.init();
    }

    @Override
    public Application startApplication() {
        initialSetup("../../");

        return new TimelineApplication(w, h);
    }

}
