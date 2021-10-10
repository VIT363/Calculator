package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int value1, value2;

        char operation = 0;

        int result;



        String userInput = sc.nextLine();

        char[] char1 = new char[10];

        for (int i = 0; i < userInput.length(); i++) {

            char1[i] = userInput.charAt(i);

            if (char1[i] == '+') {

                operation = '+';

            }

            if (char1[i] == '-') {

                operation = '-';

            }

            if (char1[i] == '*') {

                operation = '*';

            }

            if (char1[i] == '/') {

                operation = '/';

            }

        }

        String char1String = String.valueOf(char1);

        String[] table = char1String.split("[+-/*]");

        String tables00 = table[0];

        String tables01 = table[1];

        String string03 = tables01.trim();

        value1 = romanToNum(tables00);

        value2 = romanToNum(string03);

        if (value1 < 0 && value2 < 0) {

            result = 0;

        } else {

            result = calculated(value1, value2, operation);

            String resultRom = convertNumToRom(result);

            System.out.println(resultRom);

        }

        value1 = Integer.parseInt(tables00);

        value2 = Integer.parseInt(string03);

        result = calculated(value1, value2, operation);

        System.out.println(result);

    }

    private static String convertNumToRom (int numArab) {

        String[] rom = {"O", "I", "II", "III", "IV", "V", "VI", "VII",
                "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII",
                "XVIII", "XIX",
                "XX",

                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII",
                "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV",
                "XXXVI",
                "XXXVII", "XXXVIII", "XXXIX", "XL",

                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII",
                "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII",
                "LVIII",
                "LIX", "LX",

                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII",
                "LXVIII", "LXIX", "LXX",

                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI",
                "LXXVII", "LXXVIII", "LXXIX", "LXXX",

                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV",
                "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",

                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII",
                "XCVIII", "XCIX", "C"

        };

        final String s = rom[numArab];

        return s;

    }

    private static int romanToNum (String rom) {

        if (rom.equals("I")) {

            return 1;

        } else if (rom.equals("II")) {

            return 2;

        } else if (rom.equals("III")) {

            return 3;

        } else if (rom.equals("IV")) {

            return 4;

        } else if (rom.equals("V")) {

            return 5;

        } else if (rom.equals("VI")) {

            return 6;

        } else if (rom.equals("VII")) {

            return 7;

        } else if (rom.equals("VIII")) {

            return 8;

        } else if (rom.equals("IX")) {

            return 9;

        } else if (rom.equals("X")) {

            return 10;

        }

        return -1;

    }

    public static int calculated (int num1, int num2, char operator) {

        int result=0 ;

        switch (operator) {

            case '+':

                result = num1 + num2;

                break;

            case '-':

                result = num1 - num2;

                break;

            case '*':

                result = num1 * num2;

                break;

            case '/':

                result = num1 / num2;


                break;


        }

        return result;

    }

}





