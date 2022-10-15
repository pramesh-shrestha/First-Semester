package PracticeEventHandlers;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HandlingEvents extends Application
{
  private Button bt1;
  private TextField name;
  private String value;
  private RadioButton sub1;
  private RadioButton sub2;
  private RadioButton sub3;
  private RadioButton sub4;
  private Button submit;
  private CheckBox fav1;
  private CheckBox fav2;
  private CheckBox fav3;
  private CheckBox fav4;
  private String checkBox;
  private VBox checkBoxes;
  private String comboBox;
  private ComboBox<String> college;

  public void start(Stage stage)
  {
    //this demo is for reading input from a TextField and handling event
    name = new TextField();
    name.setMaxWidth(300);
    bt1 = new Button("click here");
    //handling event on bt1 by using setOnAction method, rest happens in the class below.
    // Also remember to add this event to the root layout
    bt1.setOnAction(new Listener());



    //Demo for reading Input from RadioButton

    //First add a label for radio buttons
    Label radioLabel = new Label("Choose your topic");
    //We need to create an object of ToggleGroup then we will add the controls to VBox layout
    ToggleGroup group = new ToggleGroup();
    //create RadioButton for each element you want as a radio button
    sub1 = new RadioButton("SDJ");
    sub2 = new RadioButton("DMA");
    sub3 = new RadioButton("RWD");
    sub4 = new RadioButton("SEP");
    //now add these radio buttons to the group by using setToggleGroup method
    sub1.setToggleGroup(group);
    sub2.setToggleGroup(group);
    sub3.setToggleGroup(group);
    sub4.setToggleGroup(group);
    //Adding Submit button at the end of the stage using BorderPane aligning to the center
    submit = new Button("Submit");
    submit.setOnAction(new Listener()); //setting action on the submit button
    //Creating VBox layout to put it together with the Checkbox below
    VBox radioButton = new VBox();
    //adding CheckBox to the VBox layout
    radioButton.getChildren().addAll(radioLabel,sub1,sub2,sub3,sub4,submit);


    //Demo of CHECKBOX

    //First create a Label for the CheckBox
    Label checkBoxLabel = new Label("Favourite Language/s");
    //creating options of check boxes
    fav1 = new CheckBox("Java");
    fav2 = new CheckBox("C#");
    fav3 = new CheckBox("JavaScript");
    fav4 = new CheckBox("Python");
    //Creating HBox layout to put it together with the radio button
    checkBoxes = new VBox();
    //adding CheckBox to the VBox layout
    checkBoxes.getChildren().addAll(checkBoxLabel,fav1,fav2,fav3,fav4);


    //Demo of COMBO BOX

    //Adding label for the ComboBox
    Label comboLabel = new Label("Select city");
    //create object of type ComboBox
    college = new ComboBox<>();
    //adding elements to the ComboBox
    college.getItems().add("VIA, Horsen");
    college.getItems().add("VIA, Århus");
    college.getItems().add("VIA, Esbjerg");
    college.getItems().add("VIA, Odense");
    //to make one of the option selected
    college.getSelectionModel().select(0);
    //creating HBox to add college to layout
    VBox city = new VBox();
    city.getChildren().addAll(comboLabel,college);


    //Adding all layouts to the root layout
    VBox root = new VBox();
    root.getChildren().addAll(name,bt1,radioButton,checkBoxes,city);
    //adding layout to a scene
    Scene scene = new Scene(root);
    //setting scene on stage
    stage.setScene(scene);
    stage.show();
  }

  //For handling Events
  public class Listener implements EventHandler<ActionEvent>
  {
    @Override public void handle(ActionEvent event)
    {
      //Demo for reading Input from TextField
      //getting input text from the TextField and storing the memory address in input
      String input = name.getText();

      //creating Alert object to display pop up message
      Alert alert = new Alert(Alert.AlertType.INFORMATION);
      alert.setHeaderText("Logged in");
      //setting the content of stored in 'input' using the setContentText method
      alert.setContentText("You are now logged in into the system, " + input);
      alert.showAndWait(); //this will show the message and wait until the user responds


      //Demo for reading input from the RadioButton
      //we can check which option is selected by using isSelected() method which returns boolean value
      if(sub1.isSelected())
      {
        value = sub1.getText();
      }
      else if(sub2.isSelected())
      {
        value = sub2.getText();
      }
      else if(sub3.isSelected())
      {
        value = sub3.getText();
      }
      else if(sub4.isSelected())
      {
        value = sub4.getText();
      }
      else
      {
        value = "You did not select any radio option";
      }

      //Demo for reading input from CheckBox
      //The basic idea is, making a string and concatenating the checked element
      checkBox = "";
      if(fav1.isSelected())
      {
        checkBox += fav1.getText() + " ";
      }
      if(fav2.isSelected())
      {
        checkBox += fav2.getText() + " ";
      }
      if(fav3.isSelected())
      {
        checkBox += fav3.getText() + " ";
      }
      if(fav4.isSelected())
      {
        checkBox += fav4.getText() + " ";
      }
      if(checkBox.isEmpty()) //this checks if checkbox is empty
      {
        checkBox = "You did not check any option";
      }

      //Demo for reading input from ComboBox
      comboBox = college.getValue();

      Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
      alert1.setHeaderText(null);
      alert1.setContentText("You selected " + value + "\nYou checked: " + checkBox +
          "\n\"You selected " + comboBox + " from ComboBox\"");
      alert1.showAndWait();
    }



  }
}
