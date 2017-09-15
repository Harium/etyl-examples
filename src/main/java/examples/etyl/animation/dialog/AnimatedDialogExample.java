package examples.etyl.animation.dialog;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;

public class AnimatedDialogExample extends Etyl {

    private static final long serialVersionUID = 1L;

    public AnimatedDialogExample() {
        super(800, 600);
    }

    public static void main(String[] args) {
        AnimatedDialogExample app = new AnimatedDialogExample();
        app.init();
    }

    @Override
    public Application startApplication() {
        return new AnimatedDialog(w, h);
    }

}
