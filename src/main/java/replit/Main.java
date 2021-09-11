package replit;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.MenuBar;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class Main extends Application 
{ 
  
  @Override
  public void start(Stage primaryStage) {
    
    Label label; 
    TextField tf;
    Button button;
    VBox vbox;
    Scene scene;

    Menu menu = new Menu("Menu 1");;
    MenuItem menuItem = new MenuItem("Cargar desde bytecode");

    menu.getItems().add(menuItem);
    MenuBar menuBar = new MenuBar();
    menuBar.getMenus().add(menu);

    
    tf = new TextField("Text Field!");
    tf.setMaxWidth(200);

    label = new Label("Type text and click the button");
    button = new Button("Click");

    Button buttonAgregar = new Button("Agregar valla");

    Label label1 = new Label("Ancho");
    Label label2 = new Label("Alto");
    Label label3 = new Label("En Uso");
    Label label4 = new Label("Empresa");

    TextField tf1 = new TextField("Ancho");
    TextField tf2 = new TextField("Alto");
    TextField tf3 = new TextField("En uso");
    TextField tf4 = new TextField("Empresa");


    HBox hbox1 = new HBox(label1, tf1);
    HBox hbox2 = new HBox(label2, tf2);
    HBox hbox3 = new HBox(label3, tf3);
    HBox hbox4 = new HBox(label4, tf4);

    
    hbox1.setAlignment(Pos.CENTER_RIGHT);
    hbox2.setAlignment(Pos.CENTER_RIGHT);
    hbox3.setAlignment(Pos.CENTER_RIGHT);
    hbox4.setAlignment(Pos.CENTER_RIGHT);

     VBox vbox1 = new VBox(label1,label2,label3,label4);
     vbox1.setSpacing(10);

    VBox vbox2 = new VBox(tf1,tf2,tf3,tf4,buttonAgregar);
    VBox vbox3 = new VBox();

    HBox hbox6 = new HBox(vbox1,vbox2,vbox3);

    vbox2.setPrefWidth(140);


 

    button.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        label.setText(tf.getText());
      }
    });

    vbox = new VBox(menuBar, hbox6, button);//label, tf,
    vbox.setSpacing(0);
    //vbox.setAlignment(Pos.CENTER);
    scene = new Scene(vbox, 300, 200);
    
    primaryStage.setTitle("A Simple Scene!");
    primaryStage.setScene(scene);
    primaryStage.show();
  } 
    
  public static void main(String[] args) {
    launch(args);
  }
} 
