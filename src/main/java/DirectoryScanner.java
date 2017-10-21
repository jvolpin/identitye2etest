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

    public List<Path> listFilesForFolder(final String folder) throws IOException {
        List<Path> pathList = new ArrayList<>();
        try (Stream<Path> paths = Files.walk(Paths.get(folder))) {
            paths
                    .filter(Files::isRegularFile)
                    .collect(Collectors.toCollection(()->pathList));
        }
        return pathList;
    }
}
