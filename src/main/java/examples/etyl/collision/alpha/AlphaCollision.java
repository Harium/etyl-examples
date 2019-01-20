package examples.etyl.collision.alpha;

import com.harium.etyl.commons.context.Application;
import com.harium.etyl.commons.event.PointerEvent;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.layer.BufferedLayer;

public class AlphaCollision extends Application {

    private BufferedLayer layer;

    private int mx = 0;
    private int my = 0;

    public AlphaCollision(int w, int h) {
        super(w, h);
    }

    @Override
    public void load() {

        layer = new BufferedLayer("machine.png");
        layer.setLocation(w / 2 - layer.getW() / 2, h / 2 - layer.getH() / 2);

        loading = 100;
    }

    @Override
    public void draw(Graphics g) {

        layer.draw(g);
    }

    @Override
    public void update(long now) {

        if (layer.collideAlphaPoint(mx, my)) {
            layer.offsetRGB(80, -40, -50);
        } else {
            layer.resetImage();
        }
    }

    @Override
    public void updateMouse(PointerEvent event) {
        mx = event.getX();
        my = event.getY();
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
        load();
    }

}
