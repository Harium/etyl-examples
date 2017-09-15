package examples.ui.material.application.model;

import com.harium.etyl.commons.graphics.Color;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.ui.base.BaseButton;

public class MaterialSliderButton extends BaseButton {

    public MaterialSliderButton(int x, int y, int w, int h) {
        super(x, y, w, h);
    }

    public void draw(Graphics g) {
        if (!visible)
            return;

        Color color = getColor();
        g.setColor(color);

        g.fillOval(left(), top(), width(), height());

        drawLabel(g);
    }

}
