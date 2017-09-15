package examples.etyl.swing;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;

public class SwingIntegration extends Etyl {

    private static final long serialVersionUID = 1L;

    public SwingIntegration() {
        super(800, 600);
    }

    public static void main(String[] args) {
        SwingIntegration app = new SwingIntegration();
        app.init();
    }

    @Override
    public Application startApplication() {
        return new FileExample(w, h);
    }

}
