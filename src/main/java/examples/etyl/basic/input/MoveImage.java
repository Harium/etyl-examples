package examples.etyl.basic.input;

import com.harium.etyl.commons.context.Application;
import com.harium.etyl.commons.event.KeyEvent;
import com.harium.etyl.commons.graphics.Color;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.layer.ImageLayer;

public class MoveImage extends Application {

    private int speed = 2;
    private ImageLayer hello;

    public MoveImage(int w, int h) {
        super(w, h);
    }

    @Override
    public void load() {
        loading = 10;
        hello = new ImageLayer(w / 2 - 96, 100, "hello.png");
        loading = 100;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawStringX("Use keyboard arrows to move the image", h / 2);
        hello.draw(g);
    }

    @Override
    public void update(long now) {

        if (right) {
            hello.offsetX(speed);
        }
        if (left) {
            hello.offsetX(-speed);
        }

        if (down) {
            hello.offsetY(speed);
        }
        if (up) {
            hello.offsetY(-speed);
        }
    }

    private boolean up = false;
    private boolean down = false;

    private boolean right = false;
    private boolean left = false;

    @Override
    public void updateKeyboard(KeyEvent event) {

        if (event.isKeyDown(KeyEvent.VK_RIGHT_ARROW)) {
            right = true;
        }
        if (event.isKeyUp(KeyEvent.VK_RIGHT_ARROW)) {
            right = false;
        }

        if (event.isKeyDown(KeyEvent.VK_LEFT_ARROW)) {
            left = true;
        }
        if (event.isKeyUp(KeyEvent.VK_LEFT_ARROW)) {
            left = false;
        }

        if (event.isKeyDown(KeyEvent.VK_UP_ARROW)) {
            up = true;
        }
        if (event.isKeyUp(KeyEvent.VK_UP_ARROW)) {
            up = false;
        }

        if (event.isKeyDown(KeyEvent.VK_DOWN_ARROW)) {
            down = true;
        }

        if (event.isKeyUp(KeyEvent.VK_DOWN_ARROW)) {
            down = false;
        }
    }
}
