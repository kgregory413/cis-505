/*
Assignment 10.2 - CIS505 - Kylie Gregory 11/07/2021
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
Guardado, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University.
    Modified by R. Krasso 2021
    Additional modifications by Kylie Gregory 2021
*/

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;

public class GregoryGradeBookApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        Color LightCoral = new Color.LIGHTCORAL;
        Color Beige = new Color.BEIGE;
        Color DarkSeaGreen = new Color.DARKSEAGREEN;
        Color Wheat = new Color.WHEAT;

        Font fntHeader = Font.font("Courier New", FontWeight.BOLD, FontPosture.REGULAR, 16);
        Font fntButton = Font.font("Courier New", FontWeight.BOLD, FontPosture.REGULAR, 12);

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5,12.5,13.5,14.5));
        pane.setPrefSize(300,300);
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        pane.setBackground(new Background(new BackgroundFill(Beige, CornerRadii.EMPTY, Insets.EMPTY)));

        lblTitle.setTextFill(LightCoral);
        lblTitle.setFont(Font.font("Courier New", FontWeight.BOLD, FontPosture.REGULAR, 20));
        pane.add(lblTitle, 0, 0, 2, 1);
        GridPane.setHalignment(lblTitle, HPos.CENTER);

        btnView.setTextFill(LightCoral);
        btnView.setFont(fntButton);
        btnView.setPrefWidth(250);
        pane.add(btnView, 0, 1, 2, 1);
        GridPane.setHalignment(btnView, HPos.CENTER);

        lblHeader1.setTextFill(DarkSeaGreen);
        lblHeader1.setFont(fntHeader);
        pane.add(lblHeader1, 0, 2, 2, 1);
        GridPane.setHalignment(lblHeader1, HPos.CENTER);

        pane.add(lblName, 0, 3);
        pane.add(txtName, 1, 3);

        pane.add(lblSurname, 0, 4);
        pane.add(txtSurname, 1, 4);

        lblHeader2.setTextFill(DarkSeaGreen);
        lblHeader2.setFont(fntHeader);
        lblHeader2.setFont(Font.font("Courier New", FontWeight.BOLD, FontPosture.REGULAR, 16));
        pane.add(lblHeader2, 0, 5, 2, 1);
        GridPane.setHalignment(lblHeader2, HPos.CENTER);

        pane.add(lblCourse, 0, 6);
        pane.add(txtCourse, 1, 6);

        pane.add(lblGrade, 0, 7);
        pane.add(cboGrade, 1, 7);
        cboGrade.getItems().addAll("A", "B", "C", "D", "F");
        cboGrade.setPrefWidth(165);

        btnSave.setTextFill(DarkSeaGreen);
        btnSave.setFont(fntButton);
        btnSave.setPrefWidth(80);

        btnClear.setTextFill(DarkSeaGreen);
        btnClear.setFont(fntButton);
        btnClear.setPrefWidth(80);

        HBox hboxBtnContainer = new HBox();
        hboxBtnContainer.setPadding(new Insets(15,0,15,30));
        hboxBtnContainer.setSpacing(10);
        hboxBtnContainer.getChildren().add(btnClear);
        hboxBtnContainer.getChildren().add(btnSave);
        pane.add(hboxBtnContainer, 1, 8);

        Scene scene = new Scene(pane, 300, 300, Color.Wheat);
        primaryStage.setTitle("GradeBook App");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    private TextField txtName = new TextField();
    private TextField txtSurname = new TextField();
    private TextField txtCourse = new TextField();
    private ComboBox<String> cboGrade = new ComboBox<>();
    private Label lblTitle = new Label("GradeBook App");
    private Label lblHeader1 = new Label("Student ID: ");
    private Label lblName = new Label("First Name:");
    private Label lblSurname = new Label("Last Name:");
    private Label lblHeader2 = new Label("Course Number: ");
    private Label lblCourse = new Label("Course Name:");
    private Label lblGrade = new Label("Letter Grade:");
    private Button btnClear = new Button("Clear Gradebook");
    private Button btnSave = new Button("Save GradeBook");
    private Button btnView = new Button("View Grades");
}
