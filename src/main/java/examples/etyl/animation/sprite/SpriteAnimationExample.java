package examples.etyl.animation.sprite;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;
import com.harium.etyl.core.animation.Animation;
import com.harium.etyl.core.animation.script.FrameAnimation;
import com.harium.etyl.core.context.SceneApplication;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.layer.AnimatedLayer;

public class SpriteAnimationExample extends Etyl {

    private static final long serialVersionUID = 1L;

    public SpriteAnimationExample() {
        super(100, 100);
    }

    public static void main(String[] args) {
        SpriteAnimationExample app = new SpriteAnimationExample();
        app.init();
    }

    @Override
    public Application startApplication() {
        initialSetup("");
        return new SpriteAnimationApplication(w, h);
    }

    public class SpriteAnimationApplication extends SceneApplication {

        public SpriteAnimationApplication(int w, int h) {
            super(w, h);
        }

        private AnimatedLayer fruit;

        @Override
        public void load() {
            fruit = new AnimatedLayer(20, 60, 16, 16, "fruits.png");
            fruit.setFrames(3);
            //fruit.setOscilate(true);
            fruit.setSpeed(500);

            Animation.getInstance().add(new FrameAnimation(fruit));

            session.put("hello", "my friend");

            loading = 100;
        }

        @Override
        public void draw(Graphics g) {
            fruit.draw(g);
        }

    }
}
