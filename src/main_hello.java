import java.util.Scanner;

public class main_hello {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie hier die Zahl an, die Sie multiplizieren möchten");
        String input = scanner.nextLine();
        int a = Integer.parseInt(input);
        for (int i=1; i<11; i++) {
            System.out.println(i + "x" + a + "=" + (i*a));
        }
    }
}
