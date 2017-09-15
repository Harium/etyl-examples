package examples.etyl.procedural.color;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;



public class ColorChangeExample extends Etyl {

    private static final long serialVersionUID = 1L;

    public ColorChangeExample() {
        super(640, 480);
    }

    public static void main(String[] args) {
        ColorChangeExample app = new ColorChangeExample();
        app.init();
    }

    @Override
    public Application startApplication() {
        return new ProceduralColorChange(w, h);
    }

}
