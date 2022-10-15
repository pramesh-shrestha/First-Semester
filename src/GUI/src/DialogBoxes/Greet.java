package DialogBoxes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;

public class Greet extends Application
{
  private void Message(ActionEvent event)
  {
    Alert alert = new Alert(Alert.AlertType.WARNING);
    alert.setHeaderText("dsfdsfds");
    alert.show();
  }

  @Override public void start(Stage stage) throws Exception
  {
    VBox mainPane = new VBox();
    Scene scene = new Scene(mainPane);
    stage.setScene(scene);
    stage.show();
  }
  public static void main(String[] args)
  {
    launch(args);
  }
}
