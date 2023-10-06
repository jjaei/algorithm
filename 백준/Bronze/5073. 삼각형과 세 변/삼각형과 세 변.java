import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
            int max = Math.max(num1, Math.max(num2, num3));

            if (num1 == 0 && num2 == 0 && num3 == 0) {
                break;
            }

            if (max >= num1 + num2 + num3 - max) {
                System.out.println("Invalid");
            } else if (num1 == num2 && num2 == num3) {
                System.out.println("Equilateral");
            } else if (num1 == num2 || num2 == num3 || num1 == num3) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
        sc.close();
    }
}