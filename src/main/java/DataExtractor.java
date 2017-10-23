import org.apache.commons.io.FilenameUtils;
import org.apache.tika.config.TikaConfig;
import org.apache.tika.detect.Detector;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.ContentHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by Juan on 21/10/2017.
 */
public class DataExtractor {
    public int getSize(Path file) {
        int size = 0;
        try {
            size = ((int) Files.readAttributes(file, BasicFileAttributes.class).size());
        } catch (IOException ex) {
            System.out.println(ex.toString());
            System.out.println(file + " doesn't seem to be a file");
        }
        return size;
    }

    public String getMimeType(Path file) {
        String mimeType = null;
        try {
            TikaConfig config = TikaConfig.getDefaultConfig();
            Detector detector = config.getDetector();
            TikaInputStream stream = TikaInputStream.get(file.toFile());

            Metadata metadata = new Metadata();
            metadata.add(Metadata.RESOURCE_NAME_KEY, getName(file));
            MediaType mediaType = detector.detect(stream, metadata);
            mimeType = mediaType.toString();
        } catch (IOException ex) {
            System.out.println(ex.toString());
            System.out.println(file + " doesn't seem to be a file");
        }
        return mimeType;
    }

    public String getName(Path file) {
        return file.getFileName().toString();
    }

    public String getFileExtension(Path file) {
        return FilenameUtils.getExtension(getName(file));
    }
}
