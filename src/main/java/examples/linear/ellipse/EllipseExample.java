package examples.linear.ellipse;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;
import examples.linear.ellipse.application.EllipseDrawing;

public class EllipseExample extends Etyl {

    private static final long serialVersionUID = 1L;

    public EllipseExample() {
        super(640, 480);
    }

    public static void main(String[] args) {
        EllipseExample example = new EllipseExample();
        example.init();
    }

    @Override
    public Application startApplication() {
        return new EllipseDrawing(w, h);
    }

}
