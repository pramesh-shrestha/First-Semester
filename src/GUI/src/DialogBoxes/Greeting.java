package DialogBoxes;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.awt.*;

public class Greeting extends Application
{
  private Scene scene;
  private VBox mainPane;
  private HBox greeting;
  private HBox OK;
  private Button btnOk;
  private Image notification;
  private ImageView logoView;

  private Label label;

  public void start(Stage stage)
  {
    stage.setTitle("Message");
    notification = new Image("file:GUI/src/DialogBoxes/notification.png");
    logoView = new ImageView(notification);
    logoView.setFitWidth(30);
    logoView.setFitHeight(30);


    Font font = new Font(16);
    label = new Label("Greetings Earthling");
    label.setFont(font);
    greeting = new HBox();
    greeting.setSpacing(35);


    greeting.getChildren().addAll(logoView,label);

    //OK button
    btnOk = new Button("OK");
    OK = new HBox();
    OK.setPadding(new Insets(0,0,0,125));

    OK.getChildren().addAll(btnOk);

    mainPane = new VBox(greeting,OK);
    mainPane.setAlignment(Pos.CENTER);
    mainPane.setSpacing(10);
    mainPane.setPadding(new Insets(0,0,0,20));
    scene = new Scene(mainPane,300,100);
    stage.setScene(scene);
    stage.show();
  }
}
