package examples.etyl.graph;
import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;
import examples.etyl.graph.view.SimpleGraphExample;

public class GraphViewer extends Etyl {

	private static final long serialVersionUID = 1L;

	public GraphViewer() {
		super(800, 600);
	}

	public static void main(String[] args){
		
		GraphViewer viewer = new GraphViewer();
		
		viewer.init();
	}	
	
	@Override
	public Application startApplication() {
		return new SimpleGraphExample(w,h);
	}

}

