package examples.etyl.gui.animation;

import com.harium.etyl.commons.context.Application;
import com.harium.etyl.core.animation.Animation;
import com.harium.etyl.core.animation.script.HorizontalAnimation;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.ui.Button;
import com.harium.etyl.ui.UI;
import com.harium.etyl.ui.label.TextLabel;

public class AnimatedMenu extends Application {

    private Button button1;
    private Button button2;

    public AnimatedMenu(int w, int h) {
        super(w, h);
    }

    @Override
    public void load() {

        createButtons();

        HorizontalAnimation script = new HorizontalAnimation(button1, 2000);
        script.setInterval(w, button1.getX());

        HorizontalAnimation scriptButton2 = new HorizontalAnimation(button2, 2000);
        scriptButton2.setInterval(w, button2.getX());

        script.addNext(scriptButton2);

        Animation.getInstance().add(script);

        loading = 100;
    }

    private void createButtons() {

        final int buttonW = 200;

        final int buttonH = 50;

        final int offset = 15;

        button1 = new Button(w / 2 - buttonW / 2, h / 2, buttonW, buttonH);
        button1.setLabel(new TextLabel("Button1"));

        button2 = new Button(w / 2 - buttonW / 2, button1.getY() + buttonH + offset, buttonW, buttonH);
        button2.setLabel(new TextLabel("Button2"));

        UI.add(button1);
        UI.add(button2);
    }

    @Override
    public void draw(Graphics g) {

    }
}
