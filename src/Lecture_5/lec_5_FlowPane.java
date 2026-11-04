package Lecture_5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class lec_5_FlowPane extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        // ===== Root layout (FlowPane) =====
        FlowPane root = new FlowPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(15));

        // ===== Buttons =====
        for (int i = 1; i <= 10; i++) {
            Button btn = new Button("Button " + i);
            root.getChildren().add(btn);
        }

        // ===== Scene and Stage =====
        Scene scene = new Scene(root, 400, 250);
        stage.setScene(scene);
        stage.setTitle("FlowPane");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}