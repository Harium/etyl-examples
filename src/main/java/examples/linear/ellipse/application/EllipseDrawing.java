package examples.linear.ellipse.application;

import com.harium.etyl.commons.context.Application;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.linear.Ellipse;

import java.awt.*;

public class EllipseDrawing extends Application {

    private Ellipse ellipse;
    private boolean[][] mask;

    public EllipseDrawing(int w, int h) {
        super(w, h);
    }

    public void load() {
        ellipse = new Ellipse(100, 200, 100, 30);
        ellipse.setAngle(-20);

        mask = new boolean[h][w];

        for (int j = 0; j < h; j++) {
            for (int i = 0; i < w; i++) {
                if (ellipse.colideEllipsePoint(i, j)) {
                    mask[j][i] = true;
                }
            }
        }

        loading = 100;
    }

    public void draw(Graphics g) {
        g.setColor(Color.RED);
        for (int j = 0; j < h; j++) {
            for (int i = 0; i < w; i++) {
                if (mask[j][i]) {
                    g.fillRect(i, j, 1, 1);
                }
            }
        }
    }
}