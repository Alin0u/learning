import java.util.Scanner;

public class Test2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        System.out.println("The Average of your Numbers is: " + ((one+two+three)/3));
    }
}
