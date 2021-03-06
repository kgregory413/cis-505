/*
Assignment 7.2 - CIS505 - Kylie Gregory 10/17/2021
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
Guardado, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University.
    Modified by R. Krasso 2021
    Additional modifications by Kylie Gregory 2021
*/

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class GregoryFutureValueApp extends Application {

    // @Override start method with a single argument for the Stage object.
    @Override
    public void start(Stage primaryStage) {

        // Private variables for two TextFields, one TextArea, four Labels, one ComboBox of type Integer, and two Buttons.
        private TextField txtPayment = new TextField();
        private TextField txtRate = new TextField();
        private TextArea txtResult = new TextArea();
        private Label lblMonthlyPayment = new Label("Monthly Payment:");
        private Label lblInterestRate = new Label("Interest Rate:");
        private Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
        private Label lblYears = new Label("Years:");
        private ComboBox<Integer> cboYears = new ComboBox<>();
        private Button btnClear = new Button("Clear");
        private Button btnCalculate = new Button("Calculate");

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5,12.5,13.5,14.5));
        pane.setPrefSize(300,300);
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        lblInterestRateFormat.setTextFill(Color.RED); // Set the font color of the interest rate instructions to red.
        pane.add(lblInterestRateFormat, 1, 2); // Add the label to the grid pane.
        GridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT); // Position the label to the right of the pane.

        pane.add(lblYears, 0, 3);
        cboYears.setPrefWidth(165);
        pane.add(cboYears, 1, 3);

        HBox actionBtnContainer = new HBox(); // Create a new HBox container.
        actionBtnContainer.setPadding(new Insets(15,0,15,30)); // Set the containers padding.
        actionBtnContainer.setSpacing(10); // Set the containers spacing.
        actionBtnContainer.getChildren().add(btnClear); // Add the btnClear to the container.
        actionBtnContainer.getChildren().add(btnCalculate); // Add the btnCalculate to the container.
        pane.add(actionBtnContainer, 1, 4); // Add the container to the GridPanel.

        pane.add(txtResult, 0, 5, 2, 1);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Gregory Future Value App");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}