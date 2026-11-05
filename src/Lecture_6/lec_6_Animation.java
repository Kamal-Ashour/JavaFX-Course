package Lecture_6;

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.FillTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;


public class lec_6_Animation extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        // ===== FillTransition =====
        Circle circleFill = new Circle(150, 150, 90, Color.CHARTREUSE);
        circleFill.setStroke(Color.BLUE);
        circleFill.setStrokeWidth(3);

        // FillTransition works only on shapes
        FillTransition fillTransition =
                new FillTransition(Duration.seconds(3), circleFill, Color.BLUE, Color.AQUAMARINE);
        // The same transition can be configured with setters:
        // fillTransition.setDuration(Duration.seconds(3));
        // fillTransition.setShape(circleFill);
        // fillTransition.setFromValue(Color.BLUE);
        // fillTransition.setToValue(Color.AQUAMARINE);
        fillTransition.setCycleCount(Animation.INDEFINITE);   // INDEFINITE = -1
        fillTransition.setDelay(Duration.seconds(0.8));         // waits 0.8 seconds before starting
        fillTransition.setAutoReverse(true);
        fillTransition.play();

        // ===== FadeTransition =====
        Circle circleFade = new Circle(450, 150, 90, Color.CHARTREUSE);
        circleFade.setStroke(Color.BLUE);
        circleFade.setStrokeWidth(3);

        // FadeTransition works on any node
        FadeTransition fadeTransition = new FadeTransition();
        fadeTransition.setNode(circleFade);
        fadeTransition.setDuration(Duration.seconds(0.6));
        fadeTransition.setFromValue(0);
        fadeTransition.setToValue(1);
        fadeTransition.setCycleCount(Animation.INDEFINITE);
        fadeTransition.setAutoReverse(true);
        fadeTransition.play();

        // ===== Root layout =====
        Group root = new Group(circleFill, circleFade);

        // ===== Scene and Stage =====
        Scene scene = new Scene(root, 600, 300);
        stage.setScene(scene);
        stage.setTitle("Animation");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}