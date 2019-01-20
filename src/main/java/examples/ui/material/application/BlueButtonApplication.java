package examples.ui.material.application;

import com.harium.etyl.commons.context.Application;
import com.harium.etyl.commons.event.PointerEvent;
import com.harium.etyl.commons.graphics.Color;
import com.harium.etyl.commons.graphics.font.FontStyle;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.ui.Button;
import com.harium.etyl.ui.UI;
import com.harium.etyl.ui.label.TextLabel;
import com.harium.etyl.ui.theme.ThemeManager;

import java.awt.*;

public class BlueButtonApplication extends Application {

    int bx = 40;
    int by = 130;
    int bw = 140;
    int bh = 50;

    Button button;
    String text = "BUTTON";

    public BlueButtonApplication(int w, int h) {
        super(w, h);
    }

    public void load() {
        ThemeManager.getInstance().getTheme().setShadow(false);
        ThemeManager.getInstance().getTheme().setBaseColor(Color.DEEP_SKY_BLUE);
        ThemeManager.getInstance().getTheme().setTextColor(Color.WHITE);

        TextLabel label = new TextLabel(text);
        label.setFontStyle(Font.BOLD);
        label.setFontSize(16);

        button = new Button(bx, by, bw, bh);
        button.setLabel(label);
        UI.add(button);
    }

    @Override
    public void updateMouse(PointerEvent event) {

    }

    @Override
    public void draw(Graphics g) {
        // TODO Auto-generated method stub

    }
}

