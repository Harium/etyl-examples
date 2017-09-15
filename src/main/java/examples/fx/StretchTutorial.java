package examples.fx;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;
import examples.fx.application.StretchApplication;

public class StretchTutorial extends Etyl {

    private static final long serialVersionUID = 1L;

    public StretchTutorial() {
        super(800, 600);
    }

    public static void main(String[] args) {
        StretchTutorial app = new StretchTutorial();
        app.init();
    }

    @Override
    public Application startApplication() {
        //initialSetup("../../");
        return new StretchApplication(w, h);
    }

}
