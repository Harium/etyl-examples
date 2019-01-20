package examples.sound.application;


import com.harium.etyl.commons.context.Application;
import com.harium.etyl.commons.event.PointerEvent;
import com.harium.etyl.commons.event.PointerState;
import com.harium.etyl.commons.graphics.Color;
import com.harium.etyl.commons.layer.Layer;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.sound.model.Sound;

public class PlaySoundApplication extends Application {

    private Layer layer;
    private Sound sound;

    public PlaySoundApplication(int w, int h) {
        super(w, h);
    }

    @Override
    public void load() {
        layer = new Layer(30, 100, 80, 70);
        sound = new Sound("magic1.wav");

        loading = 100;
    }

    @Override
    public void updateMouse(PointerEvent event) {
        if (event.getState() == PointerState.CLICK) {
            if (layer.collideRectPoint(event.getX(), event.getY())) {
                sound.play();
            }
        }
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.KHAKI);
        g.fillRect(layer);

        g.setColor(Color.BLACK);
        g.drawRect(layer);
    }

}
