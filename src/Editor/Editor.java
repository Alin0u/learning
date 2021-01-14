package Editor;

import java.util.Scanner;

public class Editor {

    private static String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void startProgram() {
        while (true) {
            handleCommands();
            System.out.println("Do you want to continue? Write yes, else write no ");
            if (getInput().equals("no")) {
               break;
            }
        }
    }

    public static void handleCommands() {
        System.out.println(Output.printOptions);
        int input = Integer.parseInt(getInput());
        if (input == 1) {
            getLowercase();
        } else if (input == 2){
            getUppercase();
        } else if (input == 3) {

        } else if (input == 4) {
            getPenultimateWord();
        } else {
            System.out.println(Output.printNoValidNumber);
        }
    }

    private static void getPenultimateWord() {
        System.out.println("Enter the String, you want to have a penultimate word of: ");
        String[] array = getInput().split("\\s+");
        try {
            System.out.println(Output.printPenultimateWord + array[array.length - 2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(Output.printArrayOutBound);
        }
    }

    private static void getLowercase() {
        System.out.println(Output.printString);
        System.out.println(getInput().toLowerCase());
    }

    private static void getUppercase() {
        System.out.println(Output.printString);
        System.out.println(getInput().toUpperCase());
    }
}
