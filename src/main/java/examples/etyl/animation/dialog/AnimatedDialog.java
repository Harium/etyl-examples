package examples.etyl.animation.dialog;

import com.harium.etyl.animation.script.text.DialogScript;
import com.harium.etyl.commons.context.Application;
import com.harium.etyl.commons.event.MouseEvent;
import com.harium.etyl.commons.event.PointerEvent;
import com.harium.etyl.core.animation.Animation;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.layer.TextLayer;

public class AnimatedDialog extends Application {

    private TextLayer layer;

    private DialogScript script;

    public AnimatedDialog(int w, int h) {
        super(w, h);
    }

    @Override
    public void load() {

        layer = new TextLayer(200, 140, "Hello my friend, stay awhile and listen.");

        script = new DialogScript(layer, 2000);

        Animation.getInstance().add(script);

        loading = 100;
    }

    @Override
    public void draw(Graphics g) {
        layer.draw(g);
    }

    @Override
    public void updateMouse(PointerEvent event) {
        if (event.isButtonDown(MouseEvent.MOUSE_BUTTON_LEFT)) {
            Animation.getInstance().add(script);
            script.restart();
        }
    }

}
