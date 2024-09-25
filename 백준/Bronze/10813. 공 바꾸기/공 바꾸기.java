import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 바구니 갯수
        int m = sc.nextInt();  // 공을 바꿀 횟수
        int[] basket = new int[n];

        for (int i = 0; i < basket.length; i++) {
            basket[i] = i + 1;
        }

        for (int j = 0; j < m; j++) {
            // a와 b의 공을 교환한다.
            int a = sc.nextInt();
            int b = sc.nextInt();

            int tmp = basket[a - 1];
            basket[a - 1] = basket[b - 1];
            basket[b - 1] = tmp;
        }

        for (int k = 0; k < basket.length; k++) {
            System.out.print(basket[k] + " ");
        }
    }
}