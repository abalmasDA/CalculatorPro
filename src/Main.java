import java.util.Scanner;

/**
 * Створіть проект за допомогою IntelliJ IDEA. Створіть клас Calculator.
 * У тілі класу створіть чотири методи для арифметичних дій: (add – додавання, sub – віднімання, mul – множення, div – поділ).
 * Метод поділу повинен перевірити поділ на нуль, якщо перевірка не проходить, згенерувати виняток. Користувач вводить значення,
 * над якими хоче зробити операцію та вибрати саму операцію.
 * У разі виникнення помилок повинні викидатися винятки.
 */
public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CalculatorPro calculatorPro = new CalculatorPro();
        double operand1 = calculatorPro.getOperand(scanner.next());
        double operand2 = calculatorPro.getOperand(scanner.next());
        String operation = calculatorPro.getOperation(scanner.next());
        calculatorPro.calculation(operand1, operand2, operation);
        scanner.close();


    }
}
