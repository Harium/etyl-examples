package examples.etyl.control;

import com.harium.etyl.commons.context.Application;
import com.harium.etyl.commons.event.PointerEvent;
import com.harium.etyl.commons.graphics.Color;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.input.touch.TouchJoystick;

public class TouchJoystickExample extends Application {

    private TouchJoystick joystick;

    public TouchJoystickExample(int w, int h) {
        super(w, h);
    }

    @Override
    public void load() {
        joystick = new TouchJoystick(36, 110);
        loading = 100;
    }

    @Override
    public void draw(Graphics g) {
        drawTouchJoystick(g);

        g.setColor(Color.WHITE);
        g.drawStringShadow("X: " + Double.toString(joystick.getSensitivityX()), 40, 60);
        g.drawStringShadow("Y: " + Double.toString(joystick.getSensitivityY()), 40, 80);
        g.drawStringShadow("A: " + Double.toString(joystick.getAngle()), 40, 100);
    }

    public void drawTouchJoystick(Graphics g) {
        g.setAlpha(50);
        g.setColor(Color.BLACK);
        g.fillOval(joystick.getArea());

        if (joystick.isActive()) {
            g.setColor(Color.RED);
        } else {
            g.setColor(Color.YELLOW);
        }

        g.fillOval(joystick.getJoystick());
        g.resetOpacity();
    }

    @Override
    public void updateMouse(PointerEvent event) {
        joystick.updateMouse(event);
    }

}

