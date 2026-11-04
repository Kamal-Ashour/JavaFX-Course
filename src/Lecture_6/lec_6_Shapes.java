package Lecture_6;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class lec_6_Shapes extends Application {
    static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //==============================    Line    ===================================
        // diagonalLine
        Line diagonalLine = new Line();
        diagonalLine.setStartX(120);
        diagonalLine.setStartY(60);
        diagonalLine.setEndX(300);
        diagonalLine.setEndY(50);

        // Straight line
        Line StraightLine = new Line(20, 30, 300, 30);
        StraightLine.setStroke(Color.BURLYWOOD);
        StraightLine.setStrokeWidth(4);
        StraightLine.setFill(Color.BLUE);

        //==============================    Rectangle    ===================================
        Rectangle rec = new Rectangle(120, 40, 120, 120);
//        rec.setX(120);
//        rec.setY(40);
//        rec.setWidth( 120);
//        rec.setHeight(120);
        rec.setFill(Color.CYAN);
        rec.setStroke(Color.BLUE);
        rec.setStrokeWidth(3);
        //==============================    Circle    ===================================
        Circle c = new Circle(280, 260, 60);
//        c.setCenterX(280);
//        c.setCenterY(260);
//        c.setRadius(60);
        c.setFill(Color.BURLYWOOD);
        c.setStroke(Color.BLUE);
        c.setStrokeWidth(4);

        //==============================    Ellipse    ===================================
        Ellipse e = new Ellipse(280, 160, 30, 60);
//        e.setCenterX(280);
//        e.setCenterY(160);
//        e.setRadiusX(30);
//        e.setRadiusY(60);

        e.setFill(Color.BURLYWOOD);
        e.setStroke(Color.BLUE);
        e.setStrokeWidth(4);
        //==============================    Polygon    ===================================
        Polygon p = new Polygon();
        p.getPoints().addAll(
                100.0, 200.0,
                200.0, 50.0,
                300.0, 200.0
        );

        p.setFill(Color.BURLYWOOD);
        p.setStroke(Color.BLUE);
        p.setStrokeWidth(4);
        //==============================    Polyline    ===================================
        Polyline pl = new Polyline();
        pl.getPoints().addAll(
                100.0, 200.0,
                200.0, 50.0,
                300.0, 200.0
        );
        pl.setStroke(Color.BLUE);
        pl.setStrokeWidth(4);


        //===================================================================================
        Group root = new Group(c);
        Scene s = new Scene(root, 720, 410);
        stage.setScene(s);
        stage.show();
    }
}
