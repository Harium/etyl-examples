package examples.etyl.time.update;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;

public class UpdateExample extends Etyl {

    private static final long serialVersionUID = 1L;

    public UpdateExample() {
        super(800, 600);
    }

    public static void main(String[] args) {
        UpdateExample app = new UpdateExample();
        app.init();
    }

    @Override
    public Application startApplication() {
        //initialSetup("../../");
        return new TimedApplication(w, h);
    }

}
