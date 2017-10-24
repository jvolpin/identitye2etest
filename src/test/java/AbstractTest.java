import java.io.File;

/**
 * Created by Juan on 24/10/2017.
 */
public class AbstractTest {
    protected String getPathToFiles() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("Data").getFile());
        return file.getAbsolutePath().toString();
    }
}
