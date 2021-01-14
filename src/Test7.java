import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args){
        //Scanner scanner = new Scanner(System.in);
        //String file = scanner.nextLine();
        String file = "/home/alina/Schreibtisch/01_Musterpruefung.pdf";
        printFileSize(file);

    }

    public static void printFileSize(String file){
        Path path = Paths.get(file);

        try {
            long bytes = Files.size(path);
            System.out.println(String.format("%,d bytes", bytes));
            System.out.println(String.format("%,d kilobytes", bytes / 1024));
            System.out.println(String.format("%,d megabytes", bytes / 1048576));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
