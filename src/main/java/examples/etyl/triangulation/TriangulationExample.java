package examples.etyl.triangulation;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;


public class TriangulationExample extends Etyl {
    private static final long serialVersionUID = 1L;

    public TriangulationExample() {
        super(800, 600);
    }

    public static void main(String[] args) {
        TriangulationExample app = new TriangulationExample();
        app.init();
    }

    @Override
    public Application startApplication() {
        return new TriangulationApplication(w, h);
    }

}
