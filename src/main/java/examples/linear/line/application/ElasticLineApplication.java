package examples.linear.line.application;

import com.harium.etyl.commons.context.Application;
import com.harium.etyl.commons.context.UpdateIntervalListener;
import com.harium.etyl.commons.event.MouseEvent;
import com.harium.etyl.commons.event.PointerEvent;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.linear.Point2D;
import com.harium.etyl.util.PointUtils;

import java.awt.*;

public class ElasticLineApplication extends Application implements UpdateIntervalListener {

    private Point2D p;
    private Point2D q;

    private boolean pressed = false;
    private boolean back = false;

    private int currentArea = 0;
    private int divisions = 6;

    public ElasticLineApplication(int w, int h) {
        super(w, h);
    }

    public void load() {

        p = new Point2D(100, 200);
        q = new Point2D(200, 300);

        updateAtFixedRate(100, this);
        loading = 100;
    }

    @Override
    public void timeUpdate(long now) {

        if (pressed) {
            if (!back) {
                currentArea++;
            } else {
                currentArea--;
                if (currentArea < 0) {
                    pressed = false;
                }
            }
        }

        if (currentArea >= divisions) {
            back = true;
        }
    }

    public void draw(Graphics g) {

        if (pressed) {
            g.setColor(Color.BLUE);
            double distance = p.distance(q);
            double index = distance / divisions * currentArea;

            Point2D distantPoint = PointUtils.distantPoint(p, q, index);
            g.drawLine(p, distantPoint);
        } else {
            g.setColor(Color.BLACK);
            g.drawLine(p, q);
        }
    }

    @Override
    public void updateMouse(PointerEvent event) {
        q.setLocation(event.getX(), event.getY());

        if (event.isButtonDown(MouseEvent.MOUSE_BUTTON_LEFT)) {
            pressed = true;
            back = false;
            currentArea = 0;
        }
    }
}

