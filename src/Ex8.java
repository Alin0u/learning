import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib hier den Radius an: ");
        double r = scanner.nextDouble();
        System.out.println("Perimeter: " + (2*Math.PI*r));
        System.out.println("Area: " + (Math.PI*Math.pow(r,2)));
    }
}
