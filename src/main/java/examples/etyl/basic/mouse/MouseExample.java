package examples.etyl.basic.mouse;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;

public class MouseExample extends Etyl {

    private static final long serialVersionUID = 1L;

    public MouseExample() {
        super(640, 480);
    }

    public static void main(String[] args) {
        MouseExample app = new MouseExample();
        app.init();
    }

    @Override
    public Application startApplication() {
        return new FollowingText(w, h);
    }

}
