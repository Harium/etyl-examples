package examples.etyl.time.timer;

import com.harium.etyl.animation.timer.Timer;
import com.harium.etyl.commons.context.Application;
import com.harium.etyl.commons.graphics.Color;
import com.harium.etyl.core.graphics.Graphics;


public class TimerApplication extends Application {

    private static final int RECT_SIZE = 20;

    private Timer timer;
    private int x;
    private int speed = 3;

    public TimerApplication(int w, int h) {
        super(w, h);
    }

    public void load() {
        timer = new Timer();
        x = 0;
    }

    public void update(long now) {
        if (timer.schedule(now, 10)) {
            if (x >= w - RECT_SIZE) {
                speed = -speed;
            } else if (x < 0) {
                speed = -speed;
            }
            x += speed;
        }
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(x, 100, RECT_SIZE, RECT_SIZE);
    }
}