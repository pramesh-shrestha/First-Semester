package Calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Calculator extends Application
{
  //declaring Scene for the Stage
  private Scene scene;
  //declaring GridPane for buttons
  private GridPane buttonPane;
  //For listening to an event
  private Listener listener;
  //declaring different buttons that are to be inserted in the GridPane
  private Button button1;
  private Button button2;
  private Button button3;
  private Button button4;
  private Button button5;
  private Button button6;
  private Button button7;
  private Button button8;
  private Button button9;
  private Button button0;
  private Button buttonDot;
  private Button buttonEquals;
  private Button buttonDivide;
  private Button buttonMultiply;
  private Button buttonAdd;
  private Button buttonSubtract;
  //to store values
  private double value1;
  private double value2;
  private char operator;
  private double result;

  //declaring BorderPane of calculator
  private BorderPane mainPane;
  //declaring TextField for the showing results of calculation
  private TextField textField;



  //start method that will be called by launch() method in the main method
  public void start(Stage stage)
  {
    //initializing Listener
    listener = new Listener();
    //setting up title of the application
    stage.setTitle("Calculator");
    //initializing textField
    textField = new TextField();
    //initializing BorderPane
    mainPane = new BorderPane();
    //setting the textField on the top of the borderPane
    mainPane.setTop(textField);

    //initializing GridPane
    buttonPane = new GridPane();
    //adding vertical and horizontal gaps between buttons
    buttonPane.setVgap(3);
    buttonPane.setHgap(3);

    //initializing buttons of first row that takes String as a parameter
    button7 = new Button("7");
    button7.setOnAction(listener);
    button8 = new Button("8");
    button8.setOnAction(listener);
    button9 = new Button("9");
    button9.setOnAction(listener);
    buttonDivide = new Button("/");
    buttonDivide.setOnAction(listener);
    //Adding buttons to Grid at 0 row
    buttonPane.addRow(1,button7,button8,button9,buttonDivide);

    //initializing buttons of second row that takes String as a parameter
    button4 = new Button("4");
    button4.setOnAction(listener);
    button5 = new Button("5");
    button5.setOnAction(listener);
    button6 = new Button("6");
    button6.setOnAction(listener);
    buttonMultiply = new Button("*");
    buttonMultiply.setOnAction(listener);
    //Adding buttons to Grid at 1 row
    buttonPane.addRow(2,button4,button5,button6,buttonMultiply);

    //initializing buttons of third row that takes String as a parameter
    button1 = new Button("1");
    button1.setOnAction(listener);
    button2 = new Button("2");
    button2.setOnAction(listener);
    button3 = new Button("3");
    button3.setOnAction(listener);
    buttonSubtract = new Button("-");
    buttonSubtract.setOnAction(listener);
    //Adding buttons to Grid at 2 row
    buttonPane.addRow(3,button1,button2,button3,buttonSubtract);


    //initializing buttons of fourth row that takes String as a parameter
    button0 = new Button("0");
    button0.setOnAction(listener);
    buttonDot = new Button(".");
    buttonDot.setOnAction(listener);
    buttonEquals = new Button("=");
    buttonEquals.setOnAction(listener);
    buttonAdd = new Button("+");
    buttonAdd.setOnAction(listener);
    //Adding buttons to Grid at 3 row
    buttonPane.addRow(4,button0, buttonDot, buttonEquals, buttonAdd);

    //initializing Font to change the font size
    Font font = new Font(20);
    for(int i = 0; i < buttonPane.getChildren().size(); i++)
    {
      //setting the preferred size of all buttons
      ((Button)buttonPane.getChildren().get(i)).setPrefSize(100,100);
      //setting the font size for all buttons
      ((Button)buttonPane.getChildren().get(i)).setFont(font);
    }

    //setting the buttonPane under the textField using setBottom method of BorderPane
    mainPane.setBottom(buttonPane);
    //initializing scene and adding mainPane to the constructor of Scene class
    scene = new Scene(mainPane);
    //adding scene to the constructor of Stage using setScene method of Stage
    stage.setScene(scene);
    //finally, showing the scene graph or layouts on the stage
    stage.show();
  }

  private class Listener implements EventHandler<ActionEvent>
  {
    public void handle(ActionEvent e)
    {
      if(e.getSource() == button0)
      {
        textField.appendText("0");
      }
      else if(e.getSource() == button1)
      {
        textField.appendText("1");
      }
      else if(e.getSource() == button2)
      {
        textField.appendText("2");
      }
      else if(e.getSource() == button3)
      {
        textField.appendText("3");
      }
      else if(e.getSource() == button4)
      {
        textField.appendText("4");
      }
      else if(e.getSource() == button5)
      {
        textField.appendText("5");
      }
      else if(e.getSource() == button6)
      {
        textField.appendText("6");
      }
      else if(e.getSource() == button7)
      {
        textField.appendText("7");
      }
      else if(e.getSource() == button8)
      {
        textField.appendText("8");
      }
      else if(e.getSource() == button9)
      {
        textField.appendText("9");
      }
      else if(e.getSource() == buttonDot)
      {
        textField.appendText(".");
      }
      else if(e.getSource() == buttonDivide)
      {
        value1 = Double.parseDouble(textField.getText());
        operator = '/';
        textField.setText("");
      }
      else if(e.getSource() == buttonAdd)
      {
        value1 = Double.parseDouble(textField.getText());
        operator = '+';
        textField.setText("");

      }
      else if(e.getSource() == buttonSubtract)
      {
        value1 = Double.parseDouble(textField.getText());
        operator = '-';
        textField.setText("");

      }
      else if(e.getSource() == buttonMultiply)
      {
        value1 = Double.parseDouble(textField.getText());
        operator = '*';
        textField.setText("");
      }
      else if(e.getSource() == buttonEquals)
      {
        value2 = Double.parseDouble(textField.getText());

        if(operator == '+')
        {
          result = value1 + value2;
          textField.setText(result + "");
        }
        else  if(operator == '-')
        {
          result = value1 - value2;
          textField.setText(result + "");
        }
        else  if(operator == '*')
        {
          result = value1 * value2;
          textField.setText(result + "");
        }
        else  if(operator == '/')
        {
          result = value1 / value2;
          textField.setText(result + "");
        }
      }
    }
  }
}
