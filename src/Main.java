import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int correctAnswers = 0;

        for (int i = 0; i < 5; i++) {
            int a = random.nextInt(9) + 2;
            int b = random.nextInt(9) + 2;

            System.out.print("Посчитай: " + a + " * " + b + " = ");
            int answer = scanner.nextInt();

            if (answer == a * b) {
                correctAnswers++;
                System.out.println("\u001B[32mПравильно\u001B[0m");
            } else {
                System.out.println("\u001B[31mОшибка\u001B[0m. Правильный ответ: " + (a * b));
            }
        }

        System.out.println("\nКоличество правильных ответов: " + correctAnswers);
        if (correctAnswers == 5) {
            System.out.println("Молодец!");
        } else if (correctAnswers >= 3) {
            System.out.println("Надо бы еще поучить.");
        } else {
            System.out.println("Срочно нужно учить таблицу умножения.");
        }
    }
}