package LearnJava111;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число 1");
        int num1 = scan.nextInt();
        System.out.println("Введите число 2");
        int num2 = scan.nextInt();
        int res1 = num1 + num2;
        int res2= num1 - num2;
        int res3 = num1 * num2;
        int res4 = num1 / num2;
        System.out.println("Результат: ");
        System.out.println(res1 + "\n" + res2 + "\n" + res3 + "\n" + res4);
    }

}
