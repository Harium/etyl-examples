package examples.fx;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;
import examples.fx.application.LightningApplication;

public class ZeusTutorial extends Etyl {

    private static final long serialVersionUID = 1L;

    public ZeusTutorial() {
        super(800, 600);
    }

    public static void main(String[] args) {
        ZeusTutorial app = new ZeusTutorial();
        app.init();
    }

    @Override
    public Application startApplication() {
        //initialSetup("../../");
        return new LightningApplication(w, h);
    }

}
