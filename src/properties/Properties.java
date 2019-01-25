package properties;

import java.io.IOException;

public interface Properties {

     void createPropertiesFile();

     java.util.Properties getPropertiesFromFile() throws IOException;
}
