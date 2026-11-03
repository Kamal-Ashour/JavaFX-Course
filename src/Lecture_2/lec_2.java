package Lecture_2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class lec_2 extends Application {

    @Override
    public void start(Stage stage) {
        Label lbl_Title = new Label("Login Page");
        lbl_Title.setFont(new Font("Arial", 55));
        lbl_Title.setTextFill(Color.BROWN);

        // Label 1 Username
        Label lbl = new Label("Username");
        lbl.setFont(new Font("Arial",16));
        lbl.setTextFill(Color.NAVY);

        // Label 2 Password
        Label lb2 = new Label("Password");
        lb2.setFont(new Font("Arial",16));
        lb2.setTextFill(Color.NAVY);

        // Text Field
        TextField TF_user = new TextField();
        TF_user.setFocusTraversable(false);
        TF_user.setPromptText("Enter UserName");

        // Password Field
        PasswordField TF_pass = new PasswordField();
        TF_pass.setFocusTraversable(false);
        TF_pass.setPromptText("Enter Password");


        HBox hb_user = new HBox();
        hb_user.getChildren().addAll(lbl,TF_user);
        hb_user.setSpacing(22);
        hb_user.setAlignment(Pos.CENTER);


        HBox hb_pass = new HBox();
        hb_pass.getChildren().addAll(lb2,TF_pass);
        hb_pass.setSpacing(22);
        hb_pass.setAlignment(Pos.CENTER);

        Separator sp1 = new Separator();
        Separator sp2 = new Separator();

        Button btn = new Button("Login");
        btn.setFont(new Font("Arial",24));
        btn.setCursor(Cursor.HAND);
        btn.setTextFill(Color.WHITE);
        btn.setBackground(new Background(new BackgroundFill(Color.NAVY,new CornerRadii(18),Insets.EMPTY)));

        VBox root = new VBox();
            root.setSpacing(18);
            root.setPadding(new Insets(8,12,15,18));
            root.getChildren().addAll(lbl_Title,sp1,hb_user,hb_pass,sp2,btn);
            root.setAlignment(Pos.CENTER);
            root.setBackground(Background.EMPTY);


        Scene s = new Scene(root,600,300,Color.WHITE);
        stage.setScene(s);
        stage.setTitle(" JavaFX - Al-Aqsa University");
        stage.setResizable(false);
        stage.setAlwaysOnTop(true);
        stage.setMaximized(false);
        stage.show();
    }

    public static void main(String[] args) { launch(args); }

}
