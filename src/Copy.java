import java.io.*;
import java.util.Scanner;

public class Copy {
    public static void main(String[] args) throws IOException {


        try (Scanner scanner = new Scanner(new File("input.txt"));
             PrintWriter writer = new PrintWriter(new FileWriter("output.txt"))
        ) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                writer.println(line);
            }
            System.out.println("File copied successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Source file not found.");
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
