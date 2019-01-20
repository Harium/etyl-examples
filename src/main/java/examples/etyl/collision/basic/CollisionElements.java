package examples.etyl.collision.basic;

import com.harium.etyl.awt.helper.TransformHelper;
import com.harium.etyl.commons.context.Application;
import com.harium.etyl.commons.context.UpdateIntervalListener;
import com.harium.etyl.commons.event.MouseEvent;
import com.harium.etyl.commons.event.PointerEvent;
import com.harium.etyl.commons.graphics.Color;
import com.harium.etyl.commons.layer.GeometricLayer;
import com.harium.etyl.commons.layer.Layer;
import com.harium.etyl.core.graphics.Graphics;

import java.awt.geom.AffineTransform;

public class CollisionElements extends Application implements UpdateIntervalListener {

    private Color color = Color.BLUE;

    private Layer rectangle1;
    private Layer rectangle2;

    private GeometricLayer greenRectangle;
    private GeometricLayer orangeRectangle;

    private boolean colideGreenOrange = false;

    private int speed = -5;

    private int mx = 0;
    private int my = 0;

    public CollisionElements(int w, int h) {
        super(w, h);
    }

    @Override
    public void load() {
        rectangle1 = new Layer(80, 100, 200, 50);
        rectangle1.setAngle(20);

        rectangle2 = new Layer(200, 200, 200, 50);

        greenRectangle = new Layer(480, 340, 200, 50);
        orangeRectangle = new Layer(520, 360, 200, 50);

        updateAtFixedRate(60, this);

        loading = 100;
    }

    public void timeUpdate(long now) {
        if (!rectangle1.collide(rectangle2)) {
            color = Color.BLUE;
        } else {
            color = Color.YELLOW;
        }

        rectangle2.setOffsetAngle(10);

        if (orangeRectangle.collideRectRect(greenRectangle.getX(), greenRectangle.getY(), greenRectangle.getW(), greenRectangle.getH())) {
            colideGreenOrange = true;
        } else {
            colideGreenOrange = false;
        }

        orangeRectangle.setX(orangeRectangle.getX() + speed);

        if (orangeRectangle.getX() < 0) {
            speed = -speed;
        } else if (orangeRectangle.getX() + orangeRectangle.getW() > w) {
            speed = -speed;
        }
    }

    @Override
    public void draw(Graphics g) {
        AffineTransform transform2 = TransformHelper.getTransform(rectangle2);
        if (transform2 != null) {
            g.setTransform(transform2);
        }

        g.setColor(Color.RED);
        g.fillRect(rectangle2);

        g.resetTransform();

        AffineTransform transform1 = TransformHelper.getTransform(rectangle1);
        if (transform1 != null) {
            g.setTransform(transform1);
        }

        g.setColor(color);
        g.fillRect(rectangle1);

        g.resetTransform();

        //Draw fixed rectangles
        g.setColor(Color.GREEN);
        g.fillRect(greenRectangle);

        g.setColor(Color.ORANGE);
        g.fillRect(orangeRectangle);

        if (colideGreenOrange) {
            g.setColor(Color.RED);
        } else {
            g.setColor(Color.BLUE);
        }
        g.drawRect(greenRectangle);
        g.drawRect(orangeRectangle);
    }

    public void updateMouse(PointerEvent event) {
        mx = event.getX();
        my = event.getY();

        if (event.isButtonDown(MouseEvent.MOUSE_BUTTON_LEFT)) {
            rectangle1.setLocation(mx, my);
        }

        if (event.isButtonDown(MouseEvent.MOUSE_BUTTON_RIGHT)) {
            greenRectangle.setLocation(mx, my);
        }
    }

}
