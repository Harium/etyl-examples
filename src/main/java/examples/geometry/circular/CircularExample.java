package examples.geometry.circular;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;
import examples.geometry.circular.application.CircularApplication;

public class CircularExample extends Etyl {

    private static final long serialVersionUID = 1L;

    public CircularExample() {
        super(640, 480);
    }

    public static void main(String[] args) {
        CircularExample example = new CircularExample();
        example.init();
    }

    @Override
    public Application startApplication() {
        return new CircularApplication(w, h);
    }

}
