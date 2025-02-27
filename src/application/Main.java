package application;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {  
  
  public void start(Stage primaryStage) {
    try {
      FXMLLoader loader = new FXMLLoader();
      URL xmlUrl = getClass().getResource("Register.fxml");
      loader.setLocation(xmlUrl);
      Parent root = loader.load();
      Scene scene = new Scene(root,400,500);
      scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
      primaryStage.setScene(scene);
      primaryStage.show();
    } catch(Exception e) {
      e.printStackTrace();
    }
  }   
  
  
//  @Override
//  public void start(Stage primaryStage) throws Exception{
//    Parent root = FXMLLoader.load(getClass().getResource("admin_dashboard.fxml"));
//    primaryStage.setTitle("Admin Dashboard");
//    primaryStage.setScene(new Scene(root,1315,890));
//    primaryStage.show();
//  }
  
  public static void main(String[] args) {
    launch(args);
  }
}