package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class 
Driver 
extends Application {
@Override
public void start(Stage primaryStage) {
try {
Parent Root = FXMLLoader.load(getClass().getResource("/application/View.fxml"));
Scene scene = new Scene(Root);
primaryStage.setTitle("GPA Calculator");
primaryStage.setScene(scene);
primaryStage.show();
}
catch( Exception e ) {
e.printStackTrace();
}
}

public static void main(String[] args) {
launch(args);
}
}