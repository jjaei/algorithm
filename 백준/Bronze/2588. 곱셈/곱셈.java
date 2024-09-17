import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = 0;
        int num4 = num2;
        while (num2 > 0) {
            num3 = num2 % 10;
            System.out.println(num1 * num3);
            num2 = num2 / 10;
        }
        System.out.println(num1 * num4);
    }
}