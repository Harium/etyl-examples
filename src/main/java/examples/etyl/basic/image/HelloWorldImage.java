package examples.etyl.basic.image;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;

public class HelloWorldImage extends Etyl {

    private static final long serialVersionUID = 1L;

    public HelloWorldImage() {
        super(800, 600);
    }

    public static void main(String[] args) {
        HelloWorldImage app = new HelloWorldImage();
        app.setTitle("Hello World Example");
        app.setIcon("particle.png");
        app.init();
    }

    @Override
    public Application startApplication() {
        //This line is needed because our main class is inside /src folder
        //See the current folder with:
        //System.out.println(getPath());
        //initialSetup("../");

        return new HelloWorldImageApplication(w, h);
    }

}
