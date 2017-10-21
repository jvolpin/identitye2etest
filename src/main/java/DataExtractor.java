import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by Juan on 21/10/2017.
 */
public class DataExtractor {
    public String getSize(Path file) throws IOException {
        BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);
        return "size: " + attr.size();
    }
    
}
