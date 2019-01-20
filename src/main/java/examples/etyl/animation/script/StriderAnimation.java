package examples.etyl.animation.script;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;
import com.harium.etyl.core.animation.Animation;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.layer.ImageLayer;

public class StriderAnimation extends Etyl {

    private static final long serialVersionUID = 1L;

    public StriderAnimation() {
        super(768, 417);
    }

    public static void main(String[] args) {
        StriderAnimation app = new StriderAnimation();
        app.init();
    }

    @Override
    public Application startApplication() {
        initialSetup("");

        return new StriderAnimationApplication(w, h);
    }

    public class StriderAnimationApplication extends Application {

        public StriderAnimationApplication(int w, int h) {
            super(w, h);
        }

        private ImageLayer background;
        private ImageLayer machine;
        private ImageLayer anotherMachine;

        @Override
        public void load() {

            loadingInfo = "Loading images...";

            background = new ImageLayer("scene.png");
            machine = new ImageLayer(180, 270, "machine.png");
            anotherMachine = new ImageLayer(180, 270, "machine.png");

            createAnimationScripts(machine, 0);
            createAnimationScripts(anotherMachine, 180);

            loading = 50;
            loadingInfo = "Loading animations...";

        }

        private void createAnimationScripts(ImageLayer machine, int offsetAngle) {
            Animation.animate(machine).orbit().during(5000)
                    .around(machine.getX(), machine.getY() + 70).from(offsetAngle).to(360 + offsetAngle)
                    .loop(Animation.REPEAT_FOREVER).and()
                    .rotate(5000).from(offsetAngle).to(360 + offsetAngle)
                    .loop(Animation.REPEAT_FOREVER).start();
        }

        @Override
        public void draw(Graphics g) {
            background.draw(g);
            machine.draw(g);
            anotherMachine.draw(g);
        }
    }

}
