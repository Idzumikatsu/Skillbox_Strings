package practice.regex;

import java.util.Scanner;

public class PhoneCleanerRegex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String symbolsRegex = "[ +)(-]+";
        String numberRegex = "7[0-9]{10}";
        String incorrectFirstNum = "[^8][0-9]{10}";
        String warning = "Неверный формат номера";

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                scanner.close();
                break;
            }

            input = input.replaceAll(symbolsRegex, "");

            if (!input.matches(numberRegex)) {

                if (input.length() < 10 || input.length() > 11 || input.matches(incorrectFirstNum)) {
                    System.out.println(warning);
                    break;
                }

                if (input.length() == 10) {
                    input = "7".concat(input);
                }

                if (input.charAt(0) == '8') {
                    input = input.replace(input.charAt(0),'7');
                }
            }
            System.out.println(input);

        }
    }

}
