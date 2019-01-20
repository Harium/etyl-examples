package examples.etyl.animation.pivot;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;

public class PivotExample extends Etyl {

    private static final long serialVersionUID = 1L;

    public PivotExample() {
        super(800, 600);
    }

    public static void main(String[] args) {
        PivotExample viewer = new PivotExample();
        viewer.init();
    }

    @Override
    public Application startApplication() {
        return new PivotApplication(w, h);
    }

}

