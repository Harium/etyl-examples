package examples.etyl.time.timer;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;


public class TimerExample extends Etyl {

    private static final long serialVersionUID = 1L;

    public TimerExample() {
        super(640, 480);
    }

    public static void main(String[] args) {
        TimerExample app = new TimerExample();
        app.init();
    }

    @Override
    public Application startApplication() {
        return new TimerApplication(w, h);
    }

}
