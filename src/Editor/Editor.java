package Editor;

import java.util.Scanner;

public class Editor {

    private static String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void runProgram() {
        handleCommands();
        handleContinue();
    }

    private static void handleContinue() {
        System.out.println(Output.printContinue);
        if (getInput().equals("no")) {
            System.exit(0);
        } else if (getInput().equals("yes")) {
            runProgram();
        } else {
            System.out.println(Output.printYesOrNo);
            handleContinue();
        }
    }

    private static void handleCommands() {
        System.out.println(Output.printOptions);
        try {
            int input = Integer.parseInt(getInput());
            if (input == 1) {
                getLowercase();
            } else if (input == 2){
                getUppercase();
            } else if (input == 3) {
                getFirstLetterUppercase();
            } else if (input == 4) {
                getPenultimateWord();
            } else {
                System.out.println(Output.printNoValidNumber);
                handleCommands();
            }
        } catch(NumberFormatException e) {
            System.out.println(Output.printNumberFormat);
            handleCommands();
        }
    }

    private static void getPenultimateWord() {
        System.out.println(Output.printString);
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

    private static void getFirstLetterUppercase() {
        System.out.println(Output.printString);
        String[] array = getInput().split("\\s+");
        for (int i = 0; i < array.length; i++) {
            char[] ch = array[i].toCharArray();
            String word = String.valueOf(ch[0]).toUpperCase() + array[i].substring(1) + " ";
            System.out.print(word);
        }
        System.out.println("");
    }
}
