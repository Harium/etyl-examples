package examples.etyl.collision.basic;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;

public class CollisionExample extends Etyl {

    private static final long serialVersionUID = 1L;

    public CollisionExample(int width, int height) {
        super(width, height);
    }

    public static void main(String[] args) {
        CollisionExample colision = new CollisionExample(800, 600);
        colision.init();
    }

    @Override
    public Application startApplication() {
        return new CollisionElements(w, h);
    }

}
