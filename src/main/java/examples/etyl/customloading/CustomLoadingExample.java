package examples.etyl.customloading;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;
import examples.etyl.customloading.application.CustomLoadApplication;


public class CustomLoadingExample extends Etyl {

    private static final long serialVersionUID = 1L;

    public CustomLoadingExample() {
        super(800, 600);
    }

    public static void main(String[] args) {
        CustomLoadingExample app = new CustomLoadingExample();
        app.init();
    }

    @Override
    public Application startApplication() {
        return new CustomLoadApplication(w, h);
    }

}
