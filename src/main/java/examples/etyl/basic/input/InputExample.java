package examples.etyl.basic.input;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;

public class InputExample extends Etyl {

    private static final long serialVersionUID = 1L;

    public InputExample() {
        super(800, 600);
    }

    public static void main(String[] args) {
        InputExample app = new InputExample();
        app.init();
    }

    @Override
    public Application startApplication() {
        return new MoveImage(w, h);
    }

}
