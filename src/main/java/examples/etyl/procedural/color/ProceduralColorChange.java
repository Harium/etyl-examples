package examples.etyl.procedural.color;

import com.harium.etyl.commons.context.Application;
import com.harium.etyl.commons.event.PointerEvent;
import com.harium.etyl.commons.graphics.Color;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.layer.BufferedLayer;


public class ProceduralColorChange extends Application {

    private BufferedLayer cursor;

    public ProceduralColorChange(int w, int h) {
        super(w, h);
    }

    @Override
    public void load() {
        setDrawCursor(false);
        cursor = new BufferedLayer(50, 50, "cursor.png");
        loading = 100;
    }

    @Override
    public void updateMouse(PointerEvent event) {
        int ex = event.getX();
        int ey = event.getY();
        cursor.setLocation(ex, ey);

        int red = (ex * 255) / w;
        int green = (ey * 255) / h;
        int blue = 0;

        cursor.offsetRGB(red, green, blue);
    }

    @Override
    public void draw(Graphics g) {
        //Drawing background
        g.setColor(Color.WHITE);
        g.fillRect(x, y, w, h);

        cursor.draw(g);
    }

}
