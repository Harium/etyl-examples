package examples.etyl.procedural.dice;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;


public class DiceExample extends Etyl {
    private static final long serialVersionUID = 1L;

    public DiceExample() {
        super(800, 600);
    }

    public static void main(String[] args) {
        DiceExample app = new DiceExample();
        app.init();
    }

    @Override
    public Application startApplication() {
        return new DiceApplication(w, h);
    }

}
