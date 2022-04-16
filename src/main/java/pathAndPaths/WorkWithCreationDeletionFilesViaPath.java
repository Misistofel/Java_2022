package pathAndPaths;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.Files.delete;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class WorkWithCreationDeletionFilesViaPath {

    //Path filePath = Paths.get("src/main/First.properties");
    String directoryLocation;
    String newdirectoryLocation;
    //Path testDirectory;
    // Path file1;


    public WorkWithCreationDeletionFilesViaPath(String directoryLocation) {
        this.directoryLocation = directoryLocation;
    }

    public WorkWithCreationDeletionFilesViaPath(String directoryLocation, String newdirectoryLocation) {
        this.directoryLocation = directoryLocation;
        this.newdirectoryLocation = newdirectoryLocation;
    }

    //Створюю директорію
    public Path createDirectory() {
        Path testDirectory = null;
        try {
            testDirectory = Files.createDirectory(Paths.get(directoryLocation));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Чи створена директорія?");
        boolean result = Files.exists(Paths.get(directoryLocation));
        System.out.println(result);
        System.out.println("Створено директорію: " + testDirectory);
        return testDirectory;
    }

    //Створюю файл
    public Path createFile(String fileName,Path dir) {
        Path file1 = null;
        try {
            file1 = Files.createFile(Paths.get(dir + "/" + fileName));
        } catch (IOException e) {
            System.out.println("File is already exist!");
            e.printStackTrace();
        }
        boolean result = Files.exists(Paths.get(directoryLocation));
        System.out.println("Был ли файл успешно создан?" + result);
        return file1;
    }

    public Path renameDirectory(Path path, String newName){
        Path renamedDir = null;
        try{
            // rename a file in the same directory
            renamedDir =  Files.move(path, path.resolveSibling(newName));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("А немає директорії яку можна перейменувати!");
        }
        System.out.println("Чи створена директорія?");
        if (Files.exists(Paths.get(directoryLocation))==true){
            System.out.println("Файл було успішно перейменовано");
        };
        System.out.println("На що перейменовано стару директорію? " + renamedDir);
        return  renamedDir;

    }

    public Path copyDirectory(Path path, Path newCopiedDirectory) {
        try{
            // rename a file in the same directory
            Files.copy(path, newCopiedDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Path result =path;
        return result;

    }

    public boolean deleteFile(Path filePath) {
        System.out.println("Видалення файлу!");
        try {
            delete(filePath);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("А файла і так не існує!");
        }
        boolean result = Files.exists(filePath);
        System.out.println("Файл існує? " + result);
        return result;
    }


    public boolean deleteFolder(Path pathOfDitectory)  {
        System.out.println("Видалення директорії!");
        try {
            delete(pathOfDitectory);
        } catch (IOException e) {
            System.out.println("Так а немає такої директорії - немає що видаляти!");
            e.printStackTrace();
        }
        boolean result = Files.exists(pathOfDitectory);
        System.out.println("Директорія існує? " + result);
        return result;

    }

}


