import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class oopsLab6_withAppend{
    public static void main(String[] args) {
        String filePath = "oopsLab6.txt";

        try (FileInputStream fis = new FileInputStream(filePath)) {
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String dataToWrite = "This is a sample text.";
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            fos.write(dataToWrite.getBytes());
            System.out.println("\nData written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        String additionalData = "\nThis is additional text.";
        try (FileOutputStream fos = new FileOutputStream(filePath, true)) {
            fos.write(additionalData.getBytes());
            System.out.println("Additional data appended to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}