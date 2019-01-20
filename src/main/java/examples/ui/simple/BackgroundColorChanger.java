package examples.ui.simple;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;
import com.harium.etyl.core.Configuration;
import com.harium.etyl.core.graphics.Font;
import com.harium.etyl.ui.UI;
import com.harium.etyl.ui.theme.Theme;
import com.harium.etyl.ui.theme.ThemeManager;
import com.harium.etyl.ui.theme.base.BaseTheme;
import examples.ui.UIExample;
import examples.ui.material.application.model.MaterialTheme;
import examples.ui.simple.UIExample.BackgroundColorChangerApplication;


public class BackgroundColorChanger extends Etyl {

    private static final long serialVersionUID = 1L;

    public BackgroundColorChanger() {
        super(640, 480);
    }

    public static void main(String[] args) {
        BackgroundColorChanger example = new BackgroundColorChanger();
        example.init();
    }

    @Override
    public Application startApplication() {
        UIExample.initUI();
        addModule(UI.getInstance());

        Configuration.getInstance().setTimerClick(true);
        return new BackgroundColorChangerApplication(w, h);
    }

}
