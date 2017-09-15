package examples.fx.application;

import com.harium.etyl.commons.context.Application;
import com.harium.etyl.commons.event.PointerEvent;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.effects.light.LightSource;
import com.harium.etyl.effects.light.ShadowLayer;
import com.harium.etyl.layer.ImageLayer;

public class LightSourceApplication extends Application {

    private ShadowLayer shadow;

    private LightSource source;
    private LightSource anotherSource;

    private ImageLayer background;

    public LightSourceApplication(int w, int h) {
        super(w, h);
    }

    @Override
    public void load() {

        loading = 10;

        background = new ImageLayer("scene.png");

        shadow = new ShadowLayer(x, y, w, h);

        source = new LightSource(w / 2 - 100, h / 2 - 100, 200);
        anotherSource = new LightSource(w / 2 - 100, h / 2 - 100, 200);

        loading = 100;
    }

    @Override
    public void draw(Graphics g) {

        background.draw(g);

        shadow.drawLights(g, source, anotherSource);
    }

    public void updateMouse(PointerEvent event) {
        source.setLocation(event.getX() - source.getW() / 2, event.getY() - source.getH() / 2);
    }

}
