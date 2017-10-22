import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

/**
 * Created by Juan on 22/10/2017.
 */
public class DataFilter {
    public Path filterSheets(List<Path> files) {
        DataExtractor de = new DataExtractor();
        Path target = files.stream().filter(Path ->
                "xls".equals(de.getFileExtension(Path)) ||
                "csv".equals(de.getFileExtension(Path)) ||
                "xlsx".equals(de.getFileExtension(Path)))
                .findFirst().orElse(null);
        return target;
    }
}
