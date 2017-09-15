package examples.etyl.joystick;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;
import com.harium.etyl.input.JoystickHandler;

public class JoystickExample extends Etyl {

    private static final long serialVersionUID = 1L;

    public JoystickExample() {
        super(800, 600);
    }

    public static void main(String[] args) {
        JoystickExample app = new JoystickExample();
        app.init();
    }

    @Override
    public Application startApplication() {
        //initialSetup("../../../../../");
        //Searching for 5 joysticks
        JoystickHandler.getInstance().init(5);

        return new JoystickApplication(w, h);
    }

}
