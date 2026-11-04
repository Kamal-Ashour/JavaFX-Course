package Lecture_5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class lec_5_Pane extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        // ===== Title =====
        Label lblTitle = new Label("Login");
        lblTitle.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 20));
        lblTitle.setLayoutX(25);
        lblTitle.setLayoutY(20);

        // ===== Username row =====
        Label lblUsername = new Label("Username");
        lblUsername.setLayoutX(25);
        lblUsername.setLayoutY(75);

        TextField tfUsername = new TextField();
        tfUsername.setFocusTraversable(false);
        tfUsername.setLayoutX(110);
        tfUsername.setLayoutY(70);

        // ===== Password row =====
        Label lblPassword = new Label("Password");
        lblPassword.setLayoutX(25);
        lblPassword.setLayoutY(120);

        PasswordField pfPassword = new PasswordField();
        pfPassword.setFocusTraversable(false);
        pfPassword.setLayoutX(110);
        pfPassword.setLayoutY(115);

        // ===== Login button =====
        Button btnLogin = new Button("Login");
        btnLogin.setLayoutX(110);
        btnLogin.setLayoutY(170);

        // ===== Root layout (Pane) =====
        Pane root = new Pane();
        root.getChildren().addAll(lblTitle, lblUsername, tfUsername,
                lblPassword, pfPassword, btnLogin);

        // ===== Scene and Stage =====
        Scene scene = new Scene(root, 400, 250);
        stage.setScene(scene);
        stage.setTitle("Pane");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
