import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class oopsLab6 {

    public static void main(String[] args) {

        String filePath = "oopsLab6.txt";

        // Reading from file
        try (FileInputStream fis = new FileInputStream(filePath)) {
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Writing to file
        String dataToWrite = "This is a sample text file.";
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            fos.write(dataToWrite.getBytes());
            System.out.println("\nData written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
