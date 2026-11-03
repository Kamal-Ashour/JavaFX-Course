package Lecture_3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class lec_3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        // ===== Labels  =====
        Label lb1 = new Label("Label 1");
        lb1.setTranslateX(30);
        lb1.setTranslateY(20);

        Label lb2 = new Label("Label 2");
        lb2.setTranslateX(150);
        lb2.setTranslateY(20);

        Label lb3 = new Label("Label 3");
        lb3.setTranslateX(270);
        lb3.setTranslateY(20);

        // ===== ImageView  =====
        Image image = new Image(getClass().getResourceAsStream("/images/E63s.jpg"));
        ImageView iv = new ImageView(image);
        iv.setFitWidth(220);
        iv.setFitHeight(130);
        iv.setTranslateX(30);
        iv.setTranslateY(60);

        // ===== Text nodes  =====
        Text T1 = new Text("Text 1");
        T1.setTranslateX(30);
        T1.setTranslateY(220);

        Text T2 = new Text("Text 2");
        T2.setTranslateX(30);
        T2.setTranslateY(250);

        // ===== TextArea =====
        TextArea TA1 = new TextArea();
        TA1.setPrefSize(280, 170);
        TA1.setWrapText(true);
        TA1.setTranslateX(300);
        TA1.setTranslateY(60);

        // ===== Separator =====
        Separator sp = new Separator();
        sp.setPrefWidth(660);
        sp.setTranslateX(30);
        sp.setTranslateY(300);

        // ===== CheckBox =====
        CheckBox cb = new CheckBox("Remember me");
        cb.setFont(new Font("Arial", 12));
        cb.setTextFill(Color.RED);
        cb.setFocusTraversable(false);
        cb.setPadding(new Insets(8));
        cb.setTranslateX(30);
        cb.setTranslateY(315);

        // ===== Root and Scene =====
        Group root = new Group(lb1, lb2, lb3, iv, T1, T2, TA1, sp, cb);
        Scene scene = new Scene(root, 720, 410);

        stage.setScene(scene);
        stage.setTitle("Lec 3");
        stage.setMaximized(false);
        stage.setResizable(false);
        stage.setAlwaysOnTop(true);
        stage.show();
    }
}