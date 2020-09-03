import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;


/**
 * BacaFile
 * "BacaFileVsCode\HasilRename"
// "BacaFileVsCode\TestProjectFileName"
 */
public class BacaFile {
    
    public static void main(String[] args) throws IOException{
        File folder = new File("C:\\Users\\user\\Documents\\BacaFileVsCode\\TestProjectFileName");
        File[] listOfFiles = folder.listFiles();
        String path = "D:/HasilRename/";
        for (int a = 0; a < listOfFiles.length; a++) {
            if (listOfFiles[a].isFile()) {
                System.out.println(listOfFiles[a].getName());
            } else if (listOfFiles[a].isDirectory()) {
                System.out.println(listOfFiles[a].getName());
            }
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Apakah anda akan merename semua File [1/0]:");
        int inputan = input.nextInt();
        System.out.print("Kode tambahan rename:");
        String inputString = input.next();
        input.close();
        if (inputan == 1){
            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile()) {
                    Files.copy(listOfFiles[i].toPath(),
                        (new File(path + listOfFiles[i].getName())).toPath(),
                        StandardCopyOption.REPLACE_EXISTING);

                    File f = new File("C:\\Users\\user\\Documents\\BacaFileVsCode\\HasilRename" + listOfFiles[i].getName());
                    f.renameTo(new File("C:\\Users\\user\\Documents\\BacaFileVsCode\\HasilRename\\" + inputString+ "_" + listOfFiles[i].getName()));
                }
            }
            System.out.println("Rename File Berhasil !!! ");
        }else{
            System.out.println("Rename tidak jadi dilakukan");
        }
    }
}