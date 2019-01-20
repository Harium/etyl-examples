package examples.ui.spinner;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;
import com.harium.etyl.ui.UI;
import examples.ui.UIExample;
import examples.ui.spinner.application.SpinnerExampleApplication;


public class SpinnerExample extends Etyl {

    private static final long serialVersionUID = 1L;

    public SpinnerExample() {
        super(800, 600);
    }

    public static void main(String[] args) {
        SpinnerExample example = new SpinnerExample();
        example.init();
    }

    @Override
    public Application startApplication() {
        UIExample.initUI();
        addModule(UI.getInstance());

        return new SpinnerExampleApplication(w, h);
    }

}
