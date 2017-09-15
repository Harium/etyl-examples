package examples.etyl.animation.sprite;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;

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
        return new SpriteAnimationTutorial(w, h);
    }

}
