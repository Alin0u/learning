import java.util.NoSuchElementException;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter one or more characters to get the ASCII-Number: ");
            String string = scanner.nextLine();

            for (int i = 0; i < string.length(); i++) {
                char ch = string.charAt(i);
                int ascii = ch;
                System.out.println("The ASCII-Number of " + ch + " is " + ascii);
            }
            scanner.close();
        } catch (NoSuchElementException e) {
            System.out.println("Input must not be null");
            throw e;
        }
    }
}
