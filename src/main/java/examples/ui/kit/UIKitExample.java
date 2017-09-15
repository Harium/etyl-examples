package examples.ui.kit;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;
import com.harium.etyl.commons.graphics.Color;
import com.harium.etyl.ui.theme.ThemeManager;
import com.harium.etyl.theme.etyllic.EtyllicTheme;
import examples.ui.kit.application.UIKitApplication;

public class UIKitExample extends Etyl {

	private static final long serialVersionUID = 1L;

	public UIKitExample() {
		super(640, 480);
	}

	public static void main(String[] args){
		UIKitExample example = new UIKitExample();
		example.init();
	}

	@Override
	public Application startApplication() {
		ThemeManager.getInstance().setTheme(new EtyllicTheme());
		//ThemeManager.getInstance().setTheme(new MaterialTheme());
		ThemeManager.getInstance().getTheme().setShadow(false);
		ThemeManager.getInstance().getTheme().setBaseColor(Color.DEEP_SKY_BLUE);
		ThemeManager.getInstance().getTheme().setTextColor(Color.WHITE);

		return new UIKitApplication(w,h);
	}

}
