package properties;

import java.io.*;

public class ApplicationProperties implements Properties {

    public ApplicationProperties() {
        createPropertiesFile();
    }

    @Override
    public void createPropertiesFile() {
        try (OutputStream out = new FileOutputStream("application.properties")) {
            java.util.Properties properties = new java.util.Properties();
            properties.setProperty("imageRoundArc", "160");
            properties.setProperty("primaryStageTitle", "Study Time Tracking");
            properties.setProperty("totalHoursLabel", "Total ore:");
            properties.setProperty("primaryStageWidth", "900");
            properties.setProperty("primaryStageHeight", "600");
            properties.store(out, "This is a sample for java properties");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public java.util.Properties getPropertiesFromFile() throws IOException {
        InputStream in = new FileInputStream("application.properties");
        java.util.Properties prop = new java.util.Properties();
        prop.load(in);

        return prop;
    }
}
