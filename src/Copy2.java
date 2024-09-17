import java.io.File;
import java.nio.file.Files;

public class Copy2 {
    public static void main(String[] args) {

        try {
            File originalFile = new File("data.txt");
            File newfile = new File("Backup.txt");

            Files.copy(originalFile.toPath(), newfile.toPath());

            System.out.println("the source file is copied successfully.");

        } catch (Exception e){
            System.out.println("Error. The exception is : " + e.getMessage() );
        }


    }
}
