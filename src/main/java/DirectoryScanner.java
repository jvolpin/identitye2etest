import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Juan on 21/10/2017.
 */
public class DirectoryScanner {

    public List<Path> listFilesForFolder(final String folder) {
        List<Path> pathList = new ArrayList<>();
        try (Stream<Path> paths = Files.walk(Paths.get(folder))) {
            paths
                    .filter(Files::isRegularFile)
                    .collect(Collectors.toCollection(()->pathList));
        }
        catch(IOException ex) {
            System.out.println (ex.toString());
            System.out.println(folder + " doesn't seem to be a folder");
        }
        return pathList;
    }
}
