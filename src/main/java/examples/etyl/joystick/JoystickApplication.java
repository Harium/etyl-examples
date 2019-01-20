package examples.etyl.joystick;

import com.harium.etyl.commons.context.Application;
import com.harium.etyl.commons.event.KeyEvent;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.layer.ImageLayer;


public class JoystickApplication extends Application {

    public JoystickApplication(int w, int h) {
        super(w, h);
    }

    private ImageLayer hello;

    @Override
    public void load() {
        hello = new ImageLayer(200, 100, "hello.png");
        loading = 100;
    }

    @Override
    public void draw(Graphics g) {
        hello.draw(g);
    }

    @Override
    public void updateKeyboard(KeyEvent event) {

        if (event.isKeyDown(KeyEvent.VK_RIGHT)) {
            hello.offsetX(10);
        }
        if (event.isKeyDown(KeyEvent.VK_LEFT)) {
            hello.offsetX(-10);
        }

        if (event.isKeyDown(KeyEvent.VK_JOYSTICK_RIGHT)) {
            hello.offsetX(10);
        } else if (event.isKeyDown(KeyEvent.VK_JOYSTICK_LEFT)) {
            hello.offsetX(-10);
        }

        if (event.isKeyDown(KeyEvent.VK_JOYSTICK_UP)) {
            hello.offsetY(-10);
        } else if (event.isKeyDown(KeyEvent.VK_JOYSTICK_DOWN)) {
            hello.offsetY(10);
        }

        if (event.isKeyDown(KeyEvent.VK_JOYSTICK_BUTTON_1)) {
            hello.setOffsetAngle(10);
        }

        if (event.isKeyDown(KeyEvent.VK_JOYSTICK_BUTTON_7)) {
            hello.setScale(1.5);
        }
        if (event.isKeyDown(KeyEvent.VK_JOYSTICK_BUTTON_8)) {
            hello.setScale(1);
        }
    }

}
