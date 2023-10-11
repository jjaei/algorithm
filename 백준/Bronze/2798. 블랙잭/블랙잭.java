import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        int[] card = new int[n];

        for (int i = 0; i < n; i++) {
            card[i] = sc.nextInt();
        }

        for (int i = 0; i < card.length; i++) {
            for (int j = i + 1; j < card.length; j++) {
                for (int k = j + 1; k < card.length; k++) {
                    int tempSum = card[i] + card[j] + card[k];
                    if (tempSum <= m && tempSum > sum) {
                        sum = tempSum;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}