package examples.etyl.customloading.application;

import com.harium.etyl.commons.context.load.GenericLoadApplication;
import com.harium.etyl.commons.graphics.Color;
import com.harium.etyl.core.graphics.Graphics;

import java.awt.*;

public class YellowLoading extends GenericLoadApplication {

    private Font f;

    private Font p;

    public YellowLoading(int x, int y, int w, int h) {
        super(x, y, w, h);

        String fontName = "dialog";
        f = new Font(fontName, Font.BOLD, 26);
        p = new Font(fontName, Font.BOLD, 18);
    }

    private float rectW = w * 2 / 3;
    private float rectX = w / 2 - rectW / 2;
    private float rectY = h / 2 + 100;
    private float rectH = 32;

    private Color backgroundColor = new Color(0xff, 0xcc, 0x0);

    @Override
    public void draw(Graphics g) {

        g.setFont(f);

        g.setColor(backgroundColor);
        g.fillRect(0, 0, w, h);

        g.setColor(Color.WHITE);
        g.drawStringShadowX(phrase, 280 - y);

        g.drawRect(rectX, rectY, rectW, rectH);
        g.fillRect(rectX + 2, rectY + 2, (int) ((rectW * fill) / 100) - 3, rectH - 3);

        g.setFont(p);
        g.drawStringShadow(percent, rectX, rectY, rectW, rectH, Color.BLACK);

    }

}
