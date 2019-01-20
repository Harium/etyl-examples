package examples.etyl.gui.simple;

import com.harium.etyl.commons.context.Application;
import com.harium.etyl.commons.event.Action;
import com.harium.etyl.commons.event.GUIEvent;
import com.harium.etyl.commons.graphics.Color;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.ui.*;
import com.harium.etyl.ui.label.TextLabel;

public class GeneralGuiExample extends Application {

    public GeneralGuiExample(int w, int h) {
        super(w, h);
    }

    /**
     * Background Color
     */
    private Color color = Color.WHITE;

    @Override
    public void load() {

        Button buttonWhite = new Button(20, 30, 120, 40);
        buttonWhite.setLabel(new TextLabel("WHITE"));
        buttonWhite.addAction(GUIEvent.MOUSE_LEFT_BUTTON_UP, new Action(this, "changeColor", Color.WHITE));
        UI.add(buttonWhite);

        Button buttonBlue = new Button(20, 80, 120, 40);
        buttonBlue.setLabel(new TextLabel("BLUE"));
        buttonBlue.addAction(GUIEvent.MOUSE_LEFT_BUTTON_UP, new Action(this, "changeColor", Color.BLUE));
        UI.add(buttonBlue);

        TextField field = new TextField(100, 150, 120, 40);
        UI.add(field);

        CheckBox checkbox = new CheckBox(280, 150, 60, 40);
        checkbox.setChecked(true);
        UI.add(checkbox);

        RadioButton radio1 = new RadioButton(200, 50, 40, 40);
        radio1.setGroup("group");
        RadioButton radio2 = new RadioButton(280, 50, 40, 40);
        radio2.setGroup("group");
        radio1.check(true);

        UI.add(radio1);
        UI.add(radio2);

        loading = 100;
    }

    public void changeColor(Color color) {
        this.color = color;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, w, h);
    }

}
