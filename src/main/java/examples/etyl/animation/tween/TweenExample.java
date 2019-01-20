package examples.etyl.animation.tween;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;
import com.harium.etyl.commons.graphics.Color;
import com.harium.etyl.commons.interpolation.Interpolator;
import com.harium.etyl.commons.layer.Layer;
import com.harium.etyl.core.animation.Animation;
import com.harium.etyl.core.animation.script.LayerAnimation;
import com.harium.etyl.core.graphics.Graphics;

public class TweenExample extends Etyl {

    private static final long serialVersionUID = 1L;

    public TweenExample() {
        super(800, 600);
    }

    public static void main(String[] args) {
        TweenExample viewer = new TweenExample();
        viewer.init();
    }

    @Override
    public Application startApplication() {
        return new TweenBall(w, h);
    }

    public class TweenBall extends Application {

        public TweenBall(int w, int h) {
            super(w, h);
        }

        private Layer fadeBall;

        private Layer linearBall;
        private Layer quadraticBall;
        private Layer reverseQuadraticBall;
        private Layer radialBall;

        @Override
        public void load() {

            loading = 10;

            linearBall = new Layer(40, 80, 30, 30);
            quadraticBall = new Layer(40, 120, 30, 30);
            reverseQuadraticBall = new Layer(40, 160, 30, 30);
            radialBall = new Layer(40, 200, 30, 30);

            fadeBall = new Layer(40, 240, 30, 30);

            int duration = 2000;

            LayerAnimation linearAnimation = Animation.animate(linearBall).move(duration).from(40, 80).to(480, 80).interpolate(Interpolator.LINEAR);
            linearAnimation.move(duration).from(480, 80).to(40, 80).interpolate(Interpolator.LINEAR).then(linearAnimation);
            linearAnimation.start();

            LayerAnimation quadraticAnimation = Animation.animate(quadraticBall).move(duration).from(40, 120).to(480, 120).interpolate(Interpolator.QUADRATIC);
            quadraticAnimation.move(duration).from(480, 120).to(40, 120).interpolate(Interpolator.QUADRATIC).then(quadraticAnimation);
            quadraticAnimation.start();

            LayerAnimation reverseQuadraticAnimation = Animation.animate(reverseQuadraticBall).move(duration).from(40, 160).to(480, 160).interpolate(Interpolator.REVERSE_QUADRATIC);
            reverseQuadraticAnimation.move(duration).from(480, 160).to(40, 160).interpolate(Interpolator.REVERSE_QUADRATIC).then(reverseQuadraticAnimation);
            reverseQuadraticAnimation.start();

            LayerAnimation radialAnimation = Animation.animate(radialBall).move(duration).from(40, 160).to(480, 160).interpolate(Interpolator.RADIAL);
            radialAnimation.move(duration).from(480, 160).to(40, 160).interpolate(Interpolator.RADIAL).then(radialAnimation);
            radialAnimation.start();

            Animation.animate(fadeBall).fadeIn().during(duration).start();

            loading = 100;
        }

        @Override
        public void draw(Graphics g) {
            drawBall(g, linearBall);
            drawBall(g, quadraticBall);
            drawBall(g, reverseQuadraticBall);

            g.setOpacity(fadeBall.getOpacity());
            drawBall(g, fadeBall);
            g.resetOpacity();
        }

        protected void drawBall(Graphics g, Layer ball) {
            g.setColor(Color.BLUE);
            g.fillOval(ball.getX(), ball.getY(), ball.getW(), ball.getH());
            g.setColor(Color.BLACK);
            g.drawOval(ball.getX(), ball.getY(), ball.getW(), ball.getH());
        }
    }
}

