package examples.etyl.i18n;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;

public class MultiLanguageExample extends Etyl {

    private static final long serialVersionUID = 1L;

    public MultiLanguageExample() {
        super(800, 600);
    }

    public static void main(String[] args) {
        MultiLanguageExample example = new MultiLanguageExample();
        example.init();
    }

    @Override
    public Application startApplication() {
        return new MultiLanguageApplication(w, h);
    }

}
