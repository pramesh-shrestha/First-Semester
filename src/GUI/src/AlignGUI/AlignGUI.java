package AlignGUI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class AlignGUI extends Application
{
  private HBox mainPane;
  private Scene scene;

  private VBox exit;
  private GridPane coordinates;
  private VBox buttons;

  private CheckBox exitOk;
  private CheckBox exitCancel;

  private Label xLabel;
  private Label yLabel;

  private TextField textFieldX;
  private TextField textFieldY;

  private Button buttonOk;
  private Button buttonCancel;
  private Button buttonClear;

  public void start(Stage stage)
  {
    stage.setTitle("Align");

    exitOk = new CheckBox("Exit on OK");
    exitCancel = new CheckBox( "Exit on Cancel");
    exit = new VBox(5);
    exit.setPadding(new Insets(20,10,10,5));
    exit.getChildren().addAll(exitOk, exitCancel);

    xLabel = new Label("X:");
    textFieldX = new TextField();
    yLabel = new Label("Y:");
    textFieldY = new TextField();
    coordinates = new GridPane();
    coordinates.setPadding(new Insets(10,10,10,5));
    coordinates.setVgap(12);
    coordinates.addRow(0,xLabel,textFieldX);
    coordinates.addRow(1,yLabel,textFieldY);

    buttonOk = new Button("OK");
    buttonOk.setPrefSize(70,20); //first width and height
    buttonCancel = new Button("Cancel");
    buttonCancel.setPrefSize(70,20); //first width and height
    buttonClear = new Button("Clear");
    buttonClear.setPrefSize(70,20); //first width and height
    buttons = new VBox();
    buttons.getChildren().addAll(buttonOk,buttonCancel,buttonClear);


    mainPane = new HBox(5);
    mainPane.setPadding(new Insets(10,5,2,5));
    mainPane.getChildren().addAll(exit,coordinates,buttons);
    scene = new Scene(mainPane);
    stage.setScene(scene);
    stage.show();

  }

}
