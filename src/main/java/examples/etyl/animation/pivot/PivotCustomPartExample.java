package examples.etyl.animation.pivot;

import com.harium.etyl.animation.pivot.Part;
import com.harium.etyl.commons.context.Application;
import com.harium.etyl.commons.graphics.Color;
import com.harium.etyl.core.graphics.Graphics;

public class PivotCustomPartExample extends Application {

    public PivotCustomPartExample(int w, int h) {
        super(w, h);
    }

    private Part part;
    private Part otherPart;

    @Override
    public void load() {

        loading = 10;

        part = new Part(40, 80);
        otherPart = new Part(150, 90);

        loading = 100;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawRect(part);
        g.drawRect(otherPart);
    }

}