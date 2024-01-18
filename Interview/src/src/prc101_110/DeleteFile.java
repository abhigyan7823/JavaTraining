package src.prc101_110;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile {
    public static void main(String[] args) {
        String fileName = "JavaFile.java";
        try {
            Path filePath = Paths.get(fileName);
            Files.delete(filePath);
            System.out.println("File deleted successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
