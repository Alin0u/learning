package Call;

import java.util.ArrayList;
import java.util.Scanner;

public class Call {

    public static void Call() {
        int index = 0;
        while(true) {

            index++;
        }
    }

    private static String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void checkInput() {
        if (!getInput().startsWith("00") || !(getInput().charAt(0) == '+')) {
            throw new IllegalArgumentException("Your call doesn't start with 00 or +");
        }
    }

    private static String setCalledNumber() {
        String calledNumber = getInput();
        return calledNumber;
    }

    private static String setCallingNumber() {
        String callingNumber = getInput();
        return callingNumber;
    }

    public static ArrayList<String> saveCallingNumbers() {
        ArrayList<String> callingNumbers = new ArrayList();
        callingNumbers.add(getInput());
        return callingNumbers;
    }

    private static ArrayList<String> saveCalledNumbers() {
        ArrayList<String> calledNumbers = new ArrayList();
        calledNumbers.add(getInput());
        return calledNumbers;
    }

    private static void getCallingNumber(int index) {
        System.out.println();
    }

    private static void getCallingNumber() {
        System.out.println("Write down which call, you want to get the information of: ");
        System.out.println(saveCallingNumbers().get(Integer.parseInt(getInput())-1));
    }

    private String callToString() {
        String callingLog = saveCalledNumbers() + " => " + saveCallingNumbers();
        return callingLog;
    }

    private static void getNumberOfCalls() {
        index
    }
}
