package Lecture_5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class lec_5_BorderPane extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        // ===== Left region  =====
        VBox vbLeft = new VBox(25);
        for (int i = 1; i <= 10; i++) {
            Button btn = new Button("Button " + i);
            vbLeft.getChildren().add(btn);
        }

        // ===== Top and Bottom regions  =====
        TextField tfTop = new TextField();
        TextField tfBottom = new TextField();

        // ===== Center region  =====
        Label lblCenter = new Label("JavaFX");
        lblCenter.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 26));

        // ===== Right region  =====
        Button btnRight = new Button("Button Right");
        BorderPane.setAlignment(btnRight, Pos.CENTER);

        // ===== Root layout (BorderPane) =====
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(10));
        root.setTop(tfTop);
        root.setBottom(tfBottom);
        root.setLeft(vbLeft);
        root.setRight(btnRight);
        root.setCenter(lblCenter);

        BorderPane.setMargin(tfTop, new Insets(0, 0, 10, 0));
        BorderPane.setMargin(tfBottom, new Insets(10, 0, 0, 0));

        // ===== Scene and Stage =====
        Scene scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        stage.setTitle("BorderPane");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}