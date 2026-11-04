package Lecture_5;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class lec_5_GridPane extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        // ===== Title =====
        Label lblTitle = new Label("Login");
        lblTitle.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 20));

        // ===== Username row =====
        Label lblUsername = new Label("Username");
        TextField tfUsername = new TextField();
        tfUsername.setFocusTraversable(false);

        // ===== Password row =====
        Label lblPassword = new Label("Password");
        PasswordField pfPassword = new PasswordField();
        pfPassword.setFocusTraversable(false);

        // ===== Login button =====
        Button btnLogin = new Button("Login");

        // ===== Root layout (GridPane) =====
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);

        // add(node, column, row)
        root.add(lblTitle, 0, 0);
        root.add(lblUsername, 0, 1);
        root.add(tfUsername, 1, 1);
        root.add(lblPassword, 0, 2);
        root.add(pfPassword, 1, 2);
        root.add(btnLogin, 1, 3);

        // ===== Scene and Stage =====
        Scene scene = new Scene(root, 400, 250);
        stage.setScene(scene);
        stage.setTitle("GridPane");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}