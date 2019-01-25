package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import properties.ApplicationProperties;
import properties.Properties;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Properties applicationProperties = new ApplicationProperties();
        Prop

        java.util.Properties properties = applicationProperties.getPropertiesFromFile();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        loader.setController(new Controller());

        Pane pane = loader.load();

        primaryStage.setTitle(properties.getProperty("primaryStageTitle"));
        primaryStage.setScene(new Scene(pane));
        primaryStage.setHeight(Double.valueOf(properties.getProperty("primaryStageHeight")));
        primaryStage.setWidth(Double.valueOf(properties.getProperty("primaryStageWidth")));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
