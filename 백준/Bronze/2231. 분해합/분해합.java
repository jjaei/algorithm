import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean check = true;
        for (int i = 0; i < n; i++) {
            int num = i;
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum + i == n) {
                System.out.println(i);
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println(0);
        }
    }
}