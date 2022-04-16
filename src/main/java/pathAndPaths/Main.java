package pathAndPaths;

import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {

        WorkWithCreationDeletionFilesViaPath w = new WorkWithCreationDeletionFilesViaPath("src/main/TXp.properties");
        Path dir = w.createDirectory();
       // Path newDir = w.renameDirectory(dir,"NEW.properties");
        Path file = w.createFile("hhh.txt", dir);
        w.deleteFile(file);
        w.deleteFolder(dir);

    }
}