package examples.ui;

import com.harium.etyl.core.graphics.Font;
import com.harium.etyl.ui.UI;
import com.harium.etyl.ui.theme.Theme;
import com.harium.etyl.ui.theme.ThemeManager;
import com.harium.etyl.ui.theme.base.BaseTheme;

public class UIExample {

    public static void initUI() {
        UI.setTheme(new BaseTheme());
        Theme theme = ThemeManager.getInstance().getTheme();
        theme.setFont(new Font(new java.awt.Font("dialog", java.awt.Font.PLAIN, theme.getFontSize())));
    }

}
