package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Калькулятор к работе готов.Все введенные числа могут быть только в одной системе исчисления,римской либо арабской." +
                "Введите первое число(от 1 до 10 включительно),далее, через пробел, операцию('/' или '*' или '-' или '+') , и также через пробел" +
                " -второе число(от 1 до 10 включительно)");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String input = buffer.readLine();
        calc(input);
    }

    public static String calc(String input) {
        int result = 0;
        String[] substr;
        try {

            substr = input.split(" ");
            if (substr.length > 3)
                throw new Exception("Некорректное введение операндов");

            int operand1 = 0;
            int operand2 = 0;
            if (Objects.equals(substr[0], "I") || Objects.equals(substr[0], "II") || Objects.equals(substr[0], "III") || Objects.equals(substr[0],
                    "IV") || Objects.equals(substr[0], "V") || Objects.equals(substr[0], "VI") || Objects.equals(substr[0], "VII") ||
                    Objects.equals(substr[0], "VIII") || Objects.equals(substr[0], "IX") || Objects.equals(substr[0], "X")) {
                switch (substr[0]) {
                    case "I" -> operand1 = 1;
                    case "II" -> operand1 = 2;
                    case "III" -> operand1 = 3;
                    case "IV" -> operand1 = 4;
                    case "V" -> operand1 = 5;
                    case "VI" -> operand1 = 6;
                    case "VII" -> operand1 = 7;
                    case "VIII" -> operand1 = 8;
                    case "IX" -> operand1 = 9;
                    case "X" -> operand1 = 10;
                }
                switch (substr[2]) {
                    case "I" -> operand2 = 1;
                    case "II" -> operand2 = 2;
                    case "III" -> operand2 = 3;
                    case "IV" -> operand2 = 4;
                    case "V" -> operand2 = 5;
                    case "VI" -> operand2 = 6;
                    case "VII" -> operand2 = 7;
                    case "VIII" -> operand2 = 8;
                    case "IX" -> operand2 = 9;
                    case "X" -> operand2 = 10;
                }

            } else {
                operand1 = Integer.parseInt(substr[0]);
                operand2 = Integer.parseInt(substr[2]);
            }

            String operator = substr[1];

            if (operand1 > 10 || operand1 < 1 || operand2 > 10 || operand2 < 1)
                throw new Exception("Введенное число или числа выходят за пределы допустимого интервала от 1 до 10 ");
            result = switch (operator) {
                case "+" -> operand1 + operand2;
                case "*" -> operand1 * operand2;
                case "-" -> operand1 - operand2;
                case "/" -> operand1 / operand2;
                default -> throw new Exception("Некорректный оператор");
            };
            if (Objects.equals(substr[0], "I") || Objects.equals(substr[0], "II") || Objects.equals(substr[0], "III") || Objects.equals(substr[0],
                    "IV") || Objects.equals(substr[0], "V") || Objects.equals(substr[0], "VI") || Objects.equals(substr[0], "VII") ||
                    Objects.equals(substr[0], "VIII") || Objects.equals(substr[0], "IX") || Objects.equals(substr[0], "X")) {
                System.out.println(RomanNumber.toRoman(Integer.parseInt(String.valueOf(result))));
            } else {
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println("Неверный ввод данных,введите пожалуйста через пробел операнды в требуемом диапазоне от 1 до 10 либо только арабскими " +
                    "либо только римскими цифрами:" + e.getMessage());
            e.printStackTrace();
        }
        return String.valueOf(result);
    }
}

