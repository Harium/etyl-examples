package examples.linear.arrow;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;
import examples.linear.arrow.application.ArrowApplication;

public class ArrowExample extends Etyl {

    private static final long serialVersionUID = 1L;

    public ArrowExample() {
        super(640, 480);
    }

    public static void main(String[] args) {
        ArrowExample example = new ArrowExample();
        example.init();
    }

    @Override
    public Application startApplication() {
        return new ArrowApplication(w, h);
    }

}
