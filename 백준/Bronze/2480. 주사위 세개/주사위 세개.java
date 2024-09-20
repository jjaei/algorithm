import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int money = 0;
        int[] dice = {a, b, c};
        Arrays.sort(dice);

        if (a == b && b == c) {
            money = 10000 + (dice[0] * 1000);
        } else if (a != b && b != c && a != c) {
            money = dice[2] * 100;
        } else {
            money = 1000 + (dice[1] * 100);
        }
        System.out.println(money);
    }
}