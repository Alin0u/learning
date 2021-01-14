import java.util.Scanner;

public class Test3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        int two = scanner.nextInt();

        if (one == two){
            System.out.println(one + " = " + two);
        } else {
            System.out.println(one + " != " + two);
            if (one < two){
                System.out.println(one + " < " + two);
                System.out.println(one + " <= " + two);
            } else {
                System.out.println(one + " > " + two);
                System.out.println(one + " >= " + two);
            }
        }
    }
}
