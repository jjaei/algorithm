import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();

        boolean bigO = true;

        for (int i = n0; i <= 100; i++) {
            if (a1 * i + a0 > c * i) {
                bigO = false;
                break;
            }
        }

        System.out.println(bigO ? 1 : 0);
    }
}