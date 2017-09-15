package examples.etyl.collision.alpha;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;

public class AlphaExample extends Etyl {

    private static final long serialVersionUID = 1L;

    public AlphaExample() {
        super(320, 100);
    }

    public static void main(String[] args) {
        AlphaExample app = new AlphaExample();
        app.init();
    }

    @Override
    public Application startApplication() {
        return new AlphaCollision(w, h);
    }

}
