package PracticeControls;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Controls extends Application
{
  public void start(Stage stage)
  {
    //Demo of LABEL
    Label userName = new Label("Username");
    Label password = new Label("Password");
    //we need to add this control to a layout
    HBox userPass = new HBox(); // for username and password
    //creating some spaces between the controls
    userPass.setSpacing(120);
    //we need to add this label to this layout
    userPass.getChildren().addAll(userName,password);

    //Demo of TEXTFIELD
    TextField nameField = new TextField("username");
    TextField passField = new TextField("password");
    nameField.setMaxWidth(200);
    passField.setMaxWidth(200);
    //we need to add this control to a layout
    HBox textField = new HBox(); // for the textFields to enter username and password
    //creating some spaces between the controls
    textField.setSpacing(20);
    //we need to add this textFields to this layout
    textField.getChildren().addAll(nameField,passField);


    //Demo of BUTTON
    Button login = new Button("Login"); //to login
    //we need to add these elements to this layout
    login.setPrefSize(50,70); //setting preferred size of the button
    Button cancel = new Button("Cancel"); //to cancel
    cancel.setPrefSize(60,70);//setting preferred size of the button
    //we need to add this control to a layout
    HBox buttons = new HBox(10);
    //setting size of the buttons
    buttons.setPrefSize(30,15);
    //setting padding to move left
    buttons.setPadding(new Insets(10,0,0,0));
    //we need to add this label to this layout
    buttons.getChildren().addAll(login,cancel);


    //Demo of RADIO BUTTON

    //First add a label for radio buttons
    Label radioLabel = new Label("Choose your topic");
    //We need to create an object of ToggleGroup then we will add the controls to VBox layout
    ToggleGroup group = new ToggleGroup();
    //create RadioButton for each element you want as a radio button
    RadioButton sub1 = new RadioButton("SDJ");
    RadioButton sub2 = new RadioButton("DMA");
    RadioButton sub3 = new RadioButton("RWD");
    RadioButton sub4 = new RadioButton("SEP");
    //now add these radio buttons to the group by using setToggleGroup method
    sub1.setToggleGroup(group);
    sub2.setToggleGroup(group);
    sub3.setToggleGroup(group);
    sub4.setToggleGroup(group);
    //Creating VBox layout to put it together with the Checkbox below
    VBox radioButton = new VBox();
    //adding CheckBox to the VBox layout
    radioButton.getChildren().addAll(radioLabel,sub1,sub2,sub3,sub4);


    //Demo of CHECKBOX

    //First create a Label for the CheckBox
    Label checkBoxLabel = new Label("Favourite Language/s");
    //creating options of check boxes
    CheckBox fav1 = new CheckBox("Java");
    CheckBox fav2 = new CheckBox("C#");
    CheckBox fav3 = new CheckBox("JavaScript");
    CheckBox fav4 = new CheckBox("Python");
    //Creating HBox layout to put it together with the radio button
    VBox checkboxes = new VBox();
    //adding CheckBox to the VBox layout
    checkboxes.getChildren().addAll(checkBoxLabel,fav1,fav2,fav3,fav4);

    //now create a HBox layout to add the radio button and checkbox together in HBox so, they stand in a same horizontal layout
    HBox radioCheck = new HBox(90);//5 provides 5px of horizontal space
    radioCheck.getChildren().addAll(radioButton,checkboxes);//adding to the layout
    //adding top padding to the HBox
    radioCheck.setPadding(new Insets(20,0,0,0));


    //Demo of COMBO BOX

    //Adding label for the ComboBox
    Label comboLabel = new Label("Select city");
    //create object of type ComboBox
    ComboBox<String> college = new ComboBox<>();
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
    //setting padding to move down
    city.setPadding(new Insets(15,0,0,0));


    //Demo of DATE PICKER (how to use a date picker)

    //create a Label for Date Picker
    Label labelDate = new Label("Select your registration date");
    //create a object of type DatePicker
    DatePicker  date = new DatePicker();
    //create a VBox layout to put the DatePicker to the layout
    VBox datePicker = new VBox();
    datePicker.getChildren().addAll(labelDate,date);
    //setting padding to move down
    datePicker.setPadding(new Insets(15,10,0,0));

    //Now putting ComboBox and DatePicker in Horizontal layout using HBox
    HBox comboDate = new HBox(80);
    comboDate.getChildren().addAll(city,datePicker);

    //Adding Submit button at the end of the stage using BorderPane aligning to the center
    Button submit = new Button("Submit");
    BorderPane submitButton = new BorderPane();
    submitButton.setRight(submit);
    submitButton.setPadding(new Insets(20,10,0,0));


    //Demo of HYPERLINK

    //Label for the HyperLink
    Label linkLabel = new Label("Check this out");
    //creating HyperLink object
    Hyperlink hyperlink = new Hyperlink("https://www.youtube.com/watch?v=uU_Ajtz0Qpc");
    //Adding to VBox layout
    VBox link = new VBox(-5);
    link.getChildren().addAll(linkLabel,hyperlink);
    //setting padding to move down
    link.setPadding(new Insets(10,0,0,0));


    //Demo of MENU_BAR and MENU

    //To add menus to the menu bar we first need to create a Menu bar
    MenuBar mainMenu = new MenuBar();
    //Create menus
    Menu file = new Menu("File");
    Menu edit = new Menu("Edit");
    Menu view = new Menu ("View");
    Menu help = new Menu("Help");

    //now adding MenuItems to the File Menu
    Menu New = new Menu("New            Ctrl+N");
    //adding SubMenu to the New Menu. Adding sub menu to New menu actually makes New a Menu to its sub menu
    //therefore we will create Menu Items for New Menu
    MenuItem textFile = new MenuItem("Text File");
    MenuItem project = new MenuItem("Project");
    MenuItem packages = new MenuItem("Package");
    MenuItem javaFx = new MenuItem("JavaFx Project");
    //now add these MenuItems to the New Menu under File Menu
    New.getItems().addAll(textFile,project,packages,javaFx);
    //adding rest of MenuItem to the File Menu
    MenuItem openFile = new MenuItem("Open File    Ctrl+O");
    MenuItem save = new MenuItem("Save            Ctrl+S");
    MenuItem saveAs = new MenuItem("Save As");
    MenuItem exit = new MenuItem("Exit             Ctrl+E");

    //now add these File items to the File Menu
    file.getItems().addAll(New,openFile,save,saveAs,exit);

    //now adding MenuItems to the Edit Menu
    MenuItem undoTyping = new MenuItem("Undo Typing");
    MenuItem redo = new MenuItem("Redo");
    MenuItem cut = new MenuItem("Cut");
    MenuItem copy = new MenuItem("Copy");
    MenuItem paste = new MenuItem("Paste");
    //now add these Edit items to Edit Menu
    edit.getItems().addAll(undoTyping,redo,cut,copy,paste);

    //now adding MenuItems to the View Menu
    MenuItem courses = new MenuItem("Courses");
    MenuItem curriculum = new MenuItem("Curriculum");
    MenuItem recentChanges = new MenuItem("Recent Changes");
    //now add these View items to View Menu
    view.getItems().addAll(courses,curriculum,recentChanges);

    //now adding MenuItems to the Help Menu
    MenuItem contact = new MenuItem("Contact");
    MenuItem gettingStarted = new MenuItem("Getting Started");
    MenuItem register = new MenuItem("Register");
    //now add these Help items to Help Menu
    help.getItems().addAll(contact,gettingStarted,register);

    //now we add these menus to the MenuBar
    mainMenu.getMenus().addAll(file,edit,view,help);
    //now we create a BorderPane layout to add MenuBar to the layout
    BorderPane menu = new BorderPane();
    menu.setTop(mainMenu);

    //Putting all together in a root
    VBox root = new VBox();  // this is the root layout
    //creating spacing between layouts
    root.setSpacing(10);
    //setting padding to move left
    root.setPadding(new Insets(10,10,10,10));
    //adding all layouts to the root layout
    root.getChildren().addAll(mainMenu,userPass,textField,buttons,radioCheck,comboDate,submitButton,link);

    //we need to add root layout  to the scene
    Scene scene = new Scene(root);
    //we must set this scene to the stage
    stage.setScene(scene);
    //adding title to the stage
    stage.setTitle("Code With Pramesh");
    //we must show this to the user
    stage.show();
  }

}
