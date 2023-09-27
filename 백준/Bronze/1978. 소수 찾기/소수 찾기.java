import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean check = true;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            check = true;
            if (num <= 1) {
                check = false;
                continue;
            }
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                count++;
            }
        }

        System.out.println(count);
    }
}