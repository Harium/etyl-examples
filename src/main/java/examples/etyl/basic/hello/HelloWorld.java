package examples.etyl.basic.hello;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;

public class HelloWorld extends Etyl {

    private static final long serialVersionUID = 1L;

    public HelloWorld() {
        super(800, 600);
    }

    public static void main(String[] args) {
        HelloWorld app = new HelloWorld();
        app.setTitle("Hello World");
        app.setIcon("particle.png");
        app.init();
    }

    @Override
    public Application startApplication() {
        //This line is needed because our main class is inside /src folder
        //See the current folder with:
        //System.out.println(getPath());
        //initialSetup("../");

        return new HelloWorldApplication(w, h);
    }

}
