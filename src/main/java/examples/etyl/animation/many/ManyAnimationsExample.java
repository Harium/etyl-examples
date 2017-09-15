package examples.etyl.animation.many;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;


public class ManyAnimationsExample extends Etyl {

	private static final long serialVersionUID = 1L;

	public ManyAnimationsExample() {
		super(640, 480);
	}

	public static void main(String[] args) {
		ManyAnimationsExample app = new ManyAnimationsExample();
		app.init();
	}

	@Override
	public Application startApplication() {
		return new ManyAnimations(w,h);
	}

}
