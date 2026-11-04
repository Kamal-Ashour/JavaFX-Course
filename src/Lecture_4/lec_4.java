package Lecture_4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class lec_4 extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        // ===== Title =====
        Label lblTitle = new Label("Login Page");
        lblTitle.setFont(new Font("Arial", 55));
        lblTitle.setTextFill(Color.BROWN);

        // ===== Username row =====
        Label lblUsername = new Label("Username");
        lblUsername.setMinWidth(80);
        lblUsername.setTooltip(new Tooltip("Username"));
        lblUsername.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 15));
        lblUsername.setCursor(Cursor.OPEN_HAND);
        lblUsername.setBorder(new Border(new BorderStroke(Color.BLUE, BorderStrokeStyle.SOLID, new CornerRadii(8), BorderWidths.DEFAULT)));

        TextField tfUsername = new TextField();
        tfUsername.setFocusTraversable(false);
        tfUsername.setPromptText("Enter Username");

        HBox hbUsername = new HBox(22, lblUsername, tfUsername);
        hbUsername.setAlignment(Pos.CENTER);

        // ===== Password row =====
        Label lblPassword = new Label("Password");
        lblPassword.setMinWidth(80);
        lblPassword.setFont(new Font("Arial", 16));
        lblPassword.setTextFill(Color.NAVY);

        PasswordField pfPassword = new PasswordField();
        pfPassword.setFocusTraversable(false);
        pfPassword.setPromptText("Enter Password");

        HBox hbPassword = new HBox(22, lblPassword, pfPassword);
        hbPassword.setAlignment(Pos.CENTER);

        // ===== Remember me =====
        CheckBox cbRemember = new CheckBox("Remember me");
        cbRemember.setFont(new Font("Arial", 12));
        cbRemember.setTextFill(Color.RED);
        cbRemember.setFocusTraversable(false);

        // ===== ToggleButtons =====
        ToggleButton tbtnOn = new ToggleButton("ON");
        ToggleButton tbtnOff = new ToggleButton("OFF");
        ToggleGroup groupToggle = new ToggleGroup();
        tbtnOn.setToggleGroup(groupToggle);
        tbtnOff.setToggleGroup(groupToggle);

        HBox hbToggle = new HBox(10, tbtnOn, tbtnOff);
        hbToggle.setAlignment(Pos.CENTER);

        // ===== RadioButtons =====
        ToggleGroup groupGender = new ToggleGroup();
        RadioButton rbMale = new RadioButton("Male");
        rbMale.setToggleGroup(groupGender);
        RadioButton rbFemale = new RadioButton("Female");
        rbFemale.setToggleGroup(groupGender);

        HBox hbGender = new HBox(20, rbMale, rbFemale);
        hbGender.setAlignment(Pos.CENTER);

        // ===== Separators =====
        Separator sepTop = new Separator();
        Separator sepBottom = new Separator();

        // ===== Result message =====
        Label lblResult = new Label("");
        lblResult.setFont(new Font("Arial", 20));
        lblResult.setTextFill(Color.GREEN);

        // ===== Login button =====
        Button btnLogin = new Button("Login");
        btnLogin.setFont(new Font("Arial", 24));
        btnLogin.setCursor(Cursor.HAND);
        btnLogin.setTextFill(Color.WHITE);
        btnLogin.setBackground(new Background(new BackgroundFill(Color.NAVY, new CornerRadii(18), Insets.EMPTY)));

        // Ways of writing an event handler
        // because each setOnAction call replaces the previous handler):

        // 1) Anonymous inner class
        // btnLogin.setOnAction(new EventHandler<ActionEvent>() {
        //     @Override
        //     public void handle(ActionEvent actionEvent) {
        //         System.out.println("Login clicked");
        //     }
        // });

        // 2) Lambda with an explicit parameter type
        // btnLogin.setOnAction((ActionEvent e) -> {
        //     System.out.println("Login clicked");
        // });

        // 3) Lambda (shortest form) - the one used here
        btnLogin.setOnAction(e -> {
            String username = tfUsername.getText();
            String password = pfPassword.getText();

            if (username.isEmpty() || password.isEmpty()) {
                lblResult.setText("Enter the Username and Password");
                lblResult.setTextFill(Color.RED);
            } else if (username.equals("admin") && password.equals("123456")) {
                lblResult.setText("Login As Admin");
                lblResult.setTextFill(Color.GREEN);
            } else {
                lblResult.setText("Username or password not correct");
                lblResult.setTextFill(Color.BLUE);
            }
        });

        // ===== Root layout =====
        VBox root = new VBox(18);
        root.setPadding(new Insets(8, 12, 15, 18));
        root.setAlignment(Pos.CENTER);
        root.setBackground(Background.EMPTY);
        root.getChildren().addAll(lblTitle, sepTop, hbUsername, hbPassword, cbRemember, hbToggle, hbGender, sepBottom, btnLogin, lblResult);

        // ===== Scene and Stage =====
        Scene scene = new Scene(root, 800, 600, Color.WHITE);

        stage.setScene(scene);
        stage.setTitle("JavaFX - Al-Aqsa University");
        stage.setResizable(false);
        stage.setAlwaysOnTop(true);
        stage.setMaximized(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
