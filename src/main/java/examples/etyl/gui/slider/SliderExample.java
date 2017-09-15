package examples.etyl.gui.slider;


import com.harium.etyl.commons.context.Application;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.ui.Slider;
import com.harium.etyl.ui.UI;

import java.awt.*;

public class SliderExample extends Application {

    Slider slider;

    public SliderExample(int w, int h) {
        super(w, h);
    }

    @Override
    public void load() {
        slider = new Slider(120, 120, 100, 32);
        slider.setMinValue(0);
        slider.setMaxValue(255);
        UI.add(slider);

        loading = 100;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(x, y, w, h);

        g.setColor(Color.BLACK);
        g.drawString(Float.toString(slider.getValue()), slider.getX() + 200, slider.getY() - 80);
    }

}
