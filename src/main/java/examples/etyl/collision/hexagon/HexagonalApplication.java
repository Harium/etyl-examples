package examples.etyl.collision.hexagon;

import com.harium.etyl.commons.collision.CollisionDetector;
import com.harium.etyl.commons.context.Application;
import com.harium.etyl.commons.context.UpdateIntervalListener;
import com.harium.etyl.commons.event.PointerEvent;
import com.harium.etyl.commons.graphics.Color;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.layer.BufferedLayer;

public class HexagonalApplication extends Application implements UpdateIntervalListener {

    private BufferedLayer hexagon;

    private int mx = 0;
    private int my = 0;

    public HexagonalApplication(int w, int h) {
        super(w, h);
    }

    @Override
    public void load() {

        hexagon = new BufferedLayer("tiles/hexagon.png");
        hexagon.setLocation(w / 2 - hexagon.getW() / 2, h / 2 - hexagon.getH() / 2);

        updateAtFixedRate(10, this);
    }

    @Override
    public void timeUpdate(long now) {

        if (CollisionDetector.colideHexagonPoint(hexagon.getX(), hexagon.getY(), hexagon.getW(), hexagon.getH(), mx, my)) {
            hexagon.offsetNegativeBlue(0x130);
        } else {
            hexagon.resetImage();
        }
    }

    public void updateMouse(PointerEvent event) {
        mx = event.getX();
        my = event.getY();
    }

    @Override
    public void draw(Graphics g) {

        g.setColor(Color.SKY_BLUE);
        g.fillRect(0, 0, w, h);

        hexagon.draw(g);
    }

}
