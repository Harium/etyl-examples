package examples.ui.simple;

import com.harium.etyl.Etyl;
import com.harium.etyl.core.Configuration;
import com.harium.etyl.commons.context.Application;
import com.harium.etyl.ui.theme.ThemeManager;
import com.harium.etyl.theme.etyllic.EtyllicTheme;
import examples.ui.simple.UIExample.BackgroundColorChangerApplication;


public class BackgroundColorChanger extends Etyl {

	private static final long serialVersionUID = 1L;

	public BackgroundColorChanger() {
		super(640, 480);
	}

	public static void main(String[] args){
		BackgroundColorChanger example = new BackgroundColorChanger();
		example.init();
	}

	@Override
	public Application startApplication() {

		Configuration.getInstance().setTimerClick(true);
		
		ThemeManager.getInstance().setTheme(new EtyllicTheme());

		//ThemeManager.getInstance().getTheme().setTextColor(Color.black);
		//ThemeManager.getInstance().setTheme(new EtyllicMonoTheme());
		
		return new BackgroundColorChangerApplication(w,h);
	}
	
}
