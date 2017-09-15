package examples.etyl.time.update;

import com.harium.etyl.commons.context.Application;
import com.harium.etyl.commons.event.KeyEvent;
import com.harium.etyl.commons.event.KeyState;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.layer.ImageLayer;

public class TimedApplication extends Application {

    private ImageLayer layer;

    private boolean press = false;

    public TimedApplication(int w, int h) {
        super(w, h);
    }

    @Override
    public void load() {
        layer = new ImageLayer(50, 450, "particle.png");
    }

    @Override
    public void draw(Graphics g) {
        layer.draw(g);
    }

    @Override
    public void update(long now) {
        if (press) {
            layer.offsetY(-1);
        }
    }

    @Override
    public void updateKeyboard(KeyEvent event) {

        if (event.getState() == KeyState.PRESSED) {
            press = true;
        } else if (event.getState() == KeyState.RELEASED) {
            press = false;
        }

    }

}
