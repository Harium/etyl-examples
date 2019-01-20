package examples.etyl.gui.animation;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;

public class AnimatedMenuExample extends Etyl {

    private static final long serialVersionUID = 1L;

    public AnimatedMenuExample() {
        super(800, 600);
    }

    public static void main(String[] args) {
        AnimatedMenuExample app = new AnimatedMenuExample();
        app.init();
    }

    @Override
    public Application startApplication() {
        initialSetup("");
        return new AnimatedMenu(w, h);
    }

}
