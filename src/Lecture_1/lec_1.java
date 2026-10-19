package Lecture_1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class lec_1 extends Application {

    @Override
    public void start(Stage stage) {
        Label label = new Label("  JavaFX  ");
        Scene scene = new Scene(new StackPane(label), 800, 400);
        stage.setTitle("JavaFX Test");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() throws Exception {
        super.init();
    }
}




