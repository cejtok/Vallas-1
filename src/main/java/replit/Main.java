package replit;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
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

    Menu menu = new Menu("Archivo");
    MenuItem menuItem = new MenuItem("Cargar desde bytecode");
    MenuItem menuItem2 = new MenuItem("Cerrar");

    menu.getItems().add(menuItem);
    menu.getItems().add(menuItem2);
    MenuBar menuBar = new MenuBar();
    menuBar.getMenus().add(menu);        

    Label label1 = new Label("Ancho");
    Label label2 = new Label("Alto");
    Label label3 = new Label("En Uso");
    Label label4 = new Label("Empresa");

    VBox vbox1 = new VBox(label1,label2,label3,label4);
    vbox1.setSpacing(10);

    TextField tf1 = new TextField("Ancho");
    TextField tf2 = new TextField("Alto");
    //tf2.setMaxWidth(200);
    ComboBox combobox = new ComboBox();
    combobox.getItems().add("Si");
    combobox.getItems().add("No");
    combobox.setValue("Si");
    TextField tf4 = new TextField("Empresa");

    Button buttonAgregar = new Button("Agregar valla");     

    VBox vbox2 = new VBox(tf1,tf2,combobox,tf4,buttonAgregar);
    VBox vbox3 = new VBox();

    HBox hbox = new HBox(vbox1, vbox2, vbox3);

    vbox2.setPrefWidth(140);
 

    buttonAgregar.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        label1.setText(tf1.getText());
      }
    });

    menuItem.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        label1.setText("Carlos");
      }
    });

    menuItem2.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
        label1.setText("Cerrar");
      }
    });


    TextArea textarea = new TextArea();

    vbox = new VBox(menuBar, hbox, textarea);
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
