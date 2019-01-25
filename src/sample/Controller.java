package sample;

import javafx.fxml.FXML;
import javafx.scene.SnapshotParameters;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import properties.ApplicationProperties;
import properties.Properties;

import java.io.FileInputStream;
import java.io.IOException;


public class Controller {

        @FXML
        private ImageView profileImage;
        @FXML
        private Label labelTotalOre;

        private Properties applicationProperties = new ApplicationProperties();

        @FXML
        public void initialize() throws IOException {
            java.util.Properties properties = applicationProperties.getPropertiesFromFile();
            Rectangle clip = new Rectangle(profileImage.getFitWidth(), profileImage.getFitHeight());

            Integer arcDim = Integer.valueOf(properties.getProperty("imageRoundArc"));
            clip.setArcWidth(arcDim);
            clip.setArcHeight(arcDim);
            profileImage.setClip(clip);

            SnapshotParameters parameters = new SnapshotParameters();
            parameters.setFill(Color.TRANSPARENT);
            WritableImage image = profileImage.snapshot(parameters, null);

            profileImage.setClip(null);
            profileImage.setEffect(new DropShadow(20, Color.BLACK));

            profileImage.setImage(image);

            labelTotalOre.setText(properties.getProperty("totalHoursLabel"));
        }

}
