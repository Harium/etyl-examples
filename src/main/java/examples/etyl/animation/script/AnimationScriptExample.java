package examples.etyl.animation.script;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;

public class AnimationScriptExample extends Etyl {

	private static final long serialVersionUID = 1L;

	public AnimationScriptExample() {
		super(768, 417);
	}

	public static void main(String[] args) {
		AnimationScriptExample app = new AnimationScriptExample();
		app.init();
	}

	@Override
	public Application startApplication() {
		initialSetup("");
		
		return new StriderAnimation(w,h);
	}
	
}
