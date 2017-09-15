package examples.fx.application;

import com.harium.etyl.commons.context.Application;
import com.harium.etyl.core.effect.Effect;
import com.harium.etyl.commons.event.KeyEvent;
import com.harium.etyl.core.graphics.Graphics;

import java.awt.*;

public class LightningApplication extends Application {

    private Effect lightning;

    public LightningApplication(int w, int h) {
        super(w, h);
    }

    @Override
    public void load() {

        loading = 10;

        lightning = new Effect(300, 110, 120, 370, "lightning.png");
        lightning.setFrames(10);
        lightning.setSpeed(100);

        loading = 100;
    }

    @Override
    public void draw(Graphics g) {

        g.setColor(Color.BLACK);
        g.drawStringX("Press Space to see the magic", 100);

        lightning.draw(g);
    }

    @Override
    public void updateKeyboard(KeyEvent event) {
        if (event.isKeyUp(KeyEvent.VK_SPACE)) {
            lightning.startEffect();
        }
    }
}
