import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test5 {
    private static final String REGEX_PATTERN_DIGITS = "[a-zA-ZäöüÄÖÜ]";
    private static final String REGEX_PATTERN_NUMBERS = "[0-9]";
    private static final String REGEX_PATTERN_SPACES = "(\\s)";

    public static void main(String[] args){
        int countDigit = 0;
        int countNumber = 0;
        int countOther = 0;
        int countSpace = 0;

        //Scanner scanner = new Scanner(System.in);
        //String input = scanner.nextLine();

        String input = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";

        Pattern pattern = Pattern.compile(REGEX_PATTERN_DIGITS);
        Matcher matcher = pattern.matcher(input);
        Pattern numbers = Pattern.compile(REGEX_PATTERN_NUMBERS);
        Matcher matchNumber = numbers.matcher(input);
        Pattern spaces = Pattern.compile(REGEX_PATTERN_SPACES);
        Matcher matchSpace = spaces.matcher(input);

        for (int i = 0; i < input.length(); i++){
            if (matcher.find()) {
                countDigit++;
            }
            if (matchNumber.find()) {
                countNumber++;
            }

            if (matchSpace.find()) {
                countSpace++;
            }
        }
        countOther = input.length() - (countDigit + countNumber + countSpace);

        System.out.println("letter: " + countDigit);
        System.out.println("space: " + countSpace);
        System.out.println("number: " + countNumber);
        System.out.println("other: " + countOther);
    }
}
