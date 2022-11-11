import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();

        System.out.println((double) numberOne / numberTwo);
        System.out.println(numberOne * numberTwo);
        System.out.println(numberOne + numberTwo);
        System.out.println(numberOne - numberTwo);
    }
}
