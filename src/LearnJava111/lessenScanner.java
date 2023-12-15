package LearnJava111;
import java.util.Scanner;
public class lessenScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String username = scan.nextLine();
        System.out.println("Привет, " + username);
        System.out.print("Введите ваш возраст: ");
        int num1 = scan.nextInt();
        System.out.println("Age = " + num1);
        System.out.println("Good luck!");

    }
}
