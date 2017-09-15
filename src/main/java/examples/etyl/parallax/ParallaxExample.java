package examples.etyl.parallax;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;

public class ParallaxExample extends Etyl {

    private static final long serialVersionUID = 1L;

    public ParallaxExample() {
        super(800, 200);
    }

    public static void main(String[] args) {
        ParallaxExample app = new ParallaxExample();
        app.init();
    }

    @Override
    public Application startApplication() {
        //initialSetup("../../");
        return new ParallaxApplication(w, h);
    }

}
