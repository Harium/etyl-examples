package examples.ui.material;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;
import com.harium.etyl.ui.UI;
import com.harium.etyl.ui.theme.ThemeManager;
import examples.ui.material.application.BlueButtonApplication;
import examples.ui.material.application.model.MaterialTheme;

public class ButtonExample extends Etyl {

    private static final long serialVersionUID = 1L;

    public ButtonExample() {
        super(640, 480);
    }

    public static void main(String[] args) {
        ButtonExample example = new ButtonExample();
        example.init();
    }

    @Override
    public Application startApplication() {
        UI.setTheme(new MaterialTheme());
        addModule(UI.getInstance());

        return new BlueButtonApplication(w, h);
    }

}
