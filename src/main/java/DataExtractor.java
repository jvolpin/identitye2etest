import org.apache.commons.io.FilenameUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by Juan on 21/10/2017.
 */
public class DataExtractor {
    public String getSize(Path file) {
        Long size = 0l;
        try {
            size = Files.readAttributes(file, BasicFileAttributes.class).size();
        }
        catch(IOException ex) {
            System.out.println (ex.toString());
            System.out.println(file + " doesn't seem to be a file");
        }
        return "size: " + size;
    }
    public String getMimeType(Path file) {
        String mimeType = null;
        try {
            mimeType = Files.probeContentType(file);
        }
        catch(IOException ex) {
            System.out.println (ex.toString());
            System.out.println(file + " doesn't seem to be a file");
        }
        return "MIME type: " + mimeType;
    }

    public String getName(Path file) {
        return "file name: " + file.getFileName();
    }

    public String getFileExtension(Path file) {
        return "file extension: " + FilenameUtils.getExtension(getName(file));
    }
}
