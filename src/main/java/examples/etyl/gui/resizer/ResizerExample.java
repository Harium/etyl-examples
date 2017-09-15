package examples.etyl.gui.resizer;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;

public class ResizerExample extends Etyl {

    private static final long serialVersionUID = 1L;

    public ResizerExample() {
        super(800, 600);
    }

    public static void main(String[] args) {
        ResizerExample app = new ResizerExample();
        app.init();
    }

    @Override
    public Application startApplication() {
        //initialSetup("../../");
        return new ResizerApplication(w, h);
    }

}
