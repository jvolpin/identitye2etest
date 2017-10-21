import org.apache.commons.io.FilenameUtils;

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
    public String getMimeType(Path file) throws IOException {
        return "MIME type: " + Files.probeContentType(file);
    }

    public String getName(Path file) throws IOException {
        return "file name: " + file.getFileName();
    }

    public String getFileExtension(Path file) throws IOException {
        return "file extension: " + FilenameUtils.getExtension(getName(file));
    }
}
