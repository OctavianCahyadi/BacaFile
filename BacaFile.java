import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;
import java.util.StringTokenizer;


/**
 * BacaFile
 * "BacaFileVsCode\HasilRename"
// "BacaFileVsCode\TestProjectFileName"
 */
public class BacaFile {
    
    public static void main(String[] args) throws IOException{
        // File folder = new File("C:\\Users\\user\\Documents\\BacaFileVsCode\\TestProjectFileName");
        // File[] listOfFiles = folder.listFiles();
        // String path = "C:/Users/user/Documents/BacaFileVsCode/TestProjectFileName";
        // for (File listOfFile : listOfFiles) {
        //     String str = listOfFile.getName();
        //     System.out.println(str);
        //     String[] arrOfStr = str.split("_", 2);
        //     for (int i = 0; i < arrOfStr.length; i++) {
        //         System.out.println(arrOfStr[i]);
        //         if (arrOfStr[i].toLowerCase().startsWith("rm")) {
        //             File f = new File("C:\\Users\\user\\Documents\\BacaFileVsCode\\TestProjectFileName\\" + listOfFile.getName());
        //             f.renameTo(new File("C:\\Users\\user\\Documents\\BacaFileVsCode\\HasilRM\\" + listOfFiles[i].getName()));
        //             System.out.println("masuk RM");
        //         } else if (arrOfStr[i].toLowerCase().startsWith("reg")) {
        //             File f = new File("C:\\Users\\user\\Documents\\BacaFileVsCode\\TestProjectFileName\\" + listOfFiles[i].getName());
        //             f.renameTo(new File("C:\\Users\\user\\Documents\\BacaFileVsCode\\HasilREG\\" + listOfFiles[i].getName()));
        //         }
        //     }
        // }

        File directoryPath = new File("C:\\Users\\user\\Documents\\BacaFileVsCode\\TestProjectFileName\\");
        File[] contents = directoryPath.listFiles();
        for (File file : contents) {
            if (file.getName().contains("REG")) {
                String fromFile = "C:\\Users\\user\\Documents\\BacaFileVsCode\\TestProjectFileName\\" + file.getName();
                String toFile = "C:\\Users\\user\\Documents\\BacaFileVsCode\\HasilREG\\" + file.getName();
                Path source = Paths.get(fromFile);
                Path target = Paths.get(toFile);
                Files.move(source, target);
                System.out.println("file "+file.getName()+" Berhasil di pindahkan ke Folder HasilREG");
            }
            // }
            else if (file.getName().contains("RM") || file.getName().contains("MR")) {
                String fromFile = "C:\\Users\\user\\Documents\\BacaFileVsCode\\TestProjectFileName\\" + file.getName();
                String toFile = "C:\\Users\\user\\Documents\\BacaFileVsCode\\HasilRM\\" + file.getName();
                Path source = Paths.get(fromFile);
                Path target = Paths.get(toFile);
                Files.move(source, target);
                System.out.println("file "+file.getName()+" Berhasil di pindahkan ke Folder HasilRM");
            }
            else if (!file.getName().contains("RM") && !file.getName().contains("REG")) {
                //System.out.println(file.getName());
            }
        }
    }
}