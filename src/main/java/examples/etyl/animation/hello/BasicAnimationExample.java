package examples.etyl.animation.hello;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;


public class BasicAnimationExample extends Etyl {

	private static final long serialVersionUID = 1L;

	public BasicAnimationExample() {
		super(800, 600);
	}

	public static void main(String[] args) {
		BasicAnimationExample app = new BasicAnimationExample();
		//app.init();
		System.setProperty ("java.protocol.handler.pkgs", "com.leaningtech.handlers");
		app.init("http://localhost:8080/");
	}

	@Override
	public Application startApplication() {
		return new HelloWorldAnimated(w,h);
	}

}
