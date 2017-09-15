package examples.etyl.collision.hexagon;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;

public class HexagonExample extends Etyl {

	private static final long serialVersionUID = 1L;

	public HexagonExample() {
		super(800, 300);
	}

	public static void main(String[] args) {
		HexagonExample app = new HexagonExample();
		app.init();
	}

	@Override
	public Application startApplication() {
		initialSetup("");
		return new HexagonalApplication(w, h);
	}
	
}
