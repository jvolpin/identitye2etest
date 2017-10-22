import org.junit.Test;

import java.nio.file.Path;

/**
 * Created by Juan on 21/10/2017.
 */
public class UnitTests {
    @Test
    public void directoryScannerTest() {
        String folder = "D:\\Google Drive";
        DirectoryScanner sd = new DirectoryScanner();
        sd.listFilesForFolder(folder).stream().forEach(Path -> System.out.println(Path.getFileName()));
    }
    @Test
    public void getSizeTest(){
        String folder = "D:\\Google Drive";
        DataExtractor de = new DataExtractor();
        DirectoryScanner sd = new DirectoryScanner();
        sd.listFilesForFolder(folder).stream().forEach(Path -> System.out.println(de.getSize(Path)));
    }
    @Test
    public void getMimeTypeTest(){
        String folder = "D:\\Google Drive";
        DataExtractor de = new DataExtractor();
        DirectoryScanner sd = new DirectoryScanner();
        sd.listFilesForFolder(folder).stream().forEach(Path -> System.out.println(de.getMimeType(Path)));
    }
    @Test
    public void getNameTest(){
        String folder = "D:\\Google Drive";
        DataExtractor de = new DataExtractor();
        DirectoryScanner sd = new DirectoryScanner();
        sd.listFilesForFolder(folder).stream().forEach(Path -> System.out.println(de.getName(Path)));
    }
    @Test
    public void getFileExtensionTest(){
        String folder = "D:\\Google Drive";
        DataExtractor de = new DataExtractor();
        DirectoryScanner sd = new DirectoryScanner();
        sd.listFilesForFolder(folder).stream().forEach(Path -> System.out.println(de.getFileExtension(Path)));
    }
}