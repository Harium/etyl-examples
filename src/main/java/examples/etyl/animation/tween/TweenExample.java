package examples.etyl.animation.tween;
import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;

public class TweenExample extends Etyl {

	private static final long serialVersionUID = 1L;

	public TweenExample() {
		super(800, 600);
	}

	public static void main(String[] args){
		TweenExample viewer = new TweenExample();
		viewer.init();
	}	
	
	@Override
	public Application startApplication() {
		initialSetup("../");

		return new TweenBall(w,h);
	}

}

